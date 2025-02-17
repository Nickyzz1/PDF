package Prova.questao8;

public class Trem {
    private Vagao primeiroVagao;

    // Método para contar quantos vagões possuem um determinado conteúdo
    public int count(TrainContent conteudo) {
        int count = 0;
        Vagao vagaoAtual = primeiroVagao;
        while (vagaoAtual != null) {
            if (vagaoAtual.getConteudo() == conteudo) {
                count++;
            }
            vagaoAtual = vagaoAtual.getProximoVagao();
        }
        return count;
    }

    // Método para adicionar um vagão
    public void add(TrainContent conteudo) {
        Vagao novoVagao = new Vagao(conteudo);
        if (primeiroVagao == null) {
            primeiroVagao = novoVagao;
        } else {
            Vagao ultimoVagao = primeiroVagao;
            while (ultimoVagao.getProximoVagao() != null) {
                ultimoVagao = ultimoVagao.getProximoVagao();
            }
            ultimoVagao.setProximoVagao(novoVagao);
            novoVagao.setVagaoAnterior(ultimoVagao);
        }
    }
}
