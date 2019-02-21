package aula13;

import javax.swing.JOptionPane;

public class Cachorro extends Lobo{
    
    
    @Override
    protected void emitirSom(){
        JOptionPane.showMessageDialog(null, "AU AU AU");
    }
    
    protected void reagir(String frase){
        if(frase.equals("Toma comida") || frase.equals("Olá")){
            JOptionPane.showMessageDialog(null, "Abanar e latir");
        }
        else{
            JOptionPane.showMessageDialog(null, "Rosnar");
        }
    }
    protected void reagir(int hora, int min){
        if(hora<12){
            JOptionPane.showMessageDialog(null,"Abanar");
        }
        else if(hora>=18){
            JOptionPane.showMessageDialog(null,"Ignorar");
        }
        else{
            JOptionPane.showMessageDialog(null,"Abanar e latir");
        }
        
    }
    protected void reagir(boolean dono){
        if(dono){
            JOptionPane.showMessageDialog(null,"Abanar");
        }
        else{
            JOptionPane.showMessageDialog(null,"Rosnar e Latir");
        }
    }
    protected void reagir(int idade, double peso){
       if(idade<5){
           if(idade<10){
               JOptionPane.showMessageDialog(null,"Abanar");
           }
           else{
               JOptionPane.showMessageDialog(null,"Latir");
           }
       } 
       else{
           if(peso<10){
               JOptionPane.showMessageDialog(null,"Rosnar");
           }
           else{
               JOptionPane.showMessageDialog(null,"Ignorar");
           }
       }
    }
}
