import java.util.Iterator;

public class IteratorString implements Iterator<String> {

    private String[] strings;

    private int currentSize;

    private int currentIndex = 0;

    public IteratorString(String[] strings, int size){
        this.currentSize = size;
        this.currentIndex=0;
        this.strings = strings;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < currentSize && strings[currentIndex] != null;
    }

    @Override
    public String next() {
        return strings[currentIndex++];
    }
}
