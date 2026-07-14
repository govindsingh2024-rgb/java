import java.util.Scanner;

public class EasyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "Ansaar";

        System.out.print("Enter password: ");
        String userInput = sc.nextLine();

        // FIRST TRY
        if(userInput.equals(password)) {
            System.out.println("Welcome in Ali Baba shop!");
        }
        else {
            System.out.println("Are you sure your password is correct? Try again");
            userInput = sc.nextLine();

            // SECOND TRY
            if(userInput.equals(password)) {
                System.out.println("Welcome in Ali Baba shop in 2nd try!");
            }
            else {
                System.out.println("Try again (Last attempt):");
                userInput = sc.nextLine();

                // THIRD TRY
                if(userInput.equals(password)) {
                    System.out.println("Welcome in Ali Baba shop in 3rd try!");
                }
                else {
                    System.out.println("You are failed!");
                }
            }
        }

        sc.close();
    }
}

