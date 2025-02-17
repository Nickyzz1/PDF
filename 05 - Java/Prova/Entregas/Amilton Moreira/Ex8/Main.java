package Ex8;

import java.util.Scanner;

public class Main 
{
    static Scanner scanner = new Scanner(System.in);
    static Trem tremDaAlegria = new Trem();
    static VagaoEnum Conteudo;

    public static void main(String[] args) 
    {
        Boolean fim = false;
        int escolhaConteudo = 0, count = 0;
        String conteudo;

        while (!fim) 
        {
            System.out.println("|--==================================--|");
            System.out.println("|--=====    TREM DA ALEGRIA     =====--|");
            System.out.println("|--=====  1 - Adicionar Vagao   =====--|");
            System.out.println("|--=====  2 - Pesquisar Vagoes  =====--|");
            System.out.println("|--=====  3 - Ver trem          =====--|");
            System.out.println("|--=====  0 - Sair              =====--|");
            System.out.println("|--==================================--|");

            System.out.println("O que voce gostaria de fazer?");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    Vagao vagao = new Vagao();

                    System.out.println("Qual sera o conteudo do vagao?\n1 - Vazio\n2 - Combustivel\n3 - Trigo\n4 - Animais\n5 - Passageiros.");
                    escolhaConteudo = scanner.nextInt();
    
                    switch (escolhaConteudo)
                    {
                        case 1:
        
                            Conteudo = VagaoEnum.A;
                            vagao.setConteudo(Conteudo.Conteudo);
                            break;
            
                        case 2:
                            Conteudo = VagaoEnum.B;
                            vagao.setConteudo(Conteudo.Conteudo);
                            break;
            
                        case 3:
                            Conteudo = VagaoEnum.C;
                            vagao.setConteudo(Conteudo.Conteudo);
                            break;
                            
                        case 4:
                            Conteudo = VagaoEnum.D;
                            vagao.setConteudo(Conteudo.Conteudo);
                            break;
                        
                        case 5:
                            Conteudo = VagaoEnum.E;
                            vagao.setConteudo(Conteudo.Conteudo);
                            break;
                    
                        default:
                            break;
                    }

                    tremDaAlegria.Add(vagao);
                    break;

                case 2:
                    
                    System.out.println("Qual conteudo voce quer pesquisar?\n1 - Vazio\n2 - Combustivel\n3 - Trigo\n4 - Animais\n5 - Passageiros.");
                    escolhaConteudo = scanner.nextInt();
    
                    switch (escolhaConteudo)
                    {
                        case 1:
                            Conteudo = VagaoEnum.A;
                            conteudo = Conteudo.Conteudo;
                            count = tremDaAlegria.count(conteudo);
                            break;
            
                        case 2:
                            Conteudo = VagaoEnum.B;
                            conteudo = Conteudo.Conteudo;
                            count = tremDaAlegria.count(conteudo);
                            break;
            
                        case 3:
                            Conteudo = VagaoEnum.C;
                            conteudo = Conteudo.Conteudo;
                            count = tremDaAlegria.count(conteudo);
                            break;
                            
                        case 4:
                            Conteudo = VagaoEnum.D;
                            conteudo = Conteudo.Conteudo;
                            count = tremDaAlegria.count(conteudo);
                            break;
                        
                        case 5:
                            Conteudo = VagaoEnum.E;
                            conteudo = Conteudo.Conteudo;
                            count = tremDaAlegria.count(conteudo);
                            break;
                    }

                    System.out.printf("Existem %d vagoes com o conteudo pesquisado!\n", count);
                    break;
                
                case 3:
                    tremDaAlegria.verTrem();
                    break;
                    
                case 0:
                    fim = true;
                    break;

                default:
                    break;
            }
        }
    }
}
