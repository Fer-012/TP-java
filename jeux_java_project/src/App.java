public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Personne {
    String nom;
    int energie;
    int dureeVie;
    public int getDureeVie() {
        return dureeVie;
    }
    public void setDureeVie(int dureeVie) {
        this.dureeVie = dureeVie;
    }
    
    public int getEnergie() {
        return energie;
    }
    public void setEnergie(int energie) {
        this.energie = energie;
    }
    
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Personne(String nom, int energie, int dureeVie) {
        this.nom = nom;
        this.energie = energie;
        this.dureeVie = dureeVie;
    }

    @Override
    public String toString() {
        return "Personne [nom=" + nom + ", energie=" + energie + ", dureeVie=" + dureeVie + "]";
    }
    
    
}