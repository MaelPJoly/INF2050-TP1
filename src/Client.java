import java.util.HashMap;
import java.util.Map;

public class Client

{

private String nom;
private int genre;
private int age;
private boolean tabac;
private boolean cannabis;
private boolean alcool;





    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTabac() {
        return tabac;
    }

    public void setTabac(boolean tabac) {
        this.tabac = tabac;
    }

    public boolean isCannabis() {
        return cannabis;
    }

    public void setCannabis(boolean cannabis) {
        this.cannabis = cannabis;
    }

    public boolean isAlcool() {
        return alcool;
    }

    public void setAlcool(boolean alcool) {
        this.alcool = alcool;
    }

    public Client() {
    }

    public Client(String nom, int genre, int age, boolean tabac, boolean cannabis, boolean alcool) throws Exception {
        if (nom == null ) {
            throw new Exception ("Nom invalide");
        }
        if (genre < 0 ) {
            throw new Exception ("Nom invalide");
        }
        if (age < 0 ) {
            throw new Exception ("Nom invalide");
        }
            this.nom = nom;
        this.genre = genre;
        this.age = age;
        this.tabac = tabac;
        this.cannabis = cannabis;
        this.alcool = alcool;
    }


    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", genre=" + genre +
                ", age=" + age +
                ", tabac=" + tabac +
                ", cannabis=" + cannabis +
                ", alcool=" + alcool +
                '}';
    }
}
