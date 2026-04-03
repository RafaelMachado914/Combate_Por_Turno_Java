
package br.com.formulariojson.sistemacombateturno;


public class Personagem {
    
    public int hp;

    public Personagem(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Personagem{" + "hp=" + hp + '}';
    }
   
    
    
    
}
