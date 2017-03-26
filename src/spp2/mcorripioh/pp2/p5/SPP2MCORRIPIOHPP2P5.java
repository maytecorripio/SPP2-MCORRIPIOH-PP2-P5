/*
Orianna Linette Virgen Mar       A01411515
María Teresa Corripio Herrera  A01410393
Rafael Alejandro Cisneros Gual A01410038
Leticia Vianey Narváez Reyes     A01410432
Ana Martha Alanis Cortaza        A01411418
*/
package spp2.mcorripioh.pp2.p5;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHPP2P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamano=solicitarEntero("el tamano del arreglo: ");
        
        int[][] arreglo=crearMatriz("A",tamano);
        sumarFila(arreglo);
        
    }
    public static int solicitarEntero(String mensaje){
        Scanner kb= new Scanner(System.in);
        int n=0;
        boolean flag;
        
        do{
            System.out.println("Introduzca el valor de "+mensaje);
            try{
                n=kb.nextInt();
                flag=false;
            }catch (Exception ex){
                System.out.println("Su valor es incorrecto, introduzca otro nuevamente");
                flag=true;
                kb.nextLine();
            }
        }while(flag);
        return n;
    }
    public static int[][] crearMatriz(String mensaje, int tamano){
        System.out.println("\nIntroduzca el contenido de la matriz "+mensaje);
        int[][]arreglo= new int[tamano][tamano];
        System.out.println("Tamaño de la matriz: "+arreglo.length);
        for(int i=0; i<arreglo.length;i++){
            for(int j=0; j<arreglo.length;j++){
                arreglo[i][j]=solicitarEntero("el valor ("+i+","+j+"): ");
            }
        }return arreglo;
    }
    public static void sumarFila(int[][]arreglo){
        int sumaFila;
        int[][]a=new int[arreglo.length][arreglo.length];
        for(int i=0; i<arreglo.length;i++){
            sumaFila=0;
            for(int j=0;j<arreglo[i].length;j++){
                sumaFila=sumaFila+arreglo[i][j];
            }
        System.out.println("La suma de la fila es "+(i+1)+" es: "+sumaFila);
        }
    System.out.println("");
    }
    
}
