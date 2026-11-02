package LinkedList.Basic;

public class Student {
    String name;
    public Student(String name){
        this.name=name;
    }

    static void main(String[] args) {
        Student s1=new Student("Vishal");
        System.out.println(s1.name);

    }
}
