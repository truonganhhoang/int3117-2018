package TestExpression;

import expressions.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestExpression {

    @Test
    public void testNumeralEvaluate() {
        Expression two = new Numeral(2);
        assertEquals(2, two.evaluate());
    }


    @Test
    public void testNumeralToString() {
        Expression two = new Numeral(2);
        assertEquals("2", two.toString());
    }

    @Test
    public void testSquareEvaluate() {
        Expression two = new Numeral(3);
        Expression twoSquare = new Square(two);
        assertEquals(9, twoSquare.evaluate());
    }

    @Test
    public void testSquareToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        assertEquals("2^2", twoSquare.toString());
    }

    @Test
    public void testAdditionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals(6, twoPlusTwoSquare.evaluate());
    }
    @Test
    public void testAdditionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression twoPlusTwoSquare = new Addition(two, twoSquare);
        assertEquals("(2 + 2^2)", twoPlusTwoSquare.toString());
    }

    @Test
    public void testAdditionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression threeSquarePlusOne = new Addition(threeSquare, one);
        Expression theBigSquare = new Square(threeSquarePlusOne);
        assertEquals("(3^2 + 1)^2", theBigSquare.toString());
    }

    @Test
    public void testSubtractionEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression subtract = new Subtraction(two, twoSquare);
        assertEquals(-2, subtract.evaluate());
    }

    @Test
    public void testSubtractionToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression subtract = new Subtraction(two, twoSquare);
        assertEquals("(2 - 2^2)", subtract.toString());
    }

    @Test
    public void tesSubtractionWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression subtract = new Subtraction(threeSquare, one);
        Expression theBigSquare = new Square(subtract);
        assertEquals("(3^2 - 1)^2", theBigSquare.toString());
    }

    @Test
    public void testMultiplicationEvaluate() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression multiplicand = new Multiplication(two, twoSquare);
        assertEquals(8, multiplicand.evaluate());
    }

    @Test
    public void testMultiplicationToString() {
        Expression two = new Numeral(2);
        Expression twoSquare = new Square(two);
        Expression multiplicand = new Multiplication(two, twoSquare);
        assertEquals("(2 * 2^2)", multiplicand.toString());
    }

    @Test
    public void tesMultiplicationWithParenthesesToString() {
        Expression one = new Numeral(1);
        Expression threeSquare = new Square(new Numeral(3));
        Expression multiplicand = new Multiplication(threeSquare, one);
        Expression theBigSquare = new Square(multiplicand);
        assertEquals("(3^2 * 1)^2", theBigSquare.toString());
    }
}
