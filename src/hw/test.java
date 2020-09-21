package hw;

import java.util.*;
public class test {

    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();

        int[] tmp=new int[6];

        int[][] intervals = new int[n][2];
        for(int i=0;i<n;i++){
            intervals[i][0]=scan.nextInt();
            intervals[i][1]=scan.nextInt();
        }
        if(n<3){System.out.println("null");return;}
        int[][] intervalscpy = new int[n][2];
        for(int i=0;i<n;i++){
            intervalscpy[i][0]=intervals[i][0];
            intervalscpy[i][1]=intervals[i][1];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });

        int[] max1=new int[3];
        int[] max2=new int[3];
        int i1=0,i2=0;
        for(int i=n-1;i>=0;i--){
            if(intervals[i][1]==1&&i1<=2){
                max1[i1]=intervals[i][0];
                i1++;
            }
            if(intervals[i][1]==2&&i2<=2){
                max2[i2]=intervals[i][0];
                i2++;
            }
            if((i1>2)&&(i2>2))break;
        }

        int result1=0,result2=0,result3=0,resultcol=0,resulthe=0;
        if(i2<=2 && i1<=2){System.out.println("null");return;}
        else if((max1[0]+max1[1]+max1[2]>max2[0]+max2[1]+max2[2]) || (i2<=2)){
            int[] max=max1;
            resultcol = 1;
            resulthe=max1[0]+max1[1]+max1[2];

            for(int i=0;i<n;i++){
                if(intervalscpy[i][1]==1&&intervalscpy[i][0]==max[0])result1=i;
                if(intervalscpy[i][1]==1&&intervalscpy[i][0]==max[1])result2=i;
                if(intervalscpy[i][1]==1&&intervalscpy[i][0]==max[2])result3=i;
            }
        }
        else if((max1[0]+max1[1]+max1[2]<max2[0]+max2[1]+max2[2]) || (i1<=2)){
            int[] max=max2;
            resultcol=2;
            resulthe=max2[0]+max2[1]+max2[2];

            for(int i=0;i<n;i++){
                if(intervalscpy[i][1]==2&&intervalscpy[i][0]==max[0])result1=i;
                if(intervalscpy[i][1]==2&&intervalscpy[i][0]==max[1])result2=i;
                if(intervalscpy[i][1]==2&&intervalscpy[i][0]==max[2])result3=i;
            }
        }
        else if((max1[0]+max1[1]+max1[2]==max2[0]+max2[1]+max2[2])){
            resulthe=max1[0]+max1[1]+max1[2];

            for(int i=0;i<n;i++){
                if(intervalscpy[i][1]==1&&intervalscpy[i][0]==max1[0])tmp[0]=i;
                if(intervalscpy[i][1]==1&&intervalscpy[i][0]==max1[1])tmp[1]=i;
                if(intervalscpy[i][1]==1&&intervalscpy[i][0]==max1[2])tmp[2]=i;
                if(intervalscpy[i][1]==2&&intervalscpy[i][0]==max2[0])tmp[3]=i;
                if(intervalscpy[i][1]==2&&intervalscpy[i][0]==max2[1])tmp[4]=i;
                if(intervalscpy[i][1]==2&&intervalscpy[i][0]==max2[2])tmp[5]=i;
            }

            int min=tmp[0];
            for(int i=1;i<6;i++){
                if(tmp[i]<min) min=tmp[i];
            }
            if((min==tmp[0])||(min==tmp[1])||(min==tmp[2])){result1=tmp[0];result2=tmp[1];result3=tmp[2];resultcol=1;}
            else{result1=tmp[3];result2=tmp[4];result3=tmp[5];resultcol=2;}
        }

        result1++;
        result2++;
        result3++;

        int t = 0;
        if(result1 > result2){
            t = result1;
            result1 = result2;
            result2 = t;
        }
        if(result1 > result3){
            t = result1;
            result1 = result3;
            result3 = t;
        }
        if(result2 > result3){
            t = result2;
            result2 = result3;
            result3 = t;
        }


        System.out.print(result1+" ");
        System.out.print(result2+" ");
        System.out.println(result3);
        System.out.println(resultcol);
        System.out.println(resulthe);

    }

}
