import java.lang.invoke.LambdaMetafactory;

class NegativeNumbersException extends RuntimeException{
    public NegativeNumbersException(String message){
        super(message);


    }

}
class BankApp{
public static void deposit(int amount){
    if (amount<0){

        throw new NegativeNumbersException("Negative amount cannot be deposited");
    } else {

        System.out.println("Amount deposited"+amount);
    }
}
}
public class UncheckedCustom_Exception {
    public static void main(String[] args) {
        Object deposit;

    }

}
