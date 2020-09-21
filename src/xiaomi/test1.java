package xiaomi;

import java.util.*;
public class test1 {
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Deque<Character> dq = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if (dq.isEmpty() || dq.peek() != map.get(ch)) {
                    return false;
                }
                dq.pop();
            } else {
                dq.push(ch);
            }
        }
        return dq.isEmpty();
    }

    public Boolean isValid2(String str){


        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String input =  sc.nextLine();
            boolean valid = isValid(input);
            System.out.println(valid);
        }

    }
}

