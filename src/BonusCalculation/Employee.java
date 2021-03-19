package BonusCalculation;

public class Employee {
    String firstName;
    String lastName;
    int employeeNumber;
    double salary;
    int age;

    public double monthlySalary(){
        salary *= 0.8;
        if (salary < 10000){
            salary *= 0.9;
        } else if (salary < 20000){
            salary -= 10000;
            salary *= 0.8;
            salary += 9000;
        } else if (salary < 30000){
            salary -= 20000;
            salary *= 0.68;
            salary += 17000;
        } else if (salary <= 50000){
            salary -= 30000;
            salary *= 0.55;
            salary += 23800;
        } else if (salary > 50001) {
            salary -= 50000;
            salary *= 0.40;
            salary += 34800;
        }

        return salary;
    }
    public double yearlySalary(){
        double yearSalary = monthlySalary();
        yearSalary *= 12;
        return yearSalary;
    }

}
