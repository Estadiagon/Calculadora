
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class principal {
   public static void main(String[] args){
       Scanner miEscanner;
       miEscanner=new Scanner(System.in);
       
       int numero=miEscanner.nextInt();
       
       
       CalculadoraTrigonometrica miCalculadora=new CalculadoraTrigonometrica();
       
               miCalculadora.convertirangulo(numero);
               System.out.println(miCalculadora.seno());
               System.out.println(miCalculadora.coseno());
               System.out.println(miCalculadora.tangente());
               
   }
    }

