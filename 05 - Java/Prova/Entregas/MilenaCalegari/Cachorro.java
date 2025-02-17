package Prova;

public class Cachorro extends Animal {

    Cachorro(String nome, String cor, String raça) {
        super(nome, cor, raça);
        this.nome = "Bolinha";
        this.cor = "Caramelo";
        this.raça = "Vira - lata";
        //TODO Auto-generated constructor stub
    }
   

    //Com a classe Animal criada foi criado tasmbém a classe Cachorro que herda de Animal pois Cachorro é um animal,
    // e possui todas as classificações da classe Animal
    //Com heraça é possível criar uma classe pai e diferentes filhos.
    //Poderia ser criado uma classe Gato que também herdaria de animal mas não serial igual ao cachorro pois são bichos diferentes
}
