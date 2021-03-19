import java.util.Iterator;

public class StringLinkedList implements Iterable<String> {

    private Noeud debut;

    public void add(String str) {
        if (debut == null) {
            debut = new Noeud(str, null);
        } else {
            Noeud unNoeud = debut;
            Noeud noeudPrecedent = null;
            while (unNoeud != null) {
                noeudPrecedent = unNoeud;
                unNoeud = unNoeud.getSuivant();
            }
            noeudPrecedent.setSuivant(new Noeud(str, null));
        }
    }

    public void addFirt(String str) {
        if (debut == null) {
            debut = new Noeud(str, null);
        } else {
            debut = new Noeud(str, debut);
        }
    }

    public void addlast(String str) {
        this.add(str);
    }

    public int size() {
        if (debut == null) {
            return 0;
        } else {
            Noeud unNoeud = debut.getSuivant();
            int i = 1;
            while (unNoeud != null) {
                unNoeud = unNoeud.getSuivant();
                i++;
            }
            return i;
        }
    }

    public boolean isEmpty() {
        return debut == null;
    }

    public void remove(String valeur) {
        if (debut.getValeur().equals(valeur)) {
            debut = debut.getSuivant();
        } else {
            Noeud unNoeud = debut.getSuivant();
            Noeud noeudPrecedent = unNoeud;
            while (unNoeud != null) {
                if (unNoeud.getValeur().equals(valeur)) {
                    noeudPrecedent.setSuivant(unNoeud.getSuivant());
                }
                noeudPrecedent = unNoeud;
                unNoeud = unNoeud.getSuivant();
            }
        }
    }

    public boolean contains(String valeur) {
        if (debut == null) {
            return false;
        } else {
            Noeud unNoeud = debut;
            while (unNoeud != null) {
                if (unNoeud.getValeur().equals(valeur)) return true;
                unNoeud = unNoeud.getSuivant();
            }
        }
        return false;
    }

    @Override
    public String toString() {
        Noeud p = debut;
        String s = "[";
        if (p != null) {
            s += p.getValeur();
            p = p.getSuivant();
            while (p != null) {
                s = s.concat(", " + p.getValeur());
                p = p.getSuivant();
            }
        }
        return s += "]";
    }

    @Override
    public Iterator<String> iterator() {
        return new StringIterator(debut);
    }
}