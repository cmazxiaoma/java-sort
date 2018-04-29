package 快速排序;

public class QuickSortDemo {
    public static int[] a = { 11, 20, 5, 4, 8, 14, 2, 10, 20, 9 };

    public static void main(String[] args) {
        sort(0, a.length - 1);
        display();
    }

    public static void sort(int left, int right) {
        if (left < right) {
            int i = left, j = right;
            int x = a[i];

            while (i < j) {
                while (i < j && a[j] >= x) {
                    j--;
                }

                if (i < j) {
                    a[i++] = a[j];
                }

                while (i < j && a[i] <= x) {
                    i++;
                }

                if (i < j) {
                    a[j--] = a[i];
                }
            }

            a[i] = x;
            sort(left, i - 1);
            sort(i + 1, right);
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
