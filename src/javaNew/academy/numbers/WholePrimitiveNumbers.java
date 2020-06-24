package javaNew.academy.numbers;

public class WholePrimitiveNumbers {
    public static void main(String[] args) {
        long max =3_276_132_163_623L;

        int oct = 07;
        int firstOct = 010; // 8 in decimal
        int secondOct = 022;// 18 in decimal

        int sumOct = firstOct + secondOct; // 26 decimal, 32 octal
        System.out.println("first = " +firstOct + " secondOct = " + secondOct);
        System.out.println("decimal sum = " + sumOct);
        System.out.println(Integer.toOctalString(sumOct));

        //hexadecimal (0-9 and A-F)
        int firstHex = 0xF; //15 in decimal
        int secondHex = 0x1E; //30 in decimal
        int sumHex = firstHex + secondHex;

        System.out.println("first = " + firstHex + " second = " + secondHex);
        System.out.println("decimalHex = " + sumHex);
        System.out.println("hexSum = " + Integer.toHexString(sumHex));





    }
}
