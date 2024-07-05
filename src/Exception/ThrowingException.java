package Exception;

public class ThrowingException {
    public static void main(String[] args) throws CurrDontMatchException {
        Amount a1 = new Amount(200,"USD");
        Amount a2 = new Amount(100,"INR");
        a1.add(a2);
        System.out.println(a1);
    }
}
