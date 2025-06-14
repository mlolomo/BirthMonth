import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //class Month
        //main()
        //num birthMonth
        //output "Enter your birth month [1-12]: "
        //input birthMonth
        //if birthMonth >= 1 AND birthMonth <= 12 then
        //   output "Your birth month is: " + birthMonth
        //else
        //   output "You entered an incorrect month value: " + birthMonth
        //end if
        //return
        //end class

        int birthMonth = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month [1-12]: ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        }
        else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}