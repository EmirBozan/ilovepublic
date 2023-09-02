public class Employee {
    String name;
    Double salary;
    int workHours;
    int hireYear;
    Employee (String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    Double tax (){
        Double salaryTax = 0.0;
        if (this.salary < 1000){
            return 0.0;
        }
        else {
            return salaryTax = this.salary*0.03;
        }
    }

    int bonus (){
        if (this.workHours < 40) {
            return 0;
        }
        else {
            int riseSalary = (this.workHours - 40)*30;
            return riseSalary;
        }
    }

    Double raiseSalary () {
        int workedYears = 2021 - this.hireYear;
        if (workedYears<10){
            return this.salary*0.05;
        }
        else if (9<workedYears && workedYears<20){
            return this.salary*0.10;
        }
        else {
            return this.salary*0.15;
        }
    }

    public String toString (){
        return("\nName : "+this.name
        +"\nSalary : "+(this.salary= this.salary+raiseSalary()+bonus()-tax())
        +"\nWork Hours : "+this.workHours
        +"\nHire year : "+this.hireYear);

    }
}