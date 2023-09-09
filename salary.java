import java.util.*;

public class salary {
   public static void main(String arg[]){
    Scanner info =  new Scanner(System.in);

    //Declare Variables
    double totalNetPay = 0, totalDeductions = 0, GrossPay = 0, NetPay = 0, avgNetPay = 0;

    //For Loop
    for(int i = 0; i < 15; i++){

        //taking employee information
        System.out.println("Enter the name of employee : ");
        String name = info.next();
        System.out.println("Enter employee status(0 for Junior Employee and 1 for Senior Employee): ");
        int status = info.nextInt();
        System.out.println("Enter number of hours worked:");
        int HoursWorked = info.nextInt();
        System.out.println("Enter number of children:");
        int NumberOfChildren = info.nextInt();

        //Calculate Gross Pay
        if (status == 0){
            if(HoursWorked <= 40){
                GrossPay = ( 50 * 0.7 * HoursWorked);
            }
            else if(HoursWorked > 40){
                GrossPay = (50 * 0.7 * 40) + (50 * 0.7 * (HoursWorked - 40) * 1.25);
            }
        }
        if(status == 1){
            if(HoursWorked <= 40 ){
                GrossPay = (50 * HoursWorked);
            }
            else if(HoursWorked > 40){
                GrossPay = (50 * 40) + (50 * (HoursWorked - 40) * 1.5);
            }
        }

        //Calculate total deductions
        if(NumberOfChildren <= 3){
            totalDeductions = (GrossPay * 0.15) + (GrossPay * 0.01) + (GrossPay * 0.03);
        }
        else{
            totalDeductions = (GrossPay * 0.15) + (GrossPay * 0.01) + (GrossPay * 0.03) + (NumberOfChildren - 3);
        }

        //Calculate Net Pay
        NetPay = (GrossPay - totalDeductions);
        System.out.println("Gross pay for " + name + "  is : " + GrossPay);
        System.out.println("total deductions is : " + totalDeductions);
        System.out.println("Net pay is : " + NetPay);
        totalNetPay = totalNetPay + NetPay;
    }

    //Display total net pay
    System.out.println("total net pay paid to employees is : " + totalNetPay);

    //Calculate average net pay
    avgNetPay = (NetPay / 15);

    //Display average net pay
    System.out.println("Average net pay paid to employees is : " + avgNetPay);
   } 
}
