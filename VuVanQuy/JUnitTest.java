package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

    @Test
    public void kiemTraTamGiacKhongTonTai() {
        JUnit test = new JUnit();
        Assert.assertEquals("Kich thuoc da cho khong phai la 3 canh tam giac", test.kiemTraTamGiac(1, 2,3));
    }

    @Test
    public void kiemTraTamGiacdeu() {
        JUnit test = new JUnit();
       
       Assert.assertEquals("Tam giac deu", test.kiemTraTamGiac(5,5,5));
    }


    @Test
    public void kiemTraTamGiacCan() {
        JUnit test = new JUnit();
        Assert.assertEquals("Tam giac can", test.kiemTraTamGiac(5,5,6));
    }
    
    @Test
    public void kiemTraTamGiacVuong() {
        JUnit test = new JUnit();
        Assert.assertEquals("Tam giac vuong", test.kiemTraTamGiac(3,4,5));
    }
    
    @Test
    public void kiemTraTamGiacThuong() {
        JUnit test = new JUnit();
        Assert.assertEquals("Tam giac thuong", test.kiemTraTamGiac(4,5,6));
    }
    
    
    
    
    //week11
    @Test
    public void testCompareToPath1() {
        JUnit test = new JUnit();
        Assert.assertEquals("Kich thuoc da cho khong phai la 3 canh tam giac", test.kiemTraTamGiac(6, 1,3));
    }

    @Test
    public void testCompareToPath2() {
        JUnit test = new JUnit();
       
       Assert.assertEquals("Tam giac deu", test.kiemTraTamGiac(6,6,6));
    }


    @Test
    public void testCompareToPath3() {
        JUnit test = new JUnit();
        Assert.assertEquals("Tam giac can", test.kiemTraTamGiac(4,4,5));
    }
    
    @Test
    public void testCompareToPath4() {
        JUnit test = new JUnit();
        Assert.assertEquals("Tam giac vuong", test.kiemTraTamGiac(30,40,50));
    }
    
    @Test
    public void testCompareToPath5() {
        JUnit test = new JUnit();
        Assert.assertEquals("Tam giac thuong", test.kiemTraTamGiac(8,9,10));
    }
    
}

    
    
}


