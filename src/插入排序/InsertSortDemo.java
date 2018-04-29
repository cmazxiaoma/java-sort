package 插入排序;

public class InsertSortDemo {

    public static int[] a = { 11, 20, 5, 4, 8, 14, 2, 10, 20, 9 };

    public static void main(String[] args) {
        // commonInsertSort();
        binaryInsertSort();
        display();
    }

    // 普通插入
    public static void commonInsertSort() {
        int count = a.length;

        for (int i = 0; i < count; i++) {
            int value = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > value) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = value;
        }
    }

    // 二分法插入
    public static void binaryInsertSort() {
        int count = a.length;
        int insertValue;

        for (int i = 0; i < count; i++) {
            int start = 0;
            int end = i - 1;
            int mid;
            insertValue = a[i];

            while (start <= end) {
                mid = start + (end - start) / 2;

                if (insertValue > a[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            for (int k = i; k > start; k--) {
                a[k] = a[k - 1];
            }

            a[start] = insertValue;
        }
    }

    public static void display() {
        int count = a.length;

        for (int i = 0; i < count; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
