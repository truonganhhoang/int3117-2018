import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestPhoneNumberClass extends TestCase {
    public TestPhoneNumberClass(String name){
        super(name);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(new TestSuite(TestPhoneNumberClass.class));
    }

    public void testNormalizePhoneNumber(){
        PhoneNumber pn = new PhoneNumber("0168  616 3447");
        assertEquals("1686163447", pn.getPhone_no());

        pn = new PhoneNumber("+84 974 542 443");
        assertEquals("974542443", pn.getPhone_no());
    }

    public void testStandardizedPhoneNumber(){
        PhoneNumber pn = new PhoneNumber("0947 123 344");
        assertEquals("+84 947 123 344", pn.standardizedPhoneNo());

        pn = new PhoneNumber("01686163449");
        assertEquals("+84 386 163 449", pn.standardizedPhoneNo());

        pn = new PhoneNumber("+140495");
        assertEquals("+140495", pn.standardizedPhoneNo());
    }

    public void testClassifyNetwork(){
        PhoneNumber pn = new PhoneNumber("+43 1234 890 777");
        assertEquals("?", pn.classifyNetwork());
        pn = new PhoneNumber("0168 1234 5678");
        assertEquals("?", pn.classifyNetwork());

        String[] viettelPhoneNo = {"0168 123 4456", "+84961234567", "0863 465 789"};
        for (String phoneNo: viettelPhoneNo){
            pn = new PhoneNumber(phoneNo);
            assertEquals(PhoneNumber.viettel, pn.classifyNetwork());
        }

        String[] vinaPhoneNo = {"0913 45 3248", "+841238270497", "0127 123 45 67"};
        for (String phoneNo: vinaPhoneNo){
            pn = new PhoneNumber(phoneNo);
            assertEquals(PhoneNumber.vinaphone, pn.classifyNetwork());
        }

        String[] mobiPhoneNo = {"0903 45 3248", "+84 120 827 04 97", "0126 123 45 67"};
        for (String phoneNo: mobiPhoneNo){
            pn = new PhoneNumber(phoneNo);
            assertEquals(PhoneNumber.mobiphone, pn.classifyNetwork());
        }

        String[] vnmbPhoneNo = {"0923 45 3248", "+84568270497", "058 123 45 67"};
        for (String phoneNo: vnmbPhoneNo){
            pn = new PhoneNumber(phoneNo);
            assertEquals(PhoneNumber.vietnammobile, pn.classifyNetwork());
        }

        String[] gmbPhoneNo = {"0993 45 3248", "+84199 8270497", "059 123 45 67"};
        for (String phoneNo: gmbPhoneNo){
            pn = new PhoneNumber(phoneNo);
            assertEquals(PhoneNumber.gmobile, pn.classifyNetwork());
        }
    }

    public void testConvertTo10Digits(){
        //10 digits & Unknown Network
        PhoneNumber pn = new PhoneNumber("0866 786 958");
        assertEquals("866786958", pn.convertTo10Digits());
        pn = new PhoneNumber("+1401113245");
        assertEquals("+1401113245", pn.convertTo10Digits());

        //VIETTEL
        pn = new PhoneNumber("0162 123 45 67");
        assertEquals("321234567", pn.convertTo10Digits());
        pn = new PhoneNumber("+84163 123 45 67");
        assertEquals("331234567", pn.convertTo10Digits());
        pn = new PhoneNumber("0164 123 45 67");
        assertEquals("341234567", pn.convertTo10Digits());
        pn = new PhoneNumber("+841651234567");
        assertEquals("351234567", pn.convertTo10Digits());
        pn = new PhoneNumber("+84 166 123 45 67");
        assertEquals("361234567", pn.convertTo10Digits());
        pn = new PhoneNumber("+84 167 123 45 67");
        assertEquals("371234567", pn.convertTo10Digits());
        pn = new PhoneNumber("+84 1681234567");
        assertEquals("381234567", pn.convertTo10Digits());
        pn = new PhoneNumber("+84169 123 45 67");
        assertEquals("391234567", pn.convertTo10Digits());



        //MOBIPHONE
        pn = new PhoneNumber("0120 345 3455");
        assertEquals("703453455", pn.convertTo10Digits());
        pn = new PhoneNumber("01213453455");
        assertEquals("793453455", pn.convertTo10Digits());
        pn = new PhoneNumber("0122 345 3455");
        assertEquals("773453455", pn.convertTo10Digits());
        pn = new PhoneNumber("0126 345 3455");
        assertEquals("763453455", pn.convertTo10Digits());
        pn = new PhoneNumber("0128 345 3455");
        assertEquals("783453455", pn.convertTo10Digits());

        //VINAPHONE
        pn = new PhoneNumber("+841237891234");
        assertEquals("837891234", pn.convertTo10Digits());
        pn = new PhoneNumber("+841247891234");
        assertEquals("847891234", pn.convertTo10Digits());
        pn = new PhoneNumber("+841257891234");
        assertEquals("857891234", pn.convertTo10Digits());
        pn = new PhoneNumber("+841277891234");
        assertEquals("817891234", pn.convertTo10Digits());
        pn = new PhoneNumber("+841297891234");
        assertEquals("827891234", pn.convertTo10Digits());

        //GMOBILE
        pn = new PhoneNumber("+84199 1234 567");
        assertEquals("591234567", pn.convertTo10Digits());

    }

    public void testIsInArray(){
        String target = "56";
        String target2 = "poem";
        String[] arr = {"aa", "bcuh", "1293", "56", "gnarr"};
        assertEquals(true, PhoneNumber.isInArray(target, arr));
        assertEquals(false, PhoneNumber.isInArray(target2, arr));
    }
}
