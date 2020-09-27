package Leetcode.Q394decodeString;

public class me {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        int i = 0 ;
        while(i<c.length){
            if(c[i]>='0'&&c[i]<='9'){ //遇到数字找到【】
                int j ;
                int cnt = 0;
                int q  = i;
                while(c[q]>='0'&&c[q]<='9') q++;
                int count = Integer.parseInt(s.substring(i,q)) ; //算出重复次数;
                i = q;
                for(j = i;j<c.length;j++){
                    if(c[j]=='['){
                        cnt++;
                    }else if(c[j]==']'){
                        cnt--;
                    }
                    if(cnt==0) break;
                }
                String str = decodeString(s.substring(i+1,j));
                for(int k = 1;k<=count;k++){
                    sb.append(str);
                }
                i = j+1;
            }else{ //遇到字母可以直接加
                sb.append(c[i]);
                i++;
            }
        }
        return sb.toString();
    }
}
