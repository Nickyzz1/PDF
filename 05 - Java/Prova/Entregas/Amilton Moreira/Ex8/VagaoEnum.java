package Ex8;

public enum VagaoEnum 
{
    A("vazio"), B("Combustivel"), C("Trigo"), D("Animais"), E("Passageiros");

    public String Conteudo;
    
    VagaoEnum(String valor)
    {
        Conteudo = valor;
    }
}
