package test;

public class contain7 {
    public static void main(String[] args) {
        int a = 777;
        Integer integer = new Integer(777);
        Integer aaa =a;
        String s = aaa.toString();
        StringBuilder sb = new StringBuilder("sadasdasd");
        sb.reverse();

        String string = integer.toString();
        System.out.println(string);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
