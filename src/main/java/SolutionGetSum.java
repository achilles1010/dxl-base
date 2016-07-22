/**
 * Created by daixulin on 7/21/16.
 */
public class SolutionGetSum {

    public static int getSum(int a, int b){
        while (b != 0){
            int c = a;
            a = a ^ b;
            b = c & b;
            b <<= 1;
        }

        return a;
    }

    public static int getSum1(int a, int b){
        while (a != 0){
            int c = a ^ b;
            a = (a & b) << 1;
            b = c;
        }

        return b;
    }

    public static int getSum2(int a, int b){
        if ((a&b) == 0) return a|b;
        return getSum(a^b, (a&b)<<1);
    }

    public static int getSum3(int a, int b){
        if (a == 0) return b;
        int x = (a & b) << 1;
        int y = a ^ b;

        return getSum2(x, y);
    }

    public static void main(String[] args){
        long start = System.nanoTime();
        System.out.println(getSum2(1,2));
        long end = System.nanoTime();
        System.out.println(end-start);
    }

}
