package repaso;
/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Conversiones {
    
    public static void main(String[] args) {
        
        byte numeroByte = 56;
        System.out.printf("El valor del byte es: %d %n",numeroByte);
        //El tipo Byte va a pasar a ser tipo Long
        long numeroLong = (long)numeroByte;
        System.out.printf("El valor del byte es: %d %n",numeroLong);
        
        int numeroInt = 5;
        double numeroDouble = (double)numeroInt;
        System.out.printf("El valor del Integer es: %d %n",numeroInt);
        System.out.printf("El valor del Double es: %.2f %n",numeroDouble);
       
    }
}
