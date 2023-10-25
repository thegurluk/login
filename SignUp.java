import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        String username, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username:");
        username = input.nextLine();

        System.out.print("Please enter your password:");
        password = input.nextLine();

        if (username.equals("bulutgurluk") && password.equals("43b45g12")) {
            System.out.println("Your information is correct");
        } else {
            System.out.println("your information is not correct.");
            System.out.println("press 2 to reset your password.");
            System.out.println("press 1 to again enter information.");
            int a = input.nextInt();

            switch (a) {
                case 1:
                    Scanner inp= new Scanner(System.in);
                    System.out.println("Please enter your username:");
                    String secondusername = inp.nextLine();

                    System.out.println("Please enter your password:");
                    String secondpassword = inp.nextLine();

                    if (secondusername.equals("bulutgurluk") && secondpassword.equals("43b45g12")) {
                        System.out.println("Your information is correct");
                        System.out.println("successfully");
                    } else {
                        System.out.println("you did not sign up.");
                    }
                    break;

                case 2:
                    Scanner newinput=new Scanner(System.in);
                    System.out.print("please enter new password:");
                    String newpassword = newinput.nextLine();

                    if (newpassword.equals("43b45g12")) {
                        System.out.println("your new password cannot be the same as your old password.");
                        System.out.println("could not login");
                    } else {
                        System.out.println("successfully");
                    }

                  default;  


            }
        }


    }
}
