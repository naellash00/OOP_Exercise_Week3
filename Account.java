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

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //withdraw (+)
    public int credit(int amount) {
        //first update the balance
        setBalance(balance + amount);
        return balance + amount;
    }

    //deposit (-)
    public int debit(int amount) {
        // first check if they have enough balance
        if (balance >= amount) {
            //change the balance
            setBalance(balance - amount);
            return balance - amount;
        }
        return -1;
    }

    public int transferTo(Account another, int amount) {
        // also check here if they have enough balance
        int theNewBalance;
        if(balance >= amount){
            theNewBalance = another.getBalance() + amount;
            // update the another account balance
            another.setBalance(theNewBalance);
            // the person who transferred should withdraw the amount from their account
            debit(amount);
            return theNewBalance;
        }
        return -1;
    }

    public String toString(Account account) {
        return " Your Name: " + account.getName()
                + "\n Your ID: " + account.getID()
                + "\n Your Balance: " + account.getBalance();
    }

}
