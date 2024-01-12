/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelomatematico;

/**
 *
 * @author Admin
 */
public class ModeloMatematico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numeros[][],i,j;
    numeros = new int[4][4]; 
    String number[][];
    number = new String[4][4];

    //Desplegar vector
    


    for (i=0;i<4;i++)
    {   
        numeros[i][0] = i+1;
        numeros[i][1] = (100 + (int)(Math.random()*9999));
        numeros[i][2]=(numeros[i][1]*numeros[i][1]);
        number[i][0]=String.valueOf(numeros[i][2]);
        
        String sSubCadena = number[i][0].substring(2,6);
        
double cero=0;
        cero=(Double.parseDouble(sSubCadena)/10000);
         
         
        System.out.print(numeros[i][0] + " " + numeros[i][1] + " " + numeros[i][2] 
                + " " + sSubCadena + " "+ cero);
        
        System.out.println();

        
    }

   }


    }


