public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;    // binary: 0101
        int b = 3;    // binary: 0011

        // Bitwise AND: 0101 & 0011 = 0001 (1)
        System.out.println("a & b = " + (a & b));   

        // Bitwise OR: 0101 | 0011 = 0111 (7)
        System.out.println("a | b = " + (a | b));   

        // Bitwise XOR: 0101 ^ 0011 = 0110 (6)
        System.out.println("a ^ b = " + (a ^ b));   

        // Bitwise NOT: ~0101 = ...11111010 (2's complement of 6 → -6)
        System.out.println("~a = " + (~a));         

        // Left shift: 0101 << 1 = 1010 (10)
        System.out.println("a << 1 = " + (a << 1)); 

        // Right shift (arithmetic): 0101 >> 1 = 0010 (2)
        System.out.println("a >> 1 = " + (a >> 1)); 

        // Unsigned right shift: 0101 >>> 1 = 0010 (2)
        System.out.println("a >>> 1 = " + (a >>> 1)); 
    }
}
