package prova.questao8;

public enum TrainContent {

    String[] op = {"Vazio", "Combustivel", "Trigo", "Animais", "Passageiros"};
    
    String value;
    
    TrainContent(String value) {
        this.value = value;
    }
    
    public String getValue() {
        
        for (int i = 0; i < op.length; i++) {
            if(op[i] == value) {
                value = value;
            }
            else {
                value = null;
            }
        }
        
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public String[] getOp() {
        return op;
    }
    
    public void setOp(String[] op) {
        this.op = op;
    }
}
