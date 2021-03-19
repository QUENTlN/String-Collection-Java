import java.util.Arrays;
import java.util.Iterator;

public class LinkedStringStack implements Iterable<String> {

    private Noeud premier = null;

    private int size = -1;

    public boolean empty() {
        return this.premier == null;
    }

    public String peek() {
        return premier.getValeur();
    }

    public String pop() {
        String str = this.premier.getValeur();
        this.premier = this.premier.getSuivant();
        size--;
        return str;
    }

    public String push(String string) {
        this.premier = new Noeud(string, this.premier);
        size++;
        return string;
    }

    @Override
    public String toString() {
        String[] strings = new String[this.size+1];
        int i = 0;
        Noeud noeud = this.premier;
        while (noeud != null){
            strings[i] = noeud.getValeur();
            noeud = noeud.getSuivant();
            i++;
        }
        return Arrays.toString(this.invert(strings));
    }

    private String[] invert(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    @Override
    public Iterator<String> iterator() {
        return new LinkedStringStackIterator(premier);
    }
}
