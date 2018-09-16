package expressions;


public class Numeral implements Expression {
    private int value;

    public Numeral(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }

    @Override
    public int evaluate(){
        return this.value;
    }

}
