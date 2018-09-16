package demojunit;

/**
 *
 * @author NguyenDucNhien
 */
public class DemoJunit {
    /**
     * phuong thuc danh gia chi so BMI
     * @param canNang (kg)
     * @param chieuCao (cm)
     * @return 
     */
    public static String BMI(double canNang, double chieuCao){
        double bmi = canNang/(chieuCao*chieuCao);
        if(bmi<18.5){
            return("Thieu can");
        }
        else if(bmi >= 18.5 && bmi <22.99){
            return("Binh thuong");
        }
        else if(bmi >= 23 && bmi <24.99){
            return("Thua can");
        }
        return "Beo phi";
    }   
    public static void main(String[] args) {
    }
    
}
