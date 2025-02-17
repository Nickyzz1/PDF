package Ex8;

import java.util.Scanner;

public class Trem 
{
    protected VagaoEnum vagao;
    static Scanner scanner = new Scanner(System.in);
    public int vagoes = 0, countConteudo = 0, leituraVagoes = 0;
    public Vagao inicio, fim;
    public String conteudo;
    
    protected void Add(Vagao vagaoNovo)
    {
        if (inicio == null)
        {
            inicio = vagaoNovo;
            fim = vagaoNovo;
            vagoes++;
            return;
        }

        if (vagoes == 1)
        {
            inicio.setNext(vagaoNovo);
        }

        vagaoNovo.setPrev(fim);
        fim = vagaoNovo;
        vagoes ++;
    }

    protected void verTrem() throws ProgramError
    {
        int escolha = 1;
        Vagao vagaoAtual = inicio;

        while (leituraVagoes < vagoes || escolha != 0) 
        {
            
            if (leituraVagoes == 0)
            {
                conteudo = vagaoAtual.getConteudo();

                System.out.printf("O vagao %d possui como conteudo " + conteudo + "\n", leituraVagoes + 1);

                leituraVagoes ++;

                continue;
            } else {
                System.out.println("Ver proximo vagao?\n1 - Sim\n0 - Sair.");

                escolha = scanner.nextInt();

                if (escolha == 1)
                {
                    leituraVagoes ++;

                    vagaoAtual = vagaoAtual.getNext();

                    if (vagaoAtual == null) 
                    {
                        throw new ProgramError();
                    }

                    conteudo = vagaoAtual.getConteudo();

                    System.out.printf("O vagao %d possui como conteudo " + conteudo + "\n", leituraVagoes + 1);
                } else if (escolha == 0) {
                    System.out.println("Saindo da leitura de vagoes!");

                    break;
                }
            }
        }
    }

    protected int count(String valor)
    {
        countConteudo = 0;
        Vagao vagaoAtual = inicio;

        for (int i = 0; i < vagoes; i++)
        {
            if (vagaoAtual.getConteudo() == valor)
            {
                countConteudo ++;
            }

            vagaoAtual.getNext();
        }

        return countConteudo;
    }
}
