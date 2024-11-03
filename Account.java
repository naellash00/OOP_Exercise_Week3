public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account() {

    }

    // constructor 1
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // constructor 2
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }


    // getters:
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // setters:
    public void setID(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalanace(int balance) {
        this.balance = balance;
    }

    //withdraw (+)
    public int credit(int amount) {
        //first update the balance
        setBalanace(balance + amount);
        return balance + amount;
    }

    //deposit (-)
    public int debit(int amount) {
        //change the balance
        setBalanace(balance - amount);
        return balance - amount;
    }

    public int transferTo(Account another, int amount) {
        int theNewBalance = another.getBalance() + amount;
        // update the another account balance
        another.setBalanace(theNewBalance);
        // the person who transferred should withdraw the amount from their account
        //setBalanace(getBalance(balance-amount));
        debit(amount);
        return theNewBalance;
    }

    public String toString(Account account){
        return " Your Name: " + account.getName()
                + "\n Your ID: " + account.getID()
                + "\n Your Balance: " + account.getBalance();
    }

}
