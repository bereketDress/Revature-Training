package RevatureAssignment1;

public class Person {
    private String name;
    private int age;
    private double height;
    ;
    public Person(String name, int age, double height) {
        this.age = age;
        this.height = height;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String setName(String name){
        return this.name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;

    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;

    }
    public String toString(){
        return "Name: " + this.name + ", Age: " + this.age + ", Height: " + this.height;
    }

}
class main{
    public static void main(String[] args) {
        Person p1= new Person("Alex",25,5.9);
        System.out.println(p1);
    }
}


