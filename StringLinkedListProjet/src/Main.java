public class Main {
    public static void main(String[] args) {
//        StringLinkedList liste = new StringLinkedList();
//        System.out.println(liste.isEmpty());
//        System.out.println(liste.toString());
//        System.out.println(liste.size());
//        System.out.println(liste.contains("3"));
//        liste.add("1");
//        System.out.println(liste.isEmpty());
//        liste.add("2");
//        liste.add("3");
//        liste.add("4");
//        System.out.println(liste.toString());
//        System.out.println(liste.size());
//        System.out.println(liste.contains("3"));
//        liste.remove("3");
//        System.out.println(liste.toString());
//        System.out.println(liste.size());
//        System.out.println(liste.contains("3"));
//        System.out.println(liste.isEmpty());
//        liste.addFirt("0");
//        liste.addFirt("-1");
//        System.out.println(liste);
////        liste.remove("-1");
////        liste.remove("4");
//        System.out.println(liste);
//        System.out.println("////////////////////////////////////");
//        for (
//                String str : liste) {
//            System.out.println(str);
//        }

        StringHashSet stringHashSet = new StringHashSet();
        System.out.println(stringHashSet.isEmpty());
        stringHashSet.add("Isuri");
        stringHashSet.add("Kamil");
        System.out.println(stringHashSet.size());
        stringHashSet.add("Haka");
        stringHashSet.add("bunny");
        stringHashSet.add("carotte");
        System.out.println(stringHashSet.size());
        System.out.println(stringHashSet.toString());
        stringHashSet.remove("Kamil");
        System.out.println(stringHashSet.toString());
        stringHashSet.add("Kamil");
        stringHashSet.remove("Isuri");
        System.out.println(stringHashSet.toString());
        System.out.println(stringHashSet.isEmpty());
        stringHashSet.clear();
        System.out.println(stringHashSet.toString());
    }
}
