package aula13;

import javax.swing.JOptionPane;

public class Mamifero extends Animal{
    
    protected String corPelo;

    public Mamifero(String corPelo) {
        this.corPelo = corPelo;
    }
    public Mamifero() {
    }

    
    
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    

    @Override
    protected void emitirSom() {
        JOptionPane.showMessageDialog(null, "Som de mamifero");
    }
    
    
}
