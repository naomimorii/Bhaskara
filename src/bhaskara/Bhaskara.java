/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhaskara;

/**
 *
 * @author naomi
 */
import java.util.Scanner;
public class Bhaskara {

    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       double a, b, c, x1, x2, delta;
       
       System.out.print("Digite os valores de A, B e C para Ax²+Bx+C \n");
       System.out.print ("A: ");
       a = entrada.nextDouble();
       
       System.out.print ("B: ");
       b = entrada.nextDouble();
       
       System.out.print("C: ");
       c = entrada.nextDouble();
       
       if (a!=0)
        {
          delta = (Math.pow(b, 2.0f)) - (4.0f * a * c);
          if (delta > 0)
           {
               x1 = ((-b) +  Math.sqrt(delta)) / (2.0f * a);
               x2 = ((-b) - Math.sqrt(delta)) / (2.0f * a);
               System.out.print("Os valores de X são: "+ x1 + " e " + x2 +"\n");
           }
          else
          {
          if (delta == 0)
           {                
               x1 = (-b)/(2.0f * a);
               System.out.print("O valor de X é: " + x1 +"\n");
            }
          else
            {
                if (delta < 0)
                System.out.print("A equação não possui valores reais \n");
            }
          }
        }
        
    }
    
}
