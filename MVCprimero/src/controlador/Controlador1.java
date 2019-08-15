/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Modelo;
import vista.Vista1;


/**
 *@author Camilo Alvarez
 * @author Hernan Hernandez
 * Controlador que contiene etiquetas para realizar las diferentes acciones 
 */
public class Controlador1 implements ActionListener, KeyListener, MouseListener {
    
    private Vista1 view;
    private Modelo model;

    /**
     * Constructor que inicia las diferentes acciones 
     * @param view
     * @param model 
     */
    public Controlador1(Vista1 view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.BSumar.addActionListener(this);
        this.view.Bmultiplicar.addActionListener(this);
        this.view.TN2.addKeyListener(this);
        this.view.TN1.addKeyListener(this);
        this.view.Tm1.addKeyListener(this);
        this.view.Tm2.addKeyListener(this);
        this.view.BSumar.addMouseListener(this);
       
        this.view.Bmultiplicar.addActionListener(this);
    }   
    
    /**
     * metodo que inicia la vista 
     */
    public void iniciar(){
    
    view.setTitle("MVC PRIMERO");
    view.setLocationRelativeTo(null);
    
    }    
    /**
     * Evento que se ejecuta al oprimir el boton 
     * @param e 
     */
    @Override
    public void actionPerformed (ActionEvent e){
   Object fuente = e.getSource();
   if (fuente==view.BSumar)
   {
    model.setNumero1(Integer.parseInt(view.TN1.getText()));
    model.setNumero2(Integer.parseInt(view.TN2.getText()));
    model.sumar();
    view.Tresultado.setText(String.valueOf(model.getResultado()));
   }
    
   if (fuente==view.Bmultiplicar)
   {
    model.setNumeroM1(Integer.parseInt(view.Tm1.getText()));
    model.setNumeroM2(Integer.parseInt(view.Tm2.getText()));
    model.multiplicar();
    view.Tr2.setText(String.valueOf(model.getResultadoM()));
   }      
    
    }
    /**
     * Evento que no deja escribir caracteres en un campo de texto
     * @param e 
     */
    @Override
    public void keyTyped(KeyEvent e) {
        
        char c= e.getKeyChar();
        if(c<'0'||c>'9') e.consume();
     }
    /**
     * Evento que muesta el resultado con un enter en un campo de texto 
     * @param e 
     */
    @Override
    public void keyPressed(KeyEvent e) {
    
        
     if (e.getKeyCode()==KeyEvent.VK_ENTER){
    
    model.setNumero1(Integer.parseInt(view.TN1.getText()));
    model.setNumero2(Integer.parseInt(view.TN2.getText()));
    model.sumar();
    view.Tresultado.setText(String.valueOf(model.getResultado())); 
    

     }
  
    }
    
    /**
     * eventos para realizar diferentes acciones
     * @param e 
     */
    @Override
    public void keyReleased(KeyEvent e) {
  
       
    }
      /**
     * eventos para realizar diferentes acciones
     * @param e 
     */
    @Override
    public void mouseClicked(MouseEvent e) {
    }

      /**
     * eventos para realizar diferentes acciones
     * @param e 
     */
    @Override
    public void mousePressed(MouseEvent e) {
    }
      /**
     * eventos para realizar diferentes acciones
     * @param e 
     */
    @Override
    public void mouseReleased(MouseEvent e) {
    }
      /**
     * evento que permite cambiar el color del boton al pasar el mouse
     * @param e 
     */
    @Override
    public void mouseEntered(MouseEvent e) {
         view.BSumar.setBackground(new Color(102,204,255));   
           
    }

      /**
     * evento que permite cambiar el color del boton
     * @param e 
     */
    @Override
    public void mouseExited(MouseEvent e) {
        view.BSumar.setBackground(Color.WHITE);
       // view.Bmultiplicar.setBackground(Color.WHITE);
    }
    
    
    
}
