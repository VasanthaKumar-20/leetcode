import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        return num1.add(num2).toString(2);
    }
}




        //Only works for small numbers
        // int x = Integer.parseInt(a,2);
        // int y = Integer.parseInt(b,2);
        // return Integer.toString(x+y,2);