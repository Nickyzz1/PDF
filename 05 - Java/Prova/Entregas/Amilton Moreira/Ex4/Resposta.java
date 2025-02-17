/* Encapsulamento é a forma em que deixamos visíveis e utilizáveis as variáveis
Por exemplo: */

package Ex4;

public class Resposta 
{
    @SuppressWarnings("unused")
    private int num1 = 0; // Aqui a variável é privada, só essa classe consegue alterar a variável. Caso alguma outra classe herde a classe "Resposta", não irá receber num1 como atributo
    protected int num2 = 0; // Aqui a variável é visivel para classes que herdarem a classe "Resposta". As classes que herdarem também receberão o "num2". Para alterar é necessário Get e Set
    public int num3 = 0; // Essa variável não precisa de Get e Set para ser alterada ou visualizada.
}

