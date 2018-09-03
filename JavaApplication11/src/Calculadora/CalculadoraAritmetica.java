package Calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author LENOVO
 */
public class CalculadoraAritmetica {
    
 

   double operando1 = 0;
   double operando2=0;
   
   double suma() {
       double r;
       r=operando1 + operando2;
       return r;
   }
   
   
   double resta() {
       double r;
       r=operando1 - operando2;
       return r;
   }
   
  
   double division() {
       double r;
       r=operando1 / operando2;
       return r;
   }
   
   double multiplicacion() {
       double r;
       r=operando1 * operando2;
       return r;
   }
    }
    
