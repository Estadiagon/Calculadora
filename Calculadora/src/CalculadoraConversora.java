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
     
    void ConvertirGramos(double Peso){
        Gramos= Peso/(1000);
       
    }
    void ConvertirKilogramos(double Peso) {
       Kilogramos= Peso*(1000);
       
   }
    
    void ConvertirCm(double Longitud){
        Cm= Longitud*(100);
       
    }
    
    
   void ConvertirM(double Longitud){
        M= Longitud/(100);
       
    }
   
   void ConvertirGcentigrados(double Temperatura){
        Gfarenheit= Temperatura*(1.8000)+(32.00);
       
    }
   
    void ConvertirGfarenheit(double Temperatura){
        Gcentigrados= (Temperatura-(32.00))/(1.8000);
       
    }
     
    
}
