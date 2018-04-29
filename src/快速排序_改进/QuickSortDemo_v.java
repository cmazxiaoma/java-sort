package 快速排序_改进;

public class QuickSortDemo_v {

    public static int[] input = new int[] { 12, 1, 50, 8, 9, 8, 6, 7, 10, 3 };

    public static void main(String[] args) {
        sort(0, input.length - 1);
        print();
    }

    public static void sort(int start, int end) {
        if (start < end) {
            int p = getElementIndex(start, end);
            sort(start, p - 1);
            sort(p + 1, end);
        }
    }

    public static int getElementIndex(int start, int end) {
        int index = start;
        int max = input[end];

        for (int i = start; i < end; i++) {

            if (input[i] < max) {
                swap(index, i);
                index++;
            }
        }

        swap(index, end);

        return index;
    }

    public static void swap(int x, int y) {
        int temp = input[x];
        input[x] = input[y];
        input[y] = temp;
    }

    public static void print() {
        int count = input.length;

        for (int i = 0; i < count; i++) {
            System.out.print(input[i] + " ");
        }
    }
}