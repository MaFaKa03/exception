package exception.lesson3;

public class DivZero extends ArithmeticException{
    private String massage = "Text";
    public DivZero(String massage){
        //this.massage = massage;
        super("Не дели на ноль");
    }
}
