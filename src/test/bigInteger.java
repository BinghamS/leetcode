package test;

import java.math.BigInteger;

public class bigInteger {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("321654654987987");
        BigInteger b = new BigInteger("321654654987987");
        BigInteger add = a.add(b);
        System.out.println(add);
        BigInteger multiply = a.multiply(b);
        System.out.println(multiply);

    }
}
