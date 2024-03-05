import java.util.Scanner;

class ABC {
    
    static int[] radix(int a[], int c) {
        int r[] = new int[a.length];
        int d = 0;

        while (d < c) {
            int count = 0;
            int b[] = new int[10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (digit(a[j], d) == i)
                        count++;
                }
                b[i] = count;
                count = 0;
            }

            for (int i = 1; i < 10; i++)
                b[i] = b[i] + b[i - 1];

            for (int i = a.length - 1; i >= 0; i--) {
                int k = digit(a[i], d);
                if (a[i] < Math.pow(10, d + 1)) {
                    k = 0; // if the number has fewer digits, treat it as if its d-th digit is 0
                }
                b[k] = b[k] - 1;
                r[b[k] - 1] = a[i]; // Corrected index
            }
            d++;
        }
        return r;
    }

    static int digit(int n, int i) {
        return (n / (int) Math.pow(10, i)) % 10;
    }

    public static void main(String ar[]) {
        int a[] = { 30, 412, 39, 41, 836, 540 };
        Scanner sc = new Scanner(System.in);
        int ans = 0, c = 0;

        for (int i = 0; i < a.length; i++)
            ans = Math.max(a[i], ans);

        c = String.valueOf(ans).length();

        int result[] = radix(a, c);

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}
