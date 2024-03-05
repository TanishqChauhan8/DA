import java.util.Scanner;

class SelectionSort {

    public static void selection(int i, int n, int ar[]) {
        if (i < n) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (ar[j] < ar[min])
                    min = j;
            }
				
             if (min != i) {
   
				int temp = ar[min];
                ar[min] = ar[i];
                ar[i] = temp;
            }
           selection(i + 1, n, ar);
        }
    }

    public static void main(String args[]) {
        int n, min,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        n = sc.nextInt();

        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element at ar[%d]: ", i);
            ar[i] = sc.nextInt();
        }
        selection(i, n, ar);

        System.out.print("Sorted array: ");
        for (int k = 0; k < n; k++)
            System.out.print(ar[k] + " ");
    }
}