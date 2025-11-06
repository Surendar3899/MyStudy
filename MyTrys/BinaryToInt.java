package MyTrys;
public class BinaryToInt {
    public static void main(String[] args) {
        String binaryStr = "101110"; // binary number as string
        int decimal = Integer.parseInt(binaryStr, 3); // base 2
        System.out.println(decimal); // Output: 88
    }

}
