import java.util.Scanner;

public class SavingaccountImpl {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter accountnumber");
        long accountnumber=Sc.nextLong();
        System.out.println("enter account holder name");
        String accountholdername=Sc.next();
        Savingaccount bank=new Savingaccount(accountholdername,accountnumber,25000,"running");
        bank.displaymenu();
        System.out.println("enter 1 for check balance,2 debit cash, 3 creditcash ");
        int choice=Sc.nextInt();
        double balanceamount;
        switch(choice){
            case 1:
                bank.calculateBalanceamount();
                break;
            case 2:
                System.out.println("enter debit cash");
                double debitcash=Sc.nextDouble();
                bank.calculatedebitamount(debitcash);

                break;
            case 3:
                System.out.println("enter credit cash");
                double creditcash=Sc.nextDouble();
                bank.calculatecreditedamount(creditcash);
                break;

        }
        bank.displaydetails();
    }
}