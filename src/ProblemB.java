
import java.util.Scanner;

public class ProblemB {

    static int maxn = 1000001;
    static char[] p;
    static char[] q;
    static int a[];
    static int length, ans_len, m, n;

    static void process() {

        m = p.length;
        int i = 0, j = -1;
        a[0] = -1;

        while (i < m) {

            while (j >= 0 && p[i] != p[j])
                j = a[j];

            i++;
            j++;

            a[i] = j;

        }

    }

    static void kmp() {

        n = q.length;

        int i = 0, j = 0;

        while (i < n) {
            while (j >= 0 && q[i] != p[j])
                j = a[j];

            i++;
            j++;

            if (j > ans_len)
                ans_len = j;

            if (j == m)
                j = a[j];


        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            p = new char[maxn];
            a = new int[maxn];
            q = new char[maxn];

            String str = sc.next();

            length = str.length();


            p = str.toCharArray();

            //reverse input string

            q = new StringBuffer(str).reverse().toString().toCharArray();

            process();

            ans_len = -1;

            kmp();

            for (int i = ans_len - 1; i >= 0; i--) {
                System.out.print(p[i]);
            }

            System.out.println();

        }
    }
}
