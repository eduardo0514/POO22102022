/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cesar;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class Ventana extends JFrame implements ActionListener{
    
    JTextArea cuadrotexto1 = new JTextArea();
    JTextArea cuadrotexto2 = new JTextArea();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JTextField codigo = new JTextField();
    
    public Ventana() throws HeadlessException{
        this.setTitle("Codigo Cesar");
        this.setSize(800, 600);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        iniciarcomponentes();
        
       
    }
    
    private void iniciarcomponentes(){
        cuadrotexto1.setLineWrap(true);
        cuadrotexto1.setBounds(250,75,300,200);
        add(cuadrotexto1);
        
        cuadrotexto2.setBounds(250, 280, 300, 200);
        cuadrotexto2.setLineWrap(true);
        cuadrotexto2.setEditable(false);
        add(cuadrotexto2);
        
        b1.setText("Cifrar");
        b1.addActionListener(this);
        b1.setBounds( 275 ,0 , 100 , 20);
        add(b1);
        
        
        b2.setText("Descifrar");
        b2.addActionListener(this);
        b2.setBounds(375, 0, 100, 20);
        add(b2);
        
        setLayout(null);
        this.getContentPane().setBackground(Color.BLACK);
        
        codigo.setBounds(0, 0, 75, 25);
        add(codigo);
}
    @Override
    public void actionPerformed(ActionEvent e){
        if( e.getSource()== b1){
           Algoritmo a1 = new Algoritmo();
           a1.clave=Integer.parseInt(codigo.getText());
           a1.Encriptar(cuadrotexto1.getText());
           cuadrotexto2.setText(a1.EncriptedString);
        }
       
        if( e.getSource()== b2){
           Algoritmo a1 = new Algoritmo();
           a1.clave=Integer.parseInt(codigo.getText());
           a1.Desencriptar(cuadrotexto1.getText());
           cuadrotexto2.setText(a1.EncriptedString);
        }
        
    }
}
    
    

    
            
