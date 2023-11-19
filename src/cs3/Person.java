package cs3;


public class Person {
    private String name;
    private String age;
    private  String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return age;
    }

    public void setAddress(String address) {
        this.age = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String toString() {
        return "Name: " + name + ", Address: " + age + ", Phone Number: " + number;
    }


    public Person(String name, String address, String number) {
        this.name = name;
        this.age = address;
        this.number = number;
    }


}