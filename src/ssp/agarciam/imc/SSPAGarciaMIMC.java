/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssp.agarciam.imc;

/**
 *
 * @author alumno
 */
public class SSPAGarciaMIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculdora IMC");
        //Paso 1. Declaración de varriables (identificadores)
        double w, l, imc;
        String eIMC;
        //Paso 2. Asignar valores a las variables.
        w= 67;
        l= 1.70;
        //Paso 3. Resolver el problema.
        imc= w / Math.pow (l,2);
        // 3.1 Evaluamos IMC.
        if (imc>25){
            eIMC= "Sobrepeso"
        }else if (imc<19){
           eIMC= "Desnutrición";
        } else {
           eIMC="Normal  ";
        }
        
        //Paso 4. Mostrar el resultado.
        System.out.println("Peso= " + w);
        System.out.println("Estatura= "+ l);
        System.out.println("IMC= " + imc);
        
    }
    
}
