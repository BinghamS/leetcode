package test;

public class FullPermutation {
    //static StringBuilder fullString=new StringBuilder();
    static void fullPermutation(String s,StringBuilder currentString){
        if(s.isEmpty()){
            System.out.println(currentString);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            currentString.append(ch);

            String newString=s.replaceAll(String.valueOf(ch),"");      //剔除字母
            fullPermutation(newString,currentString);                                //递归
            currentString.delete(currentString.length()-1, currentString.length());  //解决回朔问题

        }
    }
    public static void main(String[] args){
        String s="abcd";
        StringBuilder currentString=new StringBuilder();
        fullPermutation(s,currentString);
    }
}
