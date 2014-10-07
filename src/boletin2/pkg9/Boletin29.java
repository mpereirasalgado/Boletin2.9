
package boletin2.pkg9;

import java.util.Scanner;

/**@author Micael*/
public class Boletin29 
{
    public static void main(String[] args) 
    {
        int b100, b20, b5, m1;
        System.out.println("numero de billetes de 100€:");
        Scanner dato = new Scanner(System.in);
        b100=dato.nextInt();
        System.out.println("numero de billetes de 20€:");
        b20=dato.nextInt();
        System.out.println("numero de billetes de 5€:");
        b5=dato.nextInt();
        System.out.println("numero de monedas de 1€");
        m1=dato.nextInt();
        System.out.println("cantidad en euros: "+(b100*100+b20*20+b5*5+m1*1));
        
    }
    
}
