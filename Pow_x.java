import java.util.Scanner;

public class Pow_x {
    public static void main(String[] args) {
        int puis =1;
        Scanner scanner = new Scanner (System.in);
        System.out.println("entrez le valeur :");
        int a = scanner.nextInt();
        System.out.println("entrez le puissance :");
        int p = scanner.nextInt();

        for(int i =1 ;i <= p;i++){
            puis *= a;
        }
        System.out.println("resultat :" + puis);

    }
}
