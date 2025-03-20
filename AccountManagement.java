package Account;

import java.util.Scanner;

public class AccountManagement {
    public static void main(String[] args) {
        Account();
    }

    public static void Account() {
        {
            int account = 10;

            while (true) {

                System.out.println("Please note the number of the operation you selected....");

                System.out.println("1-How many money do you have in your account?");
                System.out.println("2-To deposit money into an account");
                System.out.println("3-How much money do you want to withdraw from the account?");
                System.out.println("4-Log out");
                int YourChoice = new Scanner(System.in).nextInt();


                if (YourChoice == 1) {
                    System.out.println("Your account " + account);
                    break;

                } else if (YourChoice == 2) {
                    System.out.println("Please enter money");
                    int InvestMoney = new Scanner(System.in).nextInt();
                    if (InvestMoney > 0) {
                        account += InvestMoney;
                        System.out.println("Your account " + account);
                    } else {
                        System.out.println("Please enter correct number...");
                    }
                    break;

                } else if (YourChoice == 3) {
                    System.out.println("Enter the amount..");
                    int WithdrawMoney = new Scanner(System.in).nextInt();

                    if (account > WithdrawMoney) {
                        account = account - WithdrawMoney;
                    } else if (WithdrawMoney > account) {
                        System.out.println("You can't withdraw money because there is no money in the account...");
                        System.out.println("operation ended...");
                        break;
                    }
                    System.out.println("The money has been withdrawn from the account, thank you..");
                } else if (YourChoice == 4) {

                    System.out.println("No operation selected, exiting operation. Thank you!");

                } else {
                    System.out.println("Please enter one of the numbers -1;2;3;4, nothing else!");
                }
            }
        }
    }
}
