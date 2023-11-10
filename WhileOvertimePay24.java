import java.util.Scanner;

/**
 * WhileOvertimePay24
 */
public class WhileOvertimePay24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numEmployee, overtimeHours;
        double overtimePay=0, totalOvertimePay=0;
        String position;

        System.out.print("Employee number = ");
        numEmployee = sc.nextInt();

        int i=0;
        while (i < numEmployee) {
            System.out.println("Position of employee - (director, manager, staff)" );
            System.out.print("Input the position employee-" + (i+1) + " : ");
            position = sc.next();
            System.out.print("Input the number pf overtime hours : ");
            overtimeHours = sc.nextInt();
            i++;

            if (position.equalsIgnoreCase("director")) {
                continue;
            } else if (position.equalsIgnoreCase("manager")) {
                overtimePay=overtimeHours * 100000;
            }
            else if (position.equalsIgnoreCase("staff")) {
                overtimePay=overtimeHours * 75000;
            }
             
            totalOvertimePay += overtimePay;
            System.out.println("Total of overtime Pay = "+totalOvertimePay);
        }         
    }            
}
            