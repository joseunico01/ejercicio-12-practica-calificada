
package ejer12;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ejer12 {

    public static void main(String[] args) {
        
        int notas,c_notas,s_notas=0;
        float promedio_a,promedio_b,resta;
        
        c_notas=Integer.parseInt(JOptionPane.showInputDialog("Digite cuantas notas va a ingresar: "));
        
        float arreglo[]=new float[c_notas];
        
        for(int i=0;i<c_notas;i++){
            arreglo[i]=Float.parseFloat(JOptionPane.showInputDialog((i)+". Digite la nota: "));
            s_notas+=arreglo[i];
        }
        
        
        resta=(s_notas+arreglo[c_notas-1])-(arreglo[0]);
        promedio_a=s_notas/c_notas;
        promedio_b=resta/c_notas;
        
        
        JOptionPane.showMessageDialog(null ,"1er promedio: "+String.format("%.2f",promedio_a)+"\n"+
                                            "2do promedio(aca le efectuamos la opracion solicitada): "+String.format("%.2f",promedio_b));
        
        
        
        
        
    }     
    }
    

