import java.util.Arrays;
import java.util.Iterator;

public class ArrayStringStack implements Iterable<String>{

    private String[] strings = new String[16];

    private int size = 0;

    public ArrayStringStack(){
    }

    public boolean empty(){
        return size == 0;
    }

    public String peek(){
        return this.strings[this.size-1];
    }

    public String pop(){
        String str = this.strings[--this.size];
        this.strings[this.size] = null;
        return str;
    }

    public void ensureCapacity(int minCapacity){
        int currentSize = strings.length;
        if (minCapacity > currentSize){
            String[] newStrings = new String[Math.max(currentSize * 2, minCapacity)];
            System.arraycopy(strings, 0, newStrings, 0, size);
            strings = newStrings;
        }
    }

    public String push(String item){
        ensureCapacity(size+1);
        return this.strings[this.size++] = item;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i<size; i++){
            str.append(this.strings[i]);
            if (i != size-1){
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }

    @Override
    public Iterator<String> iterator() {
        return new ArrayStringStackIterator(this.strings, this.size-1);
    }
}
