package EMPLOYEE_WAGE_USECASES;

public class Employee_Wage {
    public static void main(String[] args){
        System.out.println("Welcome To Employee Wage Computation Program");
        int max=1;
        int min=0;
        int present=(int)(Math.random()*(max-min+1));//case 1:Check Employee is Present or Absent
        if(present==1){
            System.out.println("employee is present");
        } else{
            System.out.println("employee is absent");
        }
        int wage_per_hr = 20;//per hr pay
        int full_day_hr = 8;//total no of hrs
        present = (int) (Math.random()*(max-min+1));//case 2:Calculate Daily Employee Wage
        if (present == 1) {
            System.out.println("employee is present");
            int salary=(wage_per_hr*full_day_hr);
            System.out.println("salary is:"+salary);
        }
        else{
            System.out.println("employee is absent and salary is zero");
        }
        wage_per_hr = 20;//per hr pay
        int full_time = (int) (Math.random()*(max-min+1));//case 3:Add Part time Employee & Wage
        if (full_time == 1) {
            System.out.println("full time employee");
            int full_time_hrs=16;
            int salary=(wage_per_hr*full_time_hrs);
            System.out.println("salary is:"+salary);
        }
        else{
            System.out.println("part time employee");
            int part_time_hrs=8;
            int salary=(wage_per_hr*part_time_hrs);
            System.out.println("salary is:"+salary);
        }
        int employee_type;
        max=1;
        min=0;
        employee_type=(int) (Math.random()*(max-min+1));//case 4:Solving using Switch Case Statement
        wage_per_hr = 20;
        int part_time_hrs=8;
        int full_time_hrs=16;
        switch(employee_type) {
            case 1:
                System.out.println("part time employee");
                int salary = (wage_per_hr * part_time_hrs);
                System.out.println("salary: "+salary);
                break;
            case 2:
                System.out.println("full time employee");
                salary = (wage_per_hr * full_time_hrs);
                System.out.println("salary: "+salary);
                break;
            default:
                System.out.println("not an employee");
                break;
        }
    }
}
