package EMPLOYEE_WAGE_USECASES;

public class Employee_Wage {
    public static void main(String[] args){
        System.out.println("Welcome To Employee Wage Computation Program");
        int max=1;
        int min=0;
        int present=(int)(Math.random()*(max-min+1));
        if(present==1){
            System.out.println("employee is present");
        } else{
            System.out.println("employee is absent");
        }
        int wage_per_hr = 20;//per hr pay
        int full_day_hr = 8;//total no of hrs
        present = (int) (Math.random()*(max-min+1));
        if (present == 1) {
            System.out.println("employee is present");
            int salary=(wage_per_hr*full_day_hr);
            System.out.println("salary is:"+salary);
        }
        else{
            System.out.println("employee is absent and salary is zero");
        }
        wage_per_hr = 20;//per hr pay
        int full_time = (int) (Math.random()*(max-min+1));
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
    }
}
