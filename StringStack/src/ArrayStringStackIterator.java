import java.util.Iterator;

public class ArrayStringStackIterator implements Iterator<String> {

    private String[] strings;

    private int currentIndex = 0;

    public ArrayStringStackIterator(String[] strings, int size) {
        this.currentIndex = size;
        this.strings = strings;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public String next() {
        return strings[currentIndex--];
    }
}
