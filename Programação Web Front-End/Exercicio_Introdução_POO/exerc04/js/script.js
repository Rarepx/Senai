import Pessoa from "./Pessoa.js";
import Endereco from "./Endereco.js";

let endereco = new Endereco("São Carlos", "Centro", "Av. 7 de Setembro ", "13545-980", "SP", "Brasil");
//console.log(endereco.toString());

let pessoa = new Pessoa("Carlos da Silva", 18, "21008896630", endereco);
console.log(pessoa.toString());