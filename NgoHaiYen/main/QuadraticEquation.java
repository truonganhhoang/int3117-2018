package main;

public class QuadraticEquation {
    public static String caculate(float a, float b, float c){
        String result;
        if (a == 0) {
            if (b == 0) {
                if (c == 0){
                    result = "Phương trình có vô số nghiệm";
                } else {
                    result = "Phương trình vô nghiệm!";
                }
            } else {
                result = "Phương trình có một nghiệm: x = " + (-c / b);
            }
            return result;
        }

        float delta = b*b - 4*a*c;
        float x1, x2;
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            result = "Phương trình có 2 nghiệm là: x1 = " + x1 + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            result = "Phương trình có nghiệm kép: x1 = x2 = " + x1;
        } else {
            result = "Phương trình vô nghiệm!";
        }
        return result;
    }
}

