package zijie.exercise.Q1sumup;

public class run {
    public static void main(String[] args) {
        int x[] = {2,7,11,5};
        int target = 9;
        me me = new me();
        int[] res = me.twoSum(x, target);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
