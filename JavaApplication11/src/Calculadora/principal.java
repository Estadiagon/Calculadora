package Calculadora;


import java.awt.BorderLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN RAMIREZ Y MARIA SOSA
 */
public class principal {
   public static void main(String[] args){
       
       
       Calculadora miCalculadora=new Calculadora();
       UltraCalculadora miUltra = new UltraCalculadora();
       
       
       miCalculadora.setLayout(new BorderLayout());
       miCalculadora.add(miUltra, BorderLayout.CENTER);
       
       miCalculadora.setVisible(true);
       
       
       
       
       
       /*
       
       
       
       Scanner miEscanner;
       miEscanner=new Scanner(System.in);
       
       int numero=miEscanner.nextInt();
       
       
       CalculadoraTrigonometrica miCalculadora=new CalculadoraTrigonometrica();
       
               miCalculadora.convertirangulo(numero);
               System.out.println(miCalculadora.seno());
               System.out.println(miCalculadora.coseno());
               System.out.println(miCalculadora.tangente());
         */      
   }
    }

