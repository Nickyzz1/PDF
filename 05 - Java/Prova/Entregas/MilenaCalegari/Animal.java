package Prova;
//Questão 5. Defina o conceito de herança em linguagem de programação Java. Cite exemplos utilizando classes.

public class Animal {
    protected String nome;
    protected String cor;
    protected String raça;

    Animal(String nome, String cor, String raça){
        this.nome = nome;
        this.cor = cor;
        this.raça = raça;
    }

    //Para compreender o conceito de herança iremos criar uma classe pai variáveis que vão ser utilizadas pela classe filho
    //Como exemplo criei a classe Animal que poderá ter diferentes filhos de diferentes categorias, sendo Animal a classe base
}
