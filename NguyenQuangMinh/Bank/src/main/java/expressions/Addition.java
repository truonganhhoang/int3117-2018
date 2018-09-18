package expressions;

public class Addition implements BinaryExpression {
    private Expression left;
    private Expression right;

    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override

    public Expression left(){
        return left;
    }

    public Expression right(){
        return right;
    }

    public String toString(){
        return String.format("(%s + %s)", this.left.toString(), this.right.toString());
    }

    public int evaluate(){
        return left.evaluate() + right.evaluate();
    }

}
