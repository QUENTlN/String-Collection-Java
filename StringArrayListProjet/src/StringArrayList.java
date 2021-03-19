import java.util.Arrays;
import java.util.Iterator;

public class StringArrayList implements Iterable<String> {
    private String[] strings;
    private int size;

    public StringArrayList(){
        this.strings = new String[1];
        size = 0;
    }

    public boolean add(String s){
        ensureCapacity(size+1);
        strings[size] = s;
        size++;
        return true;
    }

    public void add(int index, String str) {
        ensureCapacity(index+1);
        if (index > size){
            System.arraycopy(strings, 0, strings, 0, index);
        }
        strings[index] = str;
        size = index+1;
    }

    public boolean contains(String s){
        for (int i = 0; i <= size; i++) {
            if (s.equals(strings[i])){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void ensureCapacity(int minCapacity){
        int currentSize = strings.length;
        if (minCapacity > currentSize){
            String[] newStrings = new String[Math.max(currentSize * 2, minCapacity)];
            System.arraycopy(strings, 0, newStrings, 0, size);
            strings = newStrings;
        }
    }

    public String get(int index){
        return strings[index];
    }

    public int indexOf(String str) {
        for (int i = 0; i < size; i++){
            if (str.equals(strings[i])){
                return i;
            }
        }
        return -1;
    }

    public String remove(int index){
        String str = strings[index];
        if (index != strings.length-1)
            System.arraycopy(strings, index + 1, strings, index, size - index);
        strings[size] = null;
        size--;
        return str;
    }

    public String set(int index, String element){
        String str = strings[index];
        strings[index] = element;
        return str;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        String[] tab = new String[size];
        System.arraycopy(strings, 0, tab, 0, size);
        return Arrays.toString(tab);
    }

    @Override
    public Iterator<String> iterator() {
        return new IteratorString(strings, size);
    }
}
