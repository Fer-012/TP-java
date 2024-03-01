import java.util.Locale;
import java.util.Scanner;

public class ScoreFunction {
    public static int score(double points, double tempsJeu) {
        int leScore = 0;
        if (tempsJeu != 0) {
            leScore = (int) (points / tempsJeu);
        }
        return leScore;
    }

    public static void main(String[] args) {
        Scanner valScanner = new Scanner(System.in).useLocale(Locale.US);
        double points = valScanner.nextDouble() ;
        double tempsJeu = valScanner.nextDouble();

        int finalScore = score(points, tempsJeu);
        System.out.println("Score: " + finalScore);
    }
}
