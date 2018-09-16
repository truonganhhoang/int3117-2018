import java.util.HashSet;
import java.util.Set;

public class triangle {

    public enum TriangleKind {
        EQUILATERAL,
        ISOSCELES,
        SCALENE
    }

    private double side1;
    private double side2;
    private double side3;

    private boolean allSizeZero() {
        return side1 == 0 && side2 == 0 && side3 == 0;
    }

    private boolean hasNegativeSide() {
        return side1 < 0 || side2 < 0 || side3 < 0;
    }

    private boolean qualification() {
        return side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1;
    }


    public triangle(double side1, double side2, double side3) throws Exception {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if (allSizeZero() || hasNegativeSide() || qualification()) {
            throw new Exception();
        }
    }

    public TriangleKind getKind() {
        int uniqueSides = getNumberOfUniqueSides();

        if (uniqueSides == 1) {
            return TriangleKind.EQUILATERAL;
        }

        if (uniqueSides == 2) {
            return TriangleKind.ISOSCELES;
        }

        return TriangleKind.SCALENE;
    }

    public int getNumberOfUniqueSides() {
        Set<Double> sides = new HashSet();

        sides.add(side1);
        sides.add(side2);
        sides.add(side3);

        return sides.size();
    }
}