public class CFGExample {
    public static float [] solveFormula (float a, float b, float c) {
        float [] x = new float [2];
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                x[0] = x[1] = Float.MIN_VALUE;
            } else {
                x[0] = x[1] = (-c / b);
            }
        } else {
            // tính delta
            float delta = b*b - 4*a*c;
            // tính nghiệm
            if (delta > 0) {
                x[0] = (float) ((-b - Math.sqrt(delta)) / (2*a));
                x[1] = (float) ((-b + Math.sqrt(delta)) / (2*a));
            } else if (delta == 0) {
                x[0] = x[1] = (-b / (2 * a));
            } else {
                x[0] = x[1] = Float.MIN_VALUE;;
            }
        }
        return x;
    }
}
