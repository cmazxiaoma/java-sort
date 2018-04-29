package 对象排序;

public class ObjectSortDemo {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrayInOb arrayInOb = new ArrayInOb(maxSize);

        arrayInOb.insert("garrett", 18, 173);
        arrayInOb.insert("cmazxiaoma", 21, 170);
        arrayInOb.insert("xiaodingding", 22, 165);
        arrayInOb.insert("xiaoma", 23, 155);

        System.out.println("befor sorting");
        arrayInOb.display();
        arrayInOb.insertSort();

        System.out.println("After sorting");
        arrayInOb.display();

        String a = "xiaodingding";
        String b = "xiaoma";

        System.out.println(a.compareTo(b));
    }
}
