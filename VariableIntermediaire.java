import java.util.Scanner;

/**
 * VariableIntermediaire
 */
public class VariableIntermediaire {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enterr une valeur pour a");
        int a = keyb.nextInt();
        System.out.println("Enterr une valeur pour b");
        int b = keyb.nextInt();

        int aux = a;
        a = b;
        b = aux;

        System.out.println("valeur de a " + a);
        System.out.println("valeur de a " + b);

    }
}