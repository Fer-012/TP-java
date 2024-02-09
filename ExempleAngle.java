import java.util.Scanner;

public class ExempleAngle {
    
    public static void main(String[] args) 
    { 
       Scanner scanner =new Scanner(System.in) ;
       System.out.println("Entrez un angle en degrees :" );
       double angleEnDegres = scanner.nextDouble();
       double angleEnRadians = Math.PI * angleEnDegres /180;
       System.out.println("Sa valeur en radians est :" + angleEnRadians );
       System.out.println("Son cosinus vaut :" + Math.cos (angleEnDegres) );
    }
}
