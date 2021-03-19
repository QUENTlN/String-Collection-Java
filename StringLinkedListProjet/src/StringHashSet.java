import java.util.Iterator;

public class StringHashSet {

    private StringLinkedList[] stringsLinkedList;
    int size;
    private float c0 = 10;

    public StringHashSet(){
        this.stringsLinkedList = new StringLinkedList[15];
        this.size = 0;
        this.initialize();
    }

    public StringHashSet(int initialCapacity) {
        this.stringsLinkedList = new StringLinkedList[initialCapacity];
        this.size = 0;
        this.initialize();
    }

    public void initialize() {
        for(int i = 0; i<stringsLinkedList.length; i++) {
            stringsLinkedList[i] = new StringLinkedList();
        }
    }

    public void check() {
        if((size / stringsLinkedList.length)<c0) {
            return;
        }
        StringLinkedList[] newStringsLinkedList = new StringLinkedList[this.stringsLinkedList.length * 2];
        for(int i = 0; i<newStringsLinkedList.length; i++) {
            newStringsLinkedList[i] = new StringLinkedList();
            for(String s : stringsLinkedList[i]) {
                int hashcode = hashFunction(s.hashCode()) % newStringsLinkedList.length;
                newStringsLinkedList[i].add(s);
            }
        }
        this.stringsLinkedList = newStringsLinkedList;
    }

    public boolean add(String s) {
        int hashcode = hashFunction(s.hashCode()) % this.stringsLinkedList.length;
        if(stringsLinkedList[hashcode].contains(s)) {
            return false;
        }
        stringsLinkedList[hashcode].add(s);
        size++;
        this.check();
        return true;
    }

    private int hashFunction(int hashCode) {

        int index = hashCode;
        if (index < 0) {
            index = -index;
        }
        return index % stringsLinkedList.length;
    }


    public void clear() {
        this.initialize();
    }

    public boolean contains(String s) {
        for(int i = 0; i<stringsLinkedList.length; i++) {
            if(stringsLinkedList[i].contains(s)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        for(int i = 0; i<stringsLinkedList.length; i++) {
            if(!stringsLinkedList[i].isEmpty()) {
                return false;
            }
        }
        return true;
    }

//    public Iterator<String> iterator(){
//
//    }

    public boolean remove(String s) {
        for(int i = 0; i<this.stringsLinkedList.length; i++) {
            if(this.stringsLinkedList[i].contains(s)) {
                this.stringsLinkedList[i].remove(s);
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringLinkedList courant = null;
        StringBuffer sb = new StringBuffer();

        for (int i=0; i < this.stringsLinkedList.length; i++) {
            if (stringsLinkedList[i] != null) {
                courant = stringsLinkedList[i];
                sb.append("[" + i + "]");
                for(String s : courant) {
                    sb.append(" -> " + s);
                }
                sb.append('\n');
            }
        }

        return sb.toString();
    }

    public int size() {
        return this.size;
    }
}
