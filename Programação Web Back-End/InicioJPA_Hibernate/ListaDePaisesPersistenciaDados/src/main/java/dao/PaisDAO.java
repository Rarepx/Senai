package dao;

import model.Pais;
import util.LoggerUtil;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class PaisDAO {
	//EntityManagerFactory uma classe (central no contexnto do JPA) 
	//usada para interagir com bancos de dados, ela permite a criação 
	//de instâncias de EntityManager e fornece uma maneira eficiente 
	//de configurar e gerenciar a conexão com o banco de dados.
    private EntityManagerFactory produtorDeEntidades = Persistence.createEntityManagerFactory("exemplo-jpa");
   
    //EntityManager é usado para gerenciar entidades de banco 
    //de dados em um ambiente de persistência de dados.
    private EntityManager gerenciarEntidades;

    public PaisDAO() {
        gerenciarEntidades = produtorDeEntidades.createEntityManager();
    }

    public void adicionarPais(Pais pais) {
        gerenciarEntidades.getTransaction().begin(); //iniciar a transação
        gerenciarEntidades.persist(pais);
        gerenciarEntidades.getTransaction().commit();//confirmar as operações feitas
    }

    public boolean atualizarPais(Integer id, String nome, String capital) {
        Pais pais = buscarPaisPorId(id);

        gerenciarEntidades.getTransaction().begin();
        pais.setNome(nome);
        pais.setCapital(capital);
        gerenciarEntidades.getTransaction().commit();

        return true;
    }

    public Pais buscarPaisPorId(Integer id) {
        return gerenciarEntidades.find(Pais.class, id);
    }

    public Pais buscarPaisPorNome(String nome) {
        try {
            return gerenciarEntidades.createQuery("SELECT p FROM Pais p WHERE p.nome = :nome", Pais.class)
                    .setParameter("nome", nome).getSingleResult();
        } catch (NoResultException e) {
        	LoggerUtil.logError("Erro ao buscar pais: ", e);
        	throw new EntityNotFoundException("Pais nao encontrado com o nome: " + nome);
        }
    }

    public List<Pais> listarPaises() {
        try {
            return gerenciarEntidades.createQuery("SELECT p FROM Pais p ORDER BY p.nome", Pais.class)
                    .getResultList();
        }catch (NoResultException e) {
            throw new EntityNotFoundException("Nenhum pais encontrado.");
        } catch (Exception e) {
            LoggerUtil.logError("Erro ao listar pais: ", e);
            return new ArrayList<>(); // Retorna uma lista vazia em vez de null
    		//return null;
        } 
    }

    public boolean removerPais(Pais pais) {
        try {
            gerenciarEntidades.getTransaction().begin();
            pais = gerenciarEntidades.merge(pais);
            gerenciarEntidades.remove(pais);
            gerenciarEntidades.getTransaction().commit();
            return true;
        } catch (Exception e) {
        	LoggerUtil.logError("Erro ao remover pais: ", e);
            return false;
        }
    }
    
    public void fechar() {
        gerenciarEntidades.close();
        produtorDeEntidades.close();
    }
}
