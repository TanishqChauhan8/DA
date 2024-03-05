import java.util.*;

class ABC {
    static int check(int key, int s[]) {
        for (int i = 0; i < 5; i++) {
            if (s[i] == key)
                return 1;
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Nodes : ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the no of visited nodes for node " + i + " : ");
            int m = sc.nextInt();
            while (m != 0) {
                System.out.print("Enter the pos of connected Node : ");
                int j = sc.nextInt();
                a[i][j] = 1;
                m--;
            }
        }

        int s[] = new int[n];
        int d[] = new int[n];
        System.out.print("Enter the Source Node : ");
        int s1 = sc.nextInt();
        s[0] = s1;
        d[0] = s1;
        int k = 1; 
        int l = 1;
        int i = 0;

        while (k != 0) { 
            i = s[k - 1];
            int count = 0; 

            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1 && check(j, d) != 1) {
                    s[k++] = j;
                    d[l++] = j;
                    count = 1;
                    break;
                }
            }

            if (count == 0) 
                k--; 
            
        }

        System.out.print("DFS Traversal: ");
        for (int j = 0; j < l; j++)
            System.out.print(d[j] + " ");
    }
}
