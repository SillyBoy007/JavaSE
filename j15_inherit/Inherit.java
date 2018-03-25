package j15_inherit;

//继承的实现
class Person{
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
class Student extends Person{
    private String school;
    public Student(){
    }
    public Student(String school){
        this.school = school;
    }
    public void setSchool(String school){
        this.school = school;
    }

    public String getSchool() {
        return school;
    }
}
public class Inherit {
    public static void main(String args[]){
        Student stu = new Student();
        stu.setName("wang");
        System.out.println(stu.getName());
        stu.setSchool("万里");
        System.out.println(stu.getSchool());
    }
}
