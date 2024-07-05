package Exception;

public class Amount{

    private int amount;
    private String currency;

    public Amount(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String toString(){
        return amount + " " + currency;
    }

    public void add(Amount other) throws CurrDontMatchException {
        if(!this.currency.equals(other.currency)){
            //throw new RuntimeException("Currencies don't match");
            //throw new Exception("Currencies don't match");
            throw new CurrDontMatchException("Currecny dont Match");
        }
        this.amount = this.amount + other.amount;
    }

}
