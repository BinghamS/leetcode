package oppo;

public class test3 {
    public static void main(String[] args) {
        String s  = "woppocom";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String substring = s.substring(i, j);
                if (isrever(substring)){
                    if (substring.length() > 1){
                        System.out.println(substring);
                    }
                }
            }
        }
    }

    public static Boolean isrever(String s){
        Boolean flag = true;
        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if (s.length()-i-1>=0){
                if (s.charAt(i)!= s.charAt(s.length()-i-1)) flag = false;
            }
        }
        return flag;
    }
}
