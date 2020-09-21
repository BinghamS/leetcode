package xiaomi;

import java.util.*;

public class test11 {
    public static boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        int i = 0;
        while (sc.hasNextLine()){
            strings.add(sc.nextLine());
            i++;
        }
        int size = strings.size();
        Boolean res[] = new Boolean[size];
        for (int j = 0; j < size; j++) {
            res[j] = isValid(strings.remove(0));
            System.out.println(res[j]);
        }
//        boolean valid = isValid(input);
//        System.out.println(valid);
    }
}
