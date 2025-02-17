import java.util.InputMismatchException;

class ErroMis extends InputMismatchException
{
    ErroMis() 
    {
        super("Erro Mismatch");
    }
}