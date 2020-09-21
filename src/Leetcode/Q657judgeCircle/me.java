package Leetcode.Q657judgeCircle;

public class me {
    public boolean judgeCircle(String moves) {
        int [] arr = {0,0};
        char[] chars = moves.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') {
                arr[1] = arr[1]+1;
            }else if (chars[i] == 'L') arr[1]=arr[1]-1;
            else if (chars[i] == 'U') arr[0] = arr[0]-1;
            else arr[0] = arr[0]+1;
        }
        if (arr[0] == 0 && arr[1] == 0) return true;
        else return false;
    }
}
