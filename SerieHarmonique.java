import java.util.Scanner;

public class SerieHarmonique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + 1.0 / i;
        }

        System.out.print("Serie Harmonique: " + s);
    }
}
