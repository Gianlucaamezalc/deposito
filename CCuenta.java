/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentas;

/**
 *
 * @author Gianlucca
 */
public class CCuenta {
/**@param nombre de tipo String indica el nombre del cliente.
 * @param cuenta de tipo String indica el numero de cuenta introducido por cliente.
 * @param saldo de tipo double para indicar el saldo que hay en la cuenta del cliente.
 * @param tipoInterés de tipo double para indicar el tipo de interés que se aplica en la cuenta.
 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() /**@see metodo vacio./*
     * 
     */
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        /** metodo con parametros.
         * 
         */
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo; /**@return saldo en cuenta
         * 
         */
    }

    public void ingresar(double cantidad) throws Exception 
            /**@exception Exception si ingresa un numero negativo.
             * 
             */
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        /** @exception Exception si intenta retirar cantidad negativa o no tiene saldo en cuenta.
         * 
         */
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
     /** encapsulamiento de atributos de la clase CCuenta.
      * 
      * @return nombre.
      
      * 
      */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta; /**@return cuenta
         * 
         */
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;  /**@return saldo.
         * 
         */
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés; /**@retrn tipoInterés.
         * 
         */
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}
