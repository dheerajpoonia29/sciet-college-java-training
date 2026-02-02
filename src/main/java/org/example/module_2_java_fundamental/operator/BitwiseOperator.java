package org.example.module_2_java_fundamental.operator;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result;

        /*
        Bitwise AND operator, return 1 if both bits are 1 else return 0
        5 = 0101
        3 = 0011
        0101
        0011
        ---- bitwise and
        0001

        0001 = 1
         */
        result = a & b;
        System.out.println("a & b = " + result); // result = 1

        /*
        Bitwise OR operator, return 1 if any of the bits is 1 else return 0
        result = a | b;
        System.out.println("a | b = " + result); // result = 7
        5 = 0101
        3 = 0011
        0101
        0011
        ---- bitwise or
        0111 => 7
         */

        /*
        Bitwise XOR operator, return 1 if both bits are different else return 0
        5 = 0101
        3 = 0011
        0101
        0011
        ---- bitwise xor
        0110 => 6
         */
        result = a ^ b;
        System.out.println("a ^ b = " + result);


        /*
        Bitwise NOT operator, it inverts all bits
        5 =  000000000000000000101
        ~5 = 111111111111111111010 => when we sum the value of set bit it exceeds the limit of integer and became negative sum
        ~5 = -(5+1) = -6
         */
        result = ~a;
        System.out.println("~a = " + result);

        /*
        Left shift
        a = 5 = 0101
        0101 << 1 = 1010 = 10
         */
        result = a << 1;
        System.out.println("a << 1 = " + result );
        result = a << 2;
        /*
        a = 5 = 0101
        0101 << 2 = 010100 = 20
         */
        System.out.println("a << 1 = " + result );

        /*
        Right shift
        a = 5 = 0101
        0101 >> 1  = 0010 => 2
         */
        result = a >> 1;
        System.out.println("a << 1 = " + result );
    }
}
