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
    }
}
