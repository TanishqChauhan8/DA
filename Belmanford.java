import java.util.*;

class ABC {
    static int[] bellmanFord(ArrayList<ArrayList<ArrayList<Integer>>> adj, int s, int n) {
        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);
        dis[s] = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int u = 0; u < n; u++) {
                for (ArrayList<Integer> it : adj.get(u)) {
                    int v = it.get(0);
                    int w = it.get(1);
                    if (dis[u] != Integer.MAX_VALUE && dis[u] + w < dis[v]) {
                        dis[v] = dis[u] + w;
                    }
                }
            }
        }

      
        for (int u = 0; u < n; u++) {
            for (ArrayList<Integer> it : adj.get(u)) {
                int v = it.get(0);
                int w = it.get(1);
                if (dis[u] != Integer.MAX_VALUE && dis[u] + w < dis[v]) {
                    System.out.println("Graph contains negative weight cycle");
                    return new int[]{-1};
                }
            }
        }
        return dis;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            System.out.println("Enter the number of edges for node " + i + ": ");
            int m = sc.nextInt();

            for (int j = 0; j < m; j++) {
                System.out.println("Enter the connected node and weight (space-separated): ");
                int c = sc.nextInt();
                int w = sc.nextInt();
                adj.get(i).add(new ArrayList<>(Arrays.asList(c, w)));
            }
        }

        int source = 0; 
        int[] distances = bellmanFord(adj, source, n);

        if (distances.length == 1 && distances[0] == -1) {
            System.out.println("Graph contains a negative weight cycle");
        } else {
            System.out.println("Shortest distances from source node " + source + ": " + Arrays.toString(distances));
        }

        sc.close();
    }
}
