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
 *
 * @author Hernan
 */
public class Controlador1 implements ActionListener, KeyListener, MouseListener {
    
    private Vista1 view;
    private Modelo model;

    public Controlador1(Vista1 view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.BSumar.addActionListener(this);
        this.view.TN2.addKeyListener(this);
        this.view.TN1.addKeyListener(this);
        this.view.BSumar.addMouseListener(this);

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
        
        char c= e.getKeyChar();
        if(c<'0'||c>'9') e.consume();
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

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         view.BSumar.setBackground(new Color(102,204,255));

        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        view.BSumar.setBackground(Color.WHITE);
    }
    
    
    
}
