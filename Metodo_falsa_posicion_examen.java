/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_falsa_posicion_examen;

import java.util.Scanner;

/**
 *
 * @author gabya
 */
public class Metodo_falsa_posicion_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int iteracion=0;
        
        double a,b,tol,m=0,ma,fafb,e;
        
        System.out.println("ingrese el valor de a: ");
        a=entrada.nextDouble();
        
        System.out.println("ingrese el valor de b: ");
        b=entrada.nextDouble();
        
        System.out.println("ingrese la tolerancia: ");
        tol=entrada.nextDouble();
        
        if (((a*a*a)-3*(a)+1)* ((b*b*b)-3*(a)+1)>0)
            
            System.out.print("no hay raiz");
        
        else{
            System.out.println("calcule la raiz");
            
            
            do{
                iteracion++;
                
                ma=m;
                System.out.println("ma: "+ma);
                
                m=(a-(((a*a*a)-3*(a)+1)*(b-a))/ (((b*b*b)-3*(a)+1)- ((a*a*a)-3*(a)+1)));
                
                System.out.println("m: "+m);
                
                e=(m-ma)/m;
                 
                if(e<0)
                    
                    e=-e;
                System.out.println("e: "+e);
                
                fafb=(((a*a*a)-3*(a)+1)*((m*m*m)-3*(a)+1));
                System.out.println("fafb: "+fafb);
                
                if(fafb<0)
                    
                    b=m;
                else
                    if(fafb>0)
                            a=m;
                
                System.out.print("iteracion             raiz             e"+"");
                System.out.print(+iteracion);
                System.out.print("                      "+m);
                System.out.print("                       "+e); 
            
            }while(e>tol);
        }
        
    }
    
}
