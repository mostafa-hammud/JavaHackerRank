package com.johnmsaylor;

public class Main {

    //epic: flip the bits and return base 10

    //input is a base 10
    //convert to base 2
    //make sure it's 32 bits (add leading 0s if needed)
    //flip 0s and 1s
    //(return)convert back to base 10

    static long flippingBits(long n) {
         String binaryString = Long.toBinaryString(n);
         return 0;
    }

    public static void main(String[] args) {
        long n = 5L;
        StringBuilder binaryString = new StringBuilder(Long.toBinaryString(n));
        int length = binaryString.length();
        int zerosNeeded = 32 - length;

        for (int i = 0; i < zerosNeeded; i++) {
            binaryString.insert(0, '0');
        }

        for (int i = 0, slength = binaryString.length(); i < slength; i++) {
            if (binaryString.charAt(i) == '0')
                binaryString.setCharAt(i, '1');
            else
                binaryString.setCharAt(i,'0');
        }


//        long answer = Long.parseLong(binaryString.toString());
        long answer = Long.valueOf(binaryString.toString(), 2);

        System.out.println(answer);
    }
}
