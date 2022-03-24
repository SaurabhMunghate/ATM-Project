import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$' ### , ##0.00");

    HashMap<Integer, Integer> data= new HashMap<Integer, Integer>();

    public void getLogin() throws IOException{
        int x = 1;
        do {
            try{
                data.put(7893467,23467);
                data.put(7894562,34578);

                System.out.println("Welcome to thee ATM project!");
                System.out.println("Enter your customer Number");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter you PIN number:");
                setPinNumber(menuInput.nextInt());
            }
            catch(Exception e){
                System.out.println("\n"+ "Invalid Character(s). Only Numbers ." + "\n");
                x = 2;
            }
            int cn = setCustomerNumber();
            int pn = setPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            }else {
                System.out.println("\n" + "Wrong Customer Number or Pin Number"+"\n");
            }
        }while (x == 1);
    }

    public void getAccountType(){
        System.out.println("Select the Account you Want to Access:");
        System.out.println("Type 1 - checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You for using this ATM, bye. \n");
                break;
            default:
                System.out.println("\n"+"Invalid Choice."+"\n");
                getAccountType();
        }
    }

    public void AccountType(){
        System.out.println("Select the Account you Want to Access:");
        System.out.println("Type 1-Checking Account");
        System.out.println("Type 2-Saving Account");
        System.out.println("Type 3-Exit");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
        }
    }

    public void getChecking(){
        System.out.println("Checking Account:");;
        System.out.println("Type 1-View Balance");
        System.out.println("Type 2-Withdraw funds");
        System.out.println("Type 3-Deposit Funds");
        System.out.println("Type 4-Exit");
        System.out.println("Choice: ");

        int selection = menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Checking Account Balance:" + moneyFormat.format(getChecking()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM, bye");
                break;
            default:
                System.out.println("\n" + "Invalid Choice ."+"\n");
                getChecking();
        }
    }

    public void getSaving(){
        System.out.println("Saving account:");
        System.out.println("Type 1-View Balance");
        System.out.println("Type 2-Withdraw Funds");
        System.out.println("Type 3-Deposit Funds");
        System.out.println("Type 4-Exit");
        System.out.println("Choice");

        int selections = menuInput.nextInt();

        switch (selections){
            case 1:
                System.out.println("Saving Account Balance:"+moneyFormat(getSaving()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for using this ATM, bye.");
                break;
            default:
                System.out.println("\n"+"Invalid Choice ."+"\n");
                getChecking();
        }
    }


}