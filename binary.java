import java.util.*;

class ABC {
    static int binary(int low, int high, int key, int a[]) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (key == a[mid])
                return 1;
            else if (key < a[mid])
                return binary(low, mid - 1, key, a);
            else if (key > a[mid])
                return binary(mid + 1, high, key, a);
        }
        return 0;
    }

    public static void main(String ar[]) {
        int a[] = {1, 2, 3, 4}; // Sorted array
        int low = 0, high = 3, key = 1;
        if (binary(low, high, key, a) == 1)
            System.out.print("Key found");
        else
            System.out.print("Key Not Found");
    }
}
