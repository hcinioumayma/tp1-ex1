public class Livre {
    private int id;
    private float prix;
    private String auteur;
    private String titre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Livre(int id, float prix, String auteur, String titre) {
        this.id = id;
        this.prix = prix;
        this.auteur = auteur;
        this.titre = titre;



    }

    public void tooString(){
        System.out.println("le id est"+id);
        System.out.println("le prix est"+prix);
        System.out.println("l'auteur est"+auteur);
        System.out.println("le prix est"+prix);
    }
}
