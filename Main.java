//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // main for account
        Account account1 = new Account("1234567890", "alshibani", 1000);
        System.out.println(account1.getName());
        System.out.println(account1.getID());
        System.out.println(account1.getBalance());
        account1.credit(1000); // 1000 + 1000 = 2000
        System.out.println(account1.getBalance());
        if (account1.debit(500) == -1) {
            System.out.println("You Cant Withdraw");
        } else {
          // 2000 - 500 = 1500
            System.out.println("Balance After Withdraw: " + account1.getBalance());
        }

        System.out.println("****************************************");

        //Account another = new Account("0987654321", "amal", 100);
        Account another = new Account();
        another.setName("amal");
        another.setID("12345");
        another.setBalance(100); // 100

        System.out.println(another.getName() + "'s balance before transfer: " + another.getBalance());
        System.out.println(account1.getName() + "'s balance before transfer: " + account1.getBalance());
        if (account1.transferTo(another, 300) == -1) {
            System.out.println("You Cant Transfer");
        } else {
            // Transfer
            System.out.println(another.getName() + "'s balance after transfer: " + another.getBalance());
            System.out.println(account1.getName() + "'s balance after transfer: " + account1.getBalance());
        }
//        if (account1.transferTo(another, 300) != -1) {
//        } else {
//            System.out.println("Cant Transfer");
//        }

        System.out.println(account1.toString(account1));
        System.out.println("*****");
        System.out.println(another.toString(another));
    }
}