class Student{
    // instance variable

    int age;

    // staic variable
    static String SchoolName = "AND.Public School";

    Student(int age){
        this.age = age;
    }

    // instance method;
    void showDetails(){
        int year = 2026;
        System.out.println("Age: "+age);
        System.out.println("year: "+year);
        System.out.println("School name: "+Student.SchoolName);
    }
}




public class variables2{
    public static void main(String[] args){
        Student s1 = new Student(25);
        Student s2 = new Student(26);

        s1.showDetails();
        System.out.println("===========");
        s2.showDetails();
    }
}