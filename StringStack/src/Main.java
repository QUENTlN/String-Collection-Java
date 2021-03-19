public class Main {

    public static void main(String[] args) {
//        ArrayStringStack ass = new ArrayStringStack();
//        System.out.println(ass.empty());
//        System.out.println(ass.push("0"));
//        System.out.println(ass.empty());
//        System.out.println(ass.push("1"));
//        System.out.println(ass.push("2"));
//        System.out.println(ass);
//        System.out.println(ass.push("3"));
//        System.out.println(ass.push("4"));
//        System.out.println(ass.push("5"));
//        System.out.println(ass.push("6"));
//        System.out.println(ass.push("7"));
//        System.out.println(ass.push("8"));
//        System.out.println(ass.push("9"));
//        System.out.println(ass.push("10"));
//        System.out.println(ass.push("11"));
//        System.out.println(ass.push("12"));
//        System.out.println(ass.push("13"));
//        System.out.println(ass.push("14"));
//        System.out.println(ass.push("15"));
//        System.out.println(ass.push("16"));
//        System.out.println(ass.push("17"));
//        System.out.println(ass.push("18"));
//        System.out.println(ass.push("19"));
//        System.out.println(ass.push("20"));
//        System.out.println(ass.push("21"));
//        System.out.println(ass.push("22"));
//        System.out.println(ass.peek());
//        System.out.println(ass);
//        System.out.println("///////////////////////////////////////////////////////");
//        for (String str : ass ) {
//            System.out.println(str);
//        }
//        System.out.println("///////////////////////////////////////////////////////");
//        System.out.println(ass.pop());
//        System.out.println(ass);
//        System.out.println(ass.pop());
//        System.out.println(ass.pop());
//        System.out.println(ass);
//        System.out.println(ass.pop());
//        System.out.println(ass);


        LinkedStringStack lss = new LinkedStringStack();
        System.out.println(lss.empty());
        System.out.println(lss.push("0"));
        System.out.println(lss.empty());
        System.out.println(lss.peek());
        System.out.println(lss.push("1"));
        System.out.println(lss.push("2"));
        System.out.println(lss);
        System.out.println(lss.push("3"));
        System.out.println(lss.push("4"));
        System.out.println(lss.push("5"));
        System.out.println(lss.push("6"));
        System.out.println(lss.push("7"));
        System.out.println(lss.push("8"));
        System.out.println(lss.push("9"));
        System.out.println(lss.push("10"));
        System.out.println(lss.push("11"));
        System.out.println(lss.push("12"));
        System.out.println(lss.push("13"));
        System.out.println(lss.push("14"));
        System.out.println(lss.push("15"));
        System.out.println(lss.push("16"));
        System.out.println(lss.push("17"));
        System.out.println(lss.peek());
        System.out.println(lss);
        System.out.println("///////////////////////////////////////////////////////");
        for (String str : lss ) {
            System.out.println(str);
        }
        System.out.println("///////////////////////////////////////////////////////");
        System.out.println(lss.pop());
        System.out.println(lss);
        System.out.println(lss.pop());
        System.out.println(lss.pop());
        System.out.println(lss);
        System.out.println(lss.pop());
        System.out.println(lss);
    }
}
