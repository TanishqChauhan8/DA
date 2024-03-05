import java.util.Scanner;

class ABC {

    private static void dfs(int[][] M,int[] visited, int source) {
        visited[source] = 1;
        System.out.print(source + " ");

        for (int j = 0; j < M.length; j++) {
            if (M[source][j] == 1 && visited[j]!=1) {
                dfs(M, visited, j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[][]M = new int[n][n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of connected nodes for vertex " + i + ": ");
            int num = sc.nextInt();
            while (num > 0) {
                System.out.print("Enter the position of the connected node: ");
                int j = sc.nextInt();
                M[i][j] = 1;
                num--;
            }
        }

        System.out.print("Enter the source node: ");
        int source = sc.nextInt();
        int [] visited = new int [n];

        System.out.print("DFS traversal starting from the source node: ");
        dfs(M, visited, source);
    }
}
