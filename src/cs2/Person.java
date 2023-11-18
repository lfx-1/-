package cs2;

public class Person {

    private String name;
    private String age;
    private String number;


    public Person() {
    }

    public Person(String name, String age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "联系人{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 电话号码='" + number + '\'' +
                '}';
    }
}
