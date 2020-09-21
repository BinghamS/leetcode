package nonghang;

import java.util.*;

public class test {
    public String solution(String path) {

//把字符串以"/"为分隔符分割成数组,此时数组有"路径"\""、"."、".."这四种情况;
        String[] s = path.split("/");
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length; i++) {
            if (!stack.isEmpty() && s[i].equals(".."))
                stack.pop();
            else if (!s[i].equals("") && !s[i].equals(".") && !s[i].equals(".."))
                stack.push(s[i]);
        }
        if (stack.isEmpty())
            return "/";

        StringBuffer res = new StringBuffer();
        for (int i = 0; i < stack.size(); i++) {
            res.append("/" + stack.get(i));
        }
        return res.toString();
    }

    public String simplifyPath2(String path) {
        Stack<String> s = new Stack<>();
        for(String i : path.split("/")){
            if(i.equals("..")&&!s.empty()) s.pop();
            else if(!i.equals("..")&&!i.equals(".") && !i.equals("")) s.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for(String a : s) {
            sb.append("/");
            sb.append(a);
        }
        return sb.length() == 0 ?"/":sb.toString();
    }
    public String simplifyPath(String path) {
        path = path.replaceAll("\\\"", "");
        Deque<String> q = new ArrayDeque<>();
        for(String i : path.split("/")){
            if(i.equals("..")&&q.peek()!=null) q.removeLast();
            else if(!i.equals("..") && !i.equals(".") && !i.equals("")) q.addLast(i);
        }
        StringBuilder sb = new StringBuilder();
        while(q.peek()!=null){
            sb.append("/");
            sb.append(q.removeFirst());
        }
        if (sb.length() ==0){
            return "'/'";
        }else{
            String res = "\""+sb.toString()+"\"";
            return res;
        }
        //return sb.length() == 0 ?"/":sb.toString();
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
        String input = "/a/./b/../../c/";
        test test = new test();
        //String sosution = test.solution(input);

        String s = test.simplifyPath(input);

        System.out.println(s);

    }
}
