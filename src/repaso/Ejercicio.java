package repaso;
/**
 *
 * @author Diego_Eloy DAM 1
 */
import java.util.Scanner;
public class Ejercicio {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime el Primer numero :");
        int numeroUno = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dime el Segundo numero :");
        int numeroDos = teclado.nextInt();
        teclado.nextLine();
        
                //SUMA Y RESTA
        int suma=numeroUno+numeroDos,resta=numeroUno-numeroDos;
        boolean suma0=suma>=0;
        boolean resta0=resta>=0;
        System.out.printf("La suma de los dos numero es positiva: %b %n",suma0);
        System.out.printf("La resta de los dos numero es positiva: %b %n",resta0);
        
                //MULTIPLO
        int multiplo=(numeroUno%numeroDos);
        boolean multiplo0=multiplo==0;
        System.out.printf("El %d es multiplo %d : %b %n",numeroUno,numeroDos,multiplo0);
        
                //MULTIPLICACION
        int multiplicaion=numeroUno*numeroDos;
        boolean multiplicacion0=multiplicaion>=100;
        System.out.printf("La multiplicacion de %d por %d tiene al menos 3 cifras: %b %n",numeroUno,numeroDos,multiplicacion0);
        
                //RESULTSDO DE LA COMPARION 
        boolean resultado=suma0==true && multiplo0==true && multiplicacion0==true;
        System.out.printf("Todas las condiciones se han cumplido: %b%n",resultado);
        
    }
}
