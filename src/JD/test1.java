package JD;

import java.util.ArrayList;
import java.util.Scanner;

public class test1 {

    public static int jiwei(int n){
        if (n<=3) return 1;
        if (n <=12) return 2;
        if (n<=(12+9*3)) return 3;
        else return 4;
    }

    public static ArrayList<Integer> getNum(int n){
        int a = 2,b = 3,c = 5;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrayList.add(arrayList.get(i)*10 + arrayList.get(j));
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arrayList.add(arrayList.get(i)*100 + arrayList.get(j)*10 +arrayList.get(k));
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        arrayList.add(arrayList.get(i)*1000 + arrayList.get(j)*100 +arrayList.get(k)*10 +arrayList.get(l));
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            arrayList.add(arrayList.get(i)*10000 + arrayList.get(j)*1000 +arrayList.get(k)*100 +arrayList.get(l)*10 + arrayList.get(m));
                        }
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            for (int o = 0; o < 3; o++) {
                                arrayList.add(arrayList.get(i)*100000 + arrayList.get(j)*10000 +arrayList.get(k)*1000 +arrayList.get(l)*100 + arrayList.get(m)*10 + arrayList.get(o));

                            }
                        }
                    }
                }
            }
        }


        return arrayList;
    }

    public static int getTarget(int num){
        ArrayList<Integer> num1 = getNum(num);
        Integer integer = num1.get(num - 1);
        return integer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
//        while (scan.hasNextLine()){
            int n = scan.nextInt();
            int num = getTarget(n);
            arrayList.add(num);
//        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
