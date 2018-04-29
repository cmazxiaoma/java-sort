package 对象排序;

public class Person {
    private String name;
    private Integer age;
    private Integer height;

    public Person(String name, Integer age, Integer height) {
        super();
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void displayPerson() {
        System.out.println("name:" + name + ", age:" + age + ", height:" + height);
    }
}
