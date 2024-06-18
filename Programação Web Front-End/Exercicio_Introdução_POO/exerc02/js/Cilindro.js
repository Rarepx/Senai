export default class Cilindro{
    #raio;
    #altura;

    // Setters and Getters
    set setRaio(raio){
        this.#raio = raio;
    }
    get getRaio(){
        return this.#raio;
    }

    set setAltura(altura){
        this.#altura = altura;
    }
    get getAltura(){
        return this.#altura;
    }

    //calcular área
    calcularArea(){
        let area = 0;
        area = ((2*Math.PI*this.#raio)*(this.#raio + this.#altura));
        return area.toFixed(2);
    }

    //calcular volume
    calcularVolume(){
        let volume = 0;
        volume = ((Math.PI*(this.#raio * this.#raio))*this.#altura);
        return volume.toFixed(2);
    }

    toString(){
        return `Cilindro \n
        Raio: ${this.#raio} \n
        Altura: ${this.#altura}`
    }
}