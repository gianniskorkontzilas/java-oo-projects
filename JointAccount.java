package gr.aueb.cf.bankapp.model;
/**
 *The {@link  JointAccount} class represents a joint bank account held by two account holders.
 *
 * @author giannis
 *  @since 0.1
 *  @Version 2.0
 */
public class JointAccount {
    private int id;
    private double balance;
    private String accountHolder1;
    private String accountHolder2;

    /**
     * Initializes a new {@link JointAccount}
     * with default values.
     */
    private JointAccount() {

    }

    /**
     * Initializes a newly created point to
     * specific coordinates.
     * @param id         the id-coordinate
     * @param balance    the balance-coordinate
     * @param accountHolder1  the accountHolder1-coordinate
     * @param accountHolder2  the accountHolder2-coordinate
     */
    public JointAccount(int id, double balance, String accountHolder1, String accountHolder2) {
        this.id = id;
        this.balance = balance;
        this.accountHolder1 = accountHolder1;
        this.accountHolder2 = accountHolder2;
    }

    /**
     * Gets the id-coordinate.
     *
     * @return the value of id-coordinate
     */
    public int getId(){
        return id;
    }

    /**
     * Sets the {@link JointAccount#id} coordinate.
     *
     * @param id     the value of id-coordinate.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the accountholder1-coordinate.
     *
     * @return the value of accountholder1-coordinate
     */
    public String getAccountholder1(){
        return accountHolder1;
     }

    /**
     * Sets the {@link JointAccount#accountHolder1} coordinate.
     *
     * @param accountHolder1     the value of accountholder1-coordinate.
     */
     public void setAccountHolder1(String accountHolder1) {
        this.accountHolder1 = accountHolder1;
     }
    /**
     * Gets the accountholder2-coordinate.
     *
     * @return the value of accountholder2-coordinate
     */
    public String getAccountHolder2(){
        return accountHolder2;
    }
    /**
     * Sets the {@link JointAccount#accountHolder2} coordinate.
     *
     * @param accountHolder2     the value of accountholder2-coordinate.
     */
    public void setAccountHolder2(String accountHolder2) {
        this.accountHolder2 = accountHolder2;
    }
    /**
     * Gets the balance-coordinate.
     *
     * @return the value of balance-coordinate
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the {@link JointAccount#balance} coordinate.
     *
     * @param balance     the value of balance-coordinate.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws Exception {
 try {
        if (amount < 0) {
            throw new Exception("bad amount");
        }
            balance += amount;
        }catch (Exception e) {
     e.printStackTrace();
     throw e;
    }
    }

    /**
* Converts the account information to a string representation.
*@return A string representation of the overdraft account.
*/
    public String jointAccountToString() {
        return "(" + id + ", " + balance + ", " + accountHolder1  + " " + accountHolder2  + ")";
    }

}
