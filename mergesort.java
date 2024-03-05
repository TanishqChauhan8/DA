import java.util.*;

class ABC {

    static void mergesort(int a[], int b[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergesort(a, b, low, mid);
            mergesort(a, b, mid + 1, high);
            merge(a, b, low, mid, high);
        }
    }

    static void merge(int a[], int b[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = low;

        while (i <= mid && j <= high) {
            if (a[i] < a[j])
                b[k++] = a[i++];
            else
                b[k++] = a[j++];
        }

        while (i <= mid)
            b[k++] = a[i++];

        while (j <= high)
            b[k++] = a[j++];

        for (int p = low; p <= high; p++)
            a[p] = b[p];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Element into the Array: ");
            a[i] = sc.nextInt();
        }

        mergesort(a, b, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
