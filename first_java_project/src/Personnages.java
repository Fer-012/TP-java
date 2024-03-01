public class Personnages {
    public static void main(String[] args) {
        Personnage p = new Personnage("Nom", 100, 50);
        System.out.println(p.getNom()+p.getDureeVie()+p.getEnergie()); // Affiche : Nom (100/50)
    }
}

class Personnage {

    String nom;
    int energie;
    int dureeVie;

    public Personnage(String nom, int energie, int dureeVie) {
        this.nom = nom;
        this.energie = energie;
        this.dureeVie = dureeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public int getDureeVie() {
        return dureeVie;
    }

    public void setDureeVie(int dureeVie) {
        this.dureeVie = dureeVie;
    }

    @Override
    public String toString() {
        return "Voler [nom=" + nom + ", energie=" + energie + ", dureeVie=" + dureeVie + "]";
    }

}

class Voleur extends Personnage {

    public Voleur(String nom, int energie, int dureeVie) {
        super(nom, energie, dureeVie);
        // TODO Auto-generated constructor stub
    }

}

class Magicien extends Personnage {
    Baguette baguette;

    public Magicien(String nom, int energie, int dureeVie, Baguette baguette) {
        super(nom, energie, dureeVie);
        this.baguette = baguette;
    }

    @Override
    public String toString() {
        return "Magicien [baguette=" + baguette + "]";
    }

}

class Sorcier extends Magicien {
    Baton baton;

    public Sorcier(String nom, int energie, int dureeVie, Baguette baguette, Baton baton) {
        super(nom, energie, dureeVie, baguette);
        this.baton = baton;
    }

}

class Guerrier extends Personnage {
    Arme arme;

    public Guerrier(String nom, int energie, int dureeVie, Arme arme) {
        super(nom, energie, dureeVie);
        this.arme = arme;
    }

    @Override
    public String toString() {
        return "Guerrier [arme=" + arme + "]";
    }
}

class Arme {
    //
}

class Baguette {
    //
}

class Baton {
    //
}

