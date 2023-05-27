public class Savingaccount {
    String accountholdername;
    long accountnumber;
    double balanceamount;

    String accountstatus;
    Savingaccount(String accountholdername,long accountnumber,double balanceamount,String accountstatus){
        this.accountholdername=accountholdername;
        this.accountnumber=accountnumber;
        this.balanceamount=balanceamount;
        this.accountstatus=accountstatus;
    }

    public double calculateBalanceamount(){

        return balanceamount;
    }
    public double calculatecreditedamount(double creditcash){
        balanceamount=balanceamount+creditcash;
        return balanceamount;
    }
    public double calculatedebitamount(double debitcash){
        balanceamount=balanceamount-debitcash;
        return balanceamount;
    }
    public void displaymenu(){
        System.out.println("1:check balance");
        System.out.println("2:cash withdraw");
        System.out.println("3:debit cash ");
    }
    public void displaydetails(){
        System.out.println("account holder name :"+accountholdername);
        System.out.println("account number :"+accountnumber);
        System.out.println("balance amount :"+balanceamount);
        System.out.println("account status :"+accountstatus);
    }

}