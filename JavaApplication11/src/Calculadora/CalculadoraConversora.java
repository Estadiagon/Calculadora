package Calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class CalculadoraConversora {
    
    double Gramos=0;
    double Kilogramos=0;
    double Cm=0;
    double M=0;
    double Gcentigrados=0;
    double Gfarenheit=0;
    double Peso;
    double Longitud;
    double Temperatura;
    
    double ConvertirGramos(){
        Gramos = Peso*(1000);
        return Gramos;
       
    }
    double ConvertirKilogramos(double Peso) {
       Kilogramos = Peso/(1000);
        return Kilogramos;
       
   }
    
    double ConvertirCm(double Longitud){
        Cm = Longitud*(100);
        return Cm;
       
    }
    
    
   double ConvertirM(double Longitud){
        M = Longitud/(100);
        return M;
       
    }
   
   double ConvertirGcentigrados(double Temperatura){
        Gfarenheit = (Temperatura-(32.00))/(1.8000);
        return Gfarenheit;
       
    }
   
    double ConvertirGfarenheit(double Temperatura){
        Gcentigrados = Temperatura*(1.8000)+(32.00);
        return Gcentigrados;
       
    }
     
    
}
