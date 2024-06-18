Padrão Bridge

O Padrão de Projeto Bridge é um padrão estrutural que separa a abstração das classes de sua implementação, permitindo que ambas possam ser modificadas independentemente. Em vez de ter uma implementação fixa, as abstrações usam uma interface de implementação que pode ser alterada em tempo de execução.

Neste contexto de meios de transporte, vamos fazer uma modificação para que Carro e Bicicleta sejam implementações de uma abstração Veiculo, e a ação de mover será a ponte entre a abstração e a implementação.

