
public class rectangle {
    public static void main(String[] args) throws Exception {
        rectangle_cl r = new rectangle_cl(1.0, 2.0);
        
        System.out.println("Hauteur "+ r.getHauteur() +"Largeur "+ r.getLargeur());
    }
}

class rectangle_cl {
    double hauteur;
    double largeur;

    public rectangle_cl(double d, double e) {
        this.hauteur = d;
        this.largeur = e;
    }
    public double getHauteur() {
        return hauteur;
    }
    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }
    
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }

    

    
}
