public class Noeud {

    private String string;

    private Noeud suivant;

    public Noeud(String string, Noeud suivant){
        this.suivant = suivant;
        this.string = string;
    }

    public String getValeur(){
        return this.string;
    }

    public Noeud getSuivant(){
        return this.suivant;
    }
}
