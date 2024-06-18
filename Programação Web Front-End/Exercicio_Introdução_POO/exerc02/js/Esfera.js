export default class Esfera{
    #raio;

    // Setters and Getters
    set setRaio(raio){
        this.#raio = raio;
    }
    get getRaio(){
        return this.#raio;
    }

    //calcular área
    calcularArea(){
        let area = 0;
        area = (4 * (Math.PI * (this.#raio * this.#raio)));
        return area.toFixed(2);
    }
    //calcular volume
    calcularVolume(){
        let volume = 0;
        volume = ((4/3) * (Math.PI * (Math.pow(this.#raio,3))));
        return volume.toFixed(2);
    }

    toString(){
        return `Esfera \n
        Raio: ${this.#raio}`
    }
}