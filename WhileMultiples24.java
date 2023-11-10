import java.util.Scanner;

/**
 * WhileMultiples24
 */
public class WhileMultiples24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int multiple, sum=0, counter=0, i=1;
        float Averge;

        System.out.print("Input the multiple = ");
        multiple = input24.nextInt();

        while (i<=50) {
            if (i%multiple==0) {
                sum += 1;
                counter++;
            }
        i++;
        }
    Averge = sum / counter;
    System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n", counter, multiple);
    System.out.printf("The sum from all multiple of %d in range 1 s.d. 50 is %d. \n", multiple, sum);       
    System.out.printf("Averge from %d is %.3f\n", counter, Averge);
    }
}