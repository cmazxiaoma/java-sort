package 选择排序;

public class SelectSortDemo {
    public static int[] a = { 11, 20, 5, 4, 8, 14, 2, 10, 20, 9 };

    public static void main(String[] args) {
        sort();
        display();
    }

    public static void sort() {
        int count = a.length;

        for (int i = 0; i < count - 1; i++) {
            int min = i;

            for (int k = i + 1; k < count; k++) {
                if (a[k] < a[min]) {
                    min = k;
                }
            }

            if (min != i) {
                swap(min, i);
            }
        }
    }

    public static void swap(int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void display() {
        int count = a.length;

        for (int i = 0; i < count; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
