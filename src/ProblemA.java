import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int Case = 0;

        while (T-- > 0) {
            int N = sc.nextInt(), res = 0;
            DecimalFormat df = new DecimalFormat("0.00000000");

            if (N > 1) {
                int a = 2;

                while (a <= N) {
                    if (BigInteger.valueOf(a).isProbablePrime(100))
                        res++;
                    a++;
                }
            }


            System.out.println("Case " + (++Case) + ": " + df.format(res));

        }
        sc.close();
    }
}
