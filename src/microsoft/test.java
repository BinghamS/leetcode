package microsoft;

public class test {
    public static void main(String[] args) {

        String a = "asdasd";

        StringBuilder s = new StringBuilder("dasdas");

        test test = new test();
        int res = test.test2("adaada", 3);
        System.out.println(res);
    }
    public int test2(String input1,int input2){
        String tmp = "";
        int res = 0;
        for(int i =0;i<input1.length();i++){
            if(input1.charAt(i) != ' '){
                tmp += input1.charAt(i);
            }else{
                if(judge(tmp,input2)){
                    res += 1;
                }

                tmp = "";
            }
        }
        if(judge(tmp,input2)){
            res+=1;
        }
        // res += judge(tmp,input2);
        return res;
        //throw new UnsupportedOperationException("rotatedWords(String input1,int input2)");
    }
    public static Boolean judge(String s, int k){
        int n = s.length();
        k = k% n;

        String ns = s.substring(n - k, k )+ s.substring(0,n-k);
        return ns == s;
    }
}
