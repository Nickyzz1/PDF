package Exer_8;

public enum TrainContent{
    Empity(1),Combus(2),Trigo(3),Animais(4),Passageiros(5);

    private int i;
    

   

    TrainContent(int j) {
        this.i = j;
    }




    int getContend(){
        return i;
    }
}
