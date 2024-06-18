import Triangulo from "./Triangulo.js";
import Esfera from "./Esfera.js";
import Cilindro from "./Cilindro.js";

//Triângulo
let triangulo = new Triangulo();
//Área
triangulo.setAltura = 2;
triangulo.setBase = 4;
console.log("Area do Triângulo: " + triangulo.calcularArea());
//Perimetro
triangulo.setPrimeiroLado = 3;
triangulo.setSegundoLado = 4;
triangulo.setTerceiroLado = 5;
console.log("Perimetro do Triângulo: " + triangulo.calcularPerimetro());

//Esfera
let esfera = new Esfera();
//Área
esfera.setRaio = 4;
console.log("Area da Esfera: " + esfera.calcularArea());
//Volume
console.log("Volume da Esfera: " + esfera.calcularVolume());

//Cilindro
let cilindro = new Cilindro();
//Área
cilindro.setRaio = 3;
cilindro.setAltura = 4;
console.log("Area da Cilindro: " + cilindro.calcularArea());
//Volume
console.log("Volume da Cilindro: " + cilindro.calcularVolume());