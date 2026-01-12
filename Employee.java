class Employes{
    // instance variable
    int empId;
    int salary;

    static String companyName = "Shubham Sattu Industry";   

    // using constructor
    Employes(int empId, int salary){
        this.empId = empId;
        this.salary = salary;
    }

    // create method
    void showInfo(){
        int year = 2026;
        System.out.println(Employes.companyName);
        System.out.println("EmpId: "+empId);
        System.out.println("Emp Salary: "+salary);
        System.out.println("Year: "+year);
    }
}



public class Employee{
    public static void main(String[] args){
        Employes e1 = new Employes(01, 10000);
        Employes e2 = new Employes(02, 200000);

        e1.showInfo();
        e2.showInfo();
        

    }
}