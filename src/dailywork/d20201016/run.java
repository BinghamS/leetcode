package dailywork.d20201016;

public class run {
    public static void main(String[] args) {
        int arr[] = {-4,-1,0,3,10};
        me me = new me();
        int[] ints = me.sortedSquares(arr);
        for (int a :
                ints) {
            System.out.println(a);
        }

    }

}
