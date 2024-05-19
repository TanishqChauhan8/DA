import java.util.*;

class ABC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Nodes: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
		for(int row[]:a)
        Arrays.fill(row, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Number of Connected Nodes for Node " + i + ": ");
            int m = sc.nextInt();
            while (m-- > 0) {
                System.out.print("Enter the Connected Node and Weight to the Connected Node: ");
                int c = sc.nextInt();
                int w = sc.nextInt();
                a[i][c] = w;
            }
            a[i][i] = 0;
        }

        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][k] != Integer.MAX_VALUE && a[k][j] != Integer.MAX_VALUE) {
                        a[i][j] = Math.min(a[i][j], a[i][k] + a[k][j]);
                    }
                }
            }
        }

        
        System.out.println("Shortest Paths:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        
        int sourceNode = 0;
        int targetNode = 5;
        System.out.print("Shortest path from " + sourceNode + " to " + targetNode + ": ");
        printPath(a, sourceNode, targetNode);
    }

    
    static void printPath(int[][] a, int i, int j) {
        if (a[i][j] == Integer.MAX_VALUE) {
            System.out.println("No path exists.");
            return;
        }
        System.out.print(i + " ");
        while (i != j) {
            i = a[i][j];
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
