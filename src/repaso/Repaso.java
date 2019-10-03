package repaso;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Repaso {
   
    public static void main(String[] args) {
        
        int numero1=10;
        int numero2=10;
            //Comparaciones
        String palabraUno="HolA";
        String palabraDos="Hola";
        //Comparacion tipo igualar
        boolean comparacionUno = palabraUno.equals(palabraDos);
        System.out.println(comparacionUno);
        
        //Comparacion tipo compareTo
        int comparacionDos = palabraUno.compareTo(palabraDos);
        System.out.println(comparacionDos);
        //pone todo a minusculas
        boolean comparacionTres = palabraUno.toLowerCase().equals(palabraDos.toLowerCase());
        System.out.println(comparacionTres);
        //ignora las mayusculas
        boolean comparacionDirecta=palabraUno.equalsIgnoreCase(palabraDos);
        System.out.println(comparacionDirecta);
        
        
        int numeroUno = 10;
        int numeroDos = 100;
        // && es el "y" logico
        boolean comparacion = numeroUno>0 && numeroDos<100; //true y false = false
        boolean comparacionCuatro = numeroUno<0 && numeroDos<100;   //false y true = false
        boolean comparacionCinco = numeroUno>0 && numeroDos<=100;   //true y true = true
        
        System.out.printf("La comparacion entre numeros es: %b\n",comparacion);
        // || es el "o" logico
        boolean comparacion0 = numeroUno>0 || numeroDos>100;    //true y false = true
        boolean comparacion0Uno = numeroUno<0 || numeroDos==100;   //false y true = true
        boolean comparacion0Dos = numeroUno>0 || numeroDos==100;   //true y true = true
        boolean comparacion0Tres = numeroUno<0 || numeroDos<100;    //false y false = false
        
        
        System.out.printf("La comparacion entre numeros es: %b\n",comparacion0);
        
                            //Comparacion Multiple
        
        int numeroCompararUno = 10;
        int numeroCompararDos = 20;
        
        String palabra0Uno="Ejemplo";
        String palabra0Dos="Otro Ejemplo";
        boolean comparacionMultiple = numeroCompararUno>numeroCompararDos 
                || palabra0Uno.equals(palabra0Dos) || numero1 != numero2;
        
        
        //EJEMPLO
        
        int n1=10,n2=20,n3=10;
        String p1="uno",p2="dos";
        boolean b1=true,b2=false;

        boolean salida = (((n1>0)&&(n2<5)&&(n3!=10))|| p1.equals(p2) || b2) &&b1;
                          //true   false     false
                                 //false             o    false      o false
                                                 //false                    y true
                                                               //false
        System.out.println(salida );
        
    }
}
