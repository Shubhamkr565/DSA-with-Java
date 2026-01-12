// public class variables{
//     public static void main(String[] args){
//         // local variable
//         int x = 10;
//         System.out.println(x);
        
//         // local inner class
//         class student{
//             int age = 20;
//         }
//         student s = new student();
//         System.out.println(s.age);
//     }
// }



// class Student{
//     // instance variable
//     int age = 10;
// }

// public class variables{
//     public static void main(String[] agrs){
//         Student s = new Student();
//         System.out.println(s.age);
//     }
// }




// using static variables
class School{
    static String School_name = "AND.Public School";
}

public class variables{
    public static void main(String[] args){
        // School s = new School();

        System.out.println(School.School_name);
    }
}