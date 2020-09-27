package test;

public class test922 {
    public static void main(String[] args) {
        String  s1= "lkaujsdhfaiksudh";
        String s2 = "sdaoligfvhedqipugsdhfaiksaoeidrughf";
        String a = "";
        String b = "";
        if (s1.length()<s2.length()){
            a = s1;
            b = s2;
        }else {
            a = s1;
            b = s2;
        }
        int max = 0;
        for (int i = 0; i < a.length()-1; i++) {
            for (int j = i+1; j < a.length(); j++) {
                String substring = a.substring(i, j);
                if (b.contains(substring)){
                    max = Math.max(max,substring.length());
                }
            }
        }
        System.out.println(max);
    }
}
