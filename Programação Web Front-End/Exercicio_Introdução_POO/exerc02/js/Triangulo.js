export default class Triangulo{
    #base;
    #altura;
    #primeiroLado;
    #segundoLado;
    #terceiroLado;

    // Setters and Getters
    set setBase(base){
        this.#base = base;
    }
    get getBase(){
        return this.#base;
    }

    set setAltura(altura){
        this.#altura = altura;
    }
    get getAltura(){
        return this.#altura;
    }

    //gets e sets Lados do Triângulo
    set setPrimeiroLado(primeiroLado){
        this.#primeiroLado = primeiroLado;
    }
    get getPrimeiroLado(){
        return this.#primeiroLado;
    }
    
    set setSegundoLado(segundoLado){
        this.#segundoLado = segundoLado;
    }
    get getSegundoLado(){
        return this.#segundoLado;
    }

    set setTerceiroLado(terceiroLado){
        this.#terceiroLado = terceiroLado;
    }
    get getTerceiroLado(){
        return this.#terceiroLado;
    }
    
    //calcular perimetro
    calcularPerimetro(){
        let perimetro = 0;
        perimetro = (this.#primeiroLado + this.#segundoLado + this.#terceiroLado);
        return perimetro.toFixed(2);
    }

    //calcular Área
    calcularArea(){
        let area = 0;
        area = ((this.#base * this.#altura)/2)
        return area.toFixed(2);
    }

    toString(){
        return `Triângulo \n
        Base: ${this.#base} \n
        Altura: ${this.#altura} \n
        Lado 1: ${this.#primeiroLado} \n
        Lado 2: ${this.#segundoLado} \n
        Lado 3: ${this.#terceiroLado}`
    }
}