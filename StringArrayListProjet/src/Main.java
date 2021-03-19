public class Main {
    public static void main(String[] args) {
        StringArrayList strArrayList = new StringArrayList();
        System.out.println(strArrayList.isEmpty());
        System.out.println(strArrayList);
        strArrayList.add("Phrase 1");
        System.out.println(strArrayList.isEmpty());
        System.out.println(strArrayList);
        strArrayList.add("Phrase 2");
        System.out.println(strArrayList);
        strArrayList.add("Phrase 3");
        System.out.println(strArrayList);
        strArrayList.add("Phrase 4");
        System.out.println(strArrayList);
        strArrayList.add("Phrase 5");
        System.out.println(strArrayList);
        System.out.println(strArrayList.contains("Phrase 6"));
        strArrayList.add("Phrase 6");
        System.out.println(strArrayList.contains("Phrase 6"));
        System.out.println(strArrayList);
        System.out.println(strArrayList.size());
        strArrayList.ensureCapacity(3);
        System.out.println(strArrayList);
        System.out.println(strArrayList.size());
        strArrayList.ensureCapacity(10);
        System.out.println(strArrayList);
        System.out.println(strArrayList.size());
        strArrayList.add(14, "Phrase 15");
        System.out.println(strArrayList);
        System.out.println(strArrayList.size());
        System.out.println(strArrayList.remove(13));
        System.out.println(strArrayList);
        System.out.println(strArrayList.size());
        System.out.println(strArrayList.get(0));
        System.out.println(strArrayList.get(4));
        System.out.println(strArrayList.get(13));
        System.out.println(strArrayList.indexOf("Phrase 1"));
        System.out.println(strArrayList.indexOf("Phrase 5"));
        System.out.println(strArrayList.indexOf("Phrase 15"));
        System.out.println(strArrayList.set(11, "Phrase 12"));
        System.out.println(strArrayList.set(12, "Phrase 13"));
        System.out.println(strArrayList.set(13, "Phrase 14"));
        System.out.println(strArrayList);
        for (
                String str : strArrayList) {
            System.out.println(str);
        }
    }
}
