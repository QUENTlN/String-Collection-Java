import java.util.Iterator;

public class StringIterator implements Iterator<String> {

    private Noeud noeud;

    public StringIterator(Noeud noeud){
        this.noeud = noeud;
    }

    @Override
    public boolean hasNext() {
        return this.noeud != null;
    }

    @Override
    public String next() {
        if (hasNext()) {
            Noeud noeud = this.noeud;
            this.noeud = noeud.getSuivant();
            return noeud.getValeur();
        }
        return null;
    }
}
