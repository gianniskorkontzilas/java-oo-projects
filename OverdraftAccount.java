package gr.aueb.cf.bankapp.model;

/**
 *The {@link OverdraftAccount} class represents a bank account with overdraft capability.
 *It allows withdrawal of amounts greater than the current balance, up to a specified overdraft limit
 *
 *
 * @author giannis
 *  @since 0.1
 *  @Version 2.0
 */
public class OverdraftAccount {
    private int id;
    private double balance;
    private double overdraftLimit;

    /**
     * Initializes a new {@link OverdraftAccount}
     * with default values.
     */

    public OverdraftAccount() {

    }
    /**
     * Initializes a newly created point to
     * specific coordinates.
     * @param id         the id-coordinate
     * @param balance    the balance-coordinate
     * @param overdraftLimit the overdraftLimit-coordinate
     */
    public OverdraftAccount(int id, double balance, double overdraftLimit) {
        this.id = id;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }
    /**
     * Gets the id-coordinate.
     *
     * @return the value of id-coordinate
     */
    public int getId() {
        return id;
    }
    /**
     * Sets the {@link OverdraftAccount#id} coordinate.
     *
     * @param id     the value of id-coordinate.
     */
    public void setId(int id) {
        this.id = id;
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
     * Sets the {@link OverdraftAccount#balance} coordinate.
     *
     * @param balance     the value of balance-coordinate.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    /**
     * Gets the overdraftLimit-coordinate.
     *
     * @return the value of overdraftLimit-coordinate
     */
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    /**
     * Sets the {@link OverdraftAccount#overdraftLimit} coordinate.
     *
     * @param overdraftLimit     the value of overdraftLimit-coordinate.
     */
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Withdraws a specified amount from the account, considering the overdraft limit.
     *
     * @param amount The amount to be withdrawn.
     * @throws Exception If the amount is negative or exceeds the overdraft limit.
     */

    public void withdraw(double amount) throws Exception {
        try {
            if (amount < 0 || amount < balance) {
                throw new Exception("Negative amount");
            }
            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
    /**
     * Returns the state of {@link OverdraftAccount} instance
     * as a {@link String}
     *
     * @return a string representation of {@link OverdraftAccount}
     *          instance.
     * */
    public String overdraftToString() {
        return "(" + id + ", " + balance + ", " + overdraftLimit  + ")";
    }
}


