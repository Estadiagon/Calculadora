
import static java.lang.Math.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class CalculadoraTrigonometrica {
    double angulo;
    
    void convertirangulo(double unangulo){
        angulo=Math.toRadians(unangulo);
       
    }
            
    double seno(){
        return sin(angulo);
    }
    
    double coseno(){
        return cos(angulo);
    }
    
    double tangente(){
        return tan(angulo);
    }

    
}
