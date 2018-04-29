package 插入排序删除重复项;

public class InsertSortDemo {

    public static int a[] = new int[] { 11, 20, 5, 5, 1, 1, 2, 10, 20, 9 };

    public static void main(String[] args) {
        insertSortDeleteRepeatElement();
    }

    public static void insertSortDeleteRepeatElement() {
        int count = a.length;

        int repeatCount = 0;

        for (int i = 0; i < count; i++) {
            int temp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] >= temp && a[j] != -1) {
                if (a[j] == temp) {
                    temp = -1;
                    repeatCount++;
                }

                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }

        count -= repeatCount;

        for (int k = 0; k < count; k++) {
            a[k] = a[k + repeatCount];
        }

        for (int k = a.length - 1; k >= count; k--) {
            a[k] = 0;
        }

        display(count);
    }

    public static void display(int count) {

        for (int i = 0; i < count; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
