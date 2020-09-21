package xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        List<List<Character>> list =  new ArrayList<>();

        for (int i = 0; i < s1.length; i++) {
            ArrayList<Character> characters = new ArrayList<Character>();
            for (int j = 0; j < s1[i].length(); j++) {
                char c = s1[i].charAt(j);
                characters.add(c);
            }
            list.add(characters);
        }

//        ArrayList<Character> res = new ArrayList<Character>();
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 0; j < list.get(i).size(); j++) {
//                res.add(list.get(i).get(j));
//                
//            }
//        }
//        System.out.println(res);

        int[] res = new int[s1.length];
        test2 test2 = new test2();


    }
    
    public int getnum(char c,int level){
        
        return 0;
    }
}
