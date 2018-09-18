package expressions;

public class Subtraction implements BinaryExpression {
    private Expression left;
    private Expression right;

    public Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left(){
        return left;
    }

    @Override
    public Expression right(){
        return right;
    }

    @Override
    public String toString(){
        return String.format("(%s - %s)", this.left.toString(), this.right.toString());
    }

    @Override
    public int evaluate(){
        return left.evaluate() - right.evaluate();
    }

}
