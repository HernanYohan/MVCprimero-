/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import modelo.Modelo;
import vista.Vista1;


/**
 *
 * @author Hernan
 */
public class Controlador1 implements ActionListener, KeyListener {
    
    private Vista1 view;
    private Modelo model;

    public Controlador1(Vista1 view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.BSumar.addActionListener(this);
        this.view.TN2.addKeyListener(this);
    }   
    
    public void iniciar(){
    
    view.setTitle("MVC PRIMERO");
    view.setLocationRelativeTo(null);
    
    }    
    
    public void actionPerformed (ActionEvent e){
    model.setNumero1(Integer.parseInt(view.TN1.getText()));
    model.setNumero2(Integer.parseInt(view.TN2.getText()));
    model.sumar();
    view.Tresultado.setText(String.valueOf(model.getResultado()));
    
    }

    @Override
    public void keyTyped(KeyEvent e) {
     }

    @Override
    
    public void keyPressed(KeyEvent e) {
    
     if (e.getKeyCode()==KeyEvent.VK_ENTER){
    
    model.setNumero1(Integer.parseInt(view.TN1.getText()));
    model.setNumero2(Integer.parseInt(view.TN2.getText()));
    model.sumar();
    view.Tresultado.setText(String.valueOf(model.getResultado())); 
     }
  
    }

    @Override
    public void keyReleased(KeyEvent e) {
  
       
    }
    
    
    
}