public class Main {
    public static void main(String[] args) {
        Train train = new Train();

        train.add(Conteudo.COMBUSTIVEL);
        train.add(Conteudo.ANIMAIS);
        train.add(Conteudo.PASSAGEIROS);
        train.add(Conteudo.COMBUSTIVEL);
        train.add(Conteudo.COMBUSTIVEL);
        train.add(Conteudo.COMBUSTIVEL);
        train.add(Conteudo.COMBUSTIVEL);
        train.add(Conteudo.COMBUSTIVEL);
        train.add(Conteudo.COMBUSTIVEL);
        System.out.println(train.count(Conteudo.COMBUSTIVEL));





    }
}
