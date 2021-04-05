package Q567checkInclusion;

import java.util.*;

/**
 * @ClassName me
 * @Deacription 超时了...
 * @Author bingham
 * @Date 2021/2/10 13:50
 * @Version 1.0
 **/
public class me {
    public boolean checkInclusion(String s1, String s2) {
        List<List<Character>> alllist = getAlllist(s1);
        for (List<Character> a:
            alllist ) {
            StringBuilder sb = new StringBuilder();
            for (char ch:
                 a) {
                sb.append(ch);
            }
            if(s2.contains(sb.toString())){
                return true;
            }
        }
        return false;
    }

    public static List<List<Character>> getAlllist(String a){
        List<List<Character>> res = new ArrayList<List<Character>>();
        List<Character> temp = new ArrayList<Character>();
        int[] visited = new int[a.length()];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = 0;
        }
        backward(res,temp,a,visited);
        return res;

    }

    public static void backward(List<List<Character>> res, List<Character> temp, String a, int[] visited){
        if(temp.size() == visited.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            if (visited[i] == 1) continue;
            visited[i] = 1;
            temp.add(a.charAt(i));
            backward(res,temp,a,visited);
            visited[i] = 0;
            temp.remove(temp.size()-1);
        }
    }

}
