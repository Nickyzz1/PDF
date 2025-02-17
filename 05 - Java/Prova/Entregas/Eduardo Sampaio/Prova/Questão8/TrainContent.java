package Questão8;

public enum TrainContent {
    
    enum content {

        VAZIO{"Vazio"},
        COMBUSTIVEL{"Combustivel"},
        TRIGO{"Trigo"},
        ANIMAIS{"Animais"},
        PASSAGEIROS{"Passageiros"};
    }

    private String content;

    TrainContent(TrainContent content)
    {
        content = this.content;
    }

    public String getContent() {
        return content;
    }


    //n sei usar enum :(
}
