package exception.lesson3;

public class NullBounds extends NullPointerException{
    public NullBounds(int index){
        super(index + " Is empty");
    }
}
