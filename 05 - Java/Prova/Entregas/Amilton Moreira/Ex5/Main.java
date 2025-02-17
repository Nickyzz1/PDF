package Ex5;

public class Main 
{
    public static void main(String[] args) 
    {
        /* Aqui podemos ver que as moedas do goblin serão iguais as moedas do personagem base, já que o goblin herda a variável da classe Personagem.
        Percebe-se também que em ambos os personagens abaixo o método "getcoins()" funciona normalmente, mesmo ele não sendo descrito na classe "Goblin"*/

        Personagem personagemBase = new Personagem();
        System.out.println("Moedas base dos personagens: " + personagemBase.getCoins());    
        Goblin goblin = new Goblin();
        System.out.println("Moedas do goblin: " + goblin.getCoins());
        
        /* Agora aqui, podemos ver a diferença entre a vida do personagemBase e a vida do goblin, que foi alterada na classe goblin.
        Com base nesses resultados, conseguimos perceber que uma classe que herda de outra classe consegue utilizar o que está na classe mãe ou
        alterar os valores para si mesmo */

        System.out.println("Vida base dos personagens: " + personagemBase.getLife());    
        System.out.println("Vida do goblin: " + goblin.getLife());
    }    
}
