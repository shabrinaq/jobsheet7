import java.util.Scanner;

/**
 * DoWhileLeaveEntitlement24
 */
public class DoWhileLeaveEntitlement24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Number of Leave Entitlement : ");
        leaveEntitlement = sc.nextInt();
    
        do {
            System.out.print("Do you want to take a leave? (y/n) =  ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Leave number : ");
                numLeave = sc.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("The remaining leave entitlement : " + leaveEntitlement);

                } else {
                    System.out.println("The remaining leave entitlement is not sufficient !");
                    break;
                }
            } else if (confirmation.equalsIgnoreCase("n")) {
                break; 
            }
        }while (leaveEntitlement > 0);
        sc.close();
    }
}