/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *@author Camilo Alvarez
 * @author Hernan Hernandez
 */
public class Modelo {
    //1 Numero que va a ser s2umado 
    private int numero1;
    // Numero que va a ser sumado 
    private int numero2;
    //guarda la respuesta de la suma  
    private int resultado;

    //1 Numero que va a ser multiplicado 
    private int numeroM1;
    //2 Numero que va a ser multiplicado 
    private int numeroM2;
    //guarda la respuesta de la multiplicacion
    private int resultadoM;
    
    /**
     * Metodo que hace la operacion de multiplicar
     * @return resultadoM
     */
    public int multiplicar(){
    this.resultadoM=this.numeroM1*this.numeroM2;
    return this.resultadoM;
    }
    
    /**
     *  Metodo que hace la operacion de sumar
     * @return resultado
     */
    public int sumar(){
        
    this.resultado = this.numero1+this.numero2;
    return this.resultado;
    
    } 
    
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */

    public int getNumero1() {
        return numero1;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public int getNumero2() {
        return numero2;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
     /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public int getResultado() {
        return resultado;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
     /**
     * Metodo que convierte la variable en publica con seguridad 
     */
        public int getNumeroM1() {
        return numeroM1;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public void setNumeroM1(int numeroM1) {
        this.numeroM1 = numeroM1;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public int getNumeroM2() {
        return numeroM2;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public void setNumeroM2(int numeroM2) {
        this.numeroM2 = numeroM2;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public int getResultadoM() {
        return resultadoM;
    }
    /**
     * Metodo que convierte la variable en publica con seguridad 
     */
    public void setResultadoM(int resultadoM) {
        this.resultadoM = resultadoM;
    }
}
