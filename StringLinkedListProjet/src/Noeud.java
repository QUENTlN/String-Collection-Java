public class Noeud {
    private String valeur;
    private Noeud suivant;

    public Noeud(String _donnee, Noeud _suivant) {
        this.valeur = _donnee;
        this.suivant = _suivant;
    }

    public Noeud getSuivant() {
        return suivant;
    }
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }
    public String getValeur() {
        return valeur;
    }
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }
}