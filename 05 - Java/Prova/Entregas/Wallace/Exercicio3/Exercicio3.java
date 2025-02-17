
public class Exercicio3 {

    public Exercicio3(){}

    public boolean verificacaoParImpar(int num) throws Exception
    {
        if (num < 0) {
            throw new Exception("Erro, numero é menor que zero");
        }
        else
        {
            if (num%2 == 0) {
                return true;
            }
        }
        return false;
    }

}
