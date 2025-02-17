package Ex5;

// Herança é quando uma clase filha herda os métodos e atributos da classe mãe

public class Personagem 
{
    protected int life = 10;
    protected int strenght = 2;
    protected int coins = 10;
    
    protected void morte()
    {
        if (life <= 10)
        {
            System.out.println("O personagem morreu!\n");
        }
    }

    public int getLife() {
        return life;
    }
    
    public void setLife(int life) {
        this.life = life;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
