/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar;

/**
 *
 * @author lenovo
 */
public class Algoritmo {
    public int clave;
    public String letras = "abcdefghijklmnñopqrstuvwxyz";
    
    public String EncriptedString = "";

    public Algoritmo() {
    }
    
    public void Encriptar(String frase) {
        String  frase2 = "";
        for (int  i = 0;  i < frase.length();  i++) {
            for (int j = 0; j < letras.length(); j++) {
                if (frase.charAt(i) == letras.charAt(j)) {
                    frase2 += letras.charAt((j+ clave)%letras.length());
                }
            }
            
            
        }
        frase = frase2;
        
        EncriptedString = frase;
    }
    
    
    public void Desencriptar(String frase){
        String frase2 = "";
        for (int  i = 0;  i < frase.length();  i++) { 
          for (int j = 0; j < letras.length(); j++) {
              if (frase.charAt(i) == letras.charAt(j)) {
                  frase2 += letras.charAt((j - clave)%letras.length());
                  
              }
          }  
        }
        frase = frase2;
        
        EncriptedString = frase;
        
    }
}
