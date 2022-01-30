/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentas;

/**
 *
 * @author Gianlucca
 */
public class Main {

    public static void main(String[] args) {  /**@see metodo main.
     * 
     */
        operativa_cuenta();
    
 } 

    private static void operativa_cuenta() {  /**@see metodo que engloba sentencias que de la clase Main del objeto cuenta1.
     * @param cuenta1 que hace referencia al objeto creado.
     * @param saldoActual de tipo double, que indica el saldo actual de la cuenta
     * @paramcantidad de tipo float que indica la cantidad a ingresar.
     * 
     */
        CCuenta cuenta1;
        double saldoActual;
        float cantidad;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    /**@exception e al fallar ingreso de dinero.
     * 
     */
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    } 
}
