/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraAritmetica;


/**
 *
 * @author LENOVO
 */
public class CalculadoraAritmetica {
    
 

   int operando1 = 0;
   int operando2=0;
   int suma() {
       int r;
       r=operando1 + operando2;
       return r;
   }
   
   
   int resta() {
       int r;
       r=operando1 - operando2;
       return r;
   }
   
  
   int division() {
       int r;
       r=operando1 / operando2;
       return r;
   }
   
   int multiplicacion() {
       int r;
       r=operando1 * operando2;
       return r;
   }
    }
    
