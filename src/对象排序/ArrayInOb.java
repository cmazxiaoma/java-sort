package 对象排序;

public class ArrayInOb {
    private Person[] a;
    private int size;

    public ArrayInOb(int max) {
        a = new Person[max];
        size = 0;
    }

    public void insert(String name, Integer age, Integer height) {
        a[size] = new Person(name, age, height);
        size++;
    }

    public void display() {
        for (int j = 0; j < size; j++) {
            a[j].displayPerson();
        }
        System.out.println("");
    }

    public void insertSort() {
        for (int i = 0; i < size; i++) {
            Person temp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j].getName().compareTo(temp.getName()) > 0) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
        }
    }
}
