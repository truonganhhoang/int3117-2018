public class PhoneNumber {
    public static final String viettel = "VIETTEL";
    public static final String vinaphone = "VINAPHONE";
    public static final String mobiphone = "MOBIPHONE";
    public static final String vietnammobile = "VIETNAMMOBILE";
    public static final String gmobile = "GMOBILE";

    private String phone_no;
    private String network;

    public PhoneNumber(String phone_no) {
        this.phone_no = phone_no;
        this.normlizePhoneNo();
        this.classifyNetwork();
    }

    public String convertTo10Digits() {
        this.classifyNetwork();
        if (phone_no.length() == 9) {
            return phone_no;
        }
        switch (this.network) {
            case viettel:
                if (phone_no.startsWith("16")) {
                    phone_no = "3" + phone_no.substring(2);
                }
                return phone_no;

            case vinaphone:
                if (phone_no.startsWith("127")) {
                    phone_no = "81" + phone_no.substring(3);
                    return phone_no;
                }
                if (phone_no.startsWith("129")) {
                    phone_no = "82" + phone_no.substring(3);
                    return phone_no;
                }

                if (phone_no.startsWith("12")) {
                    phone_no = "8" + phone_no.substring(2);
                }
                return phone_no;

            case mobiphone:
                if (phone_no.startsWith("120")) {
                    phone_no = "70" + phone_no.substring(3);
                }
                if (phone_no.startsWith("121")) {
                    phone_no = "79" + phone_no.substring(3);
                }
                if (phone_no.startsWith("122")) {
                    phone_no = "77" + phone_no.substring(3);
                }
                if (phone_no.startsWith("126")) {
                    phone_no = "76" + phone_no.substring(3);
                }
                if (phone_no.startsWith("128")) {
                    phone_no = "78" + phone_no.substring(3);
                }
                return phone_no;

            case vietnammobile:
                return phone_no;

            case gmobile:
                if (phone_no.startsWith("199")) {
                    phone_no = "59" + phone_no.substring(3);
                }
                return phone_no;

            default:
                return phone_no;
        }
    }

    String normlizePhoneNo() {
        String res;
        res = this.phone_no.replaceAll(" ", "");
        res = res.replace("+84", "");
        if (res.startsWith("0")) {
            res = res.substring(1);
        }
        this.phone_no = res;
        return res;
    }

    String standardizedPhoneNo() {
        if (phone_no.length() == 10) {
            this.convertTo10Digits();
        }
        String res = phone_no;
        if (!network.equals("?")) {
            res = "+84 " + phone_no.substring(0, 3) + " " + phone_no.substring(3, 6) + " " + phone_no.substring(6, 9);
        }
        return res;
    }

    String classifyNetwork() {
        String[] viettelHeaders = {"86", "96", "97", "98", "162", "163", "164", "165", "166", "167", "168", "169", "32", "33", "34", "35", "36", "37", "38", "39"};
        String[] vinaphoneHeaders = {"91", "94", "123", "124", "125", "127", "129", "83", "84", "85", "81", "82"};
        String[] mobiphoneHeaders = {"90", "93", "120", "121", "122", "126", "128", "70", "79", "77", "76", "78"};
        String[] vietnammobileHeaders = {"92", "56", "58"};
        String[] gmobileHeaders = {"99", "199", "59"};

        if (phone_no.length() != 10 && phone_no.length() != 9) {
            network = "?";
            return network;
        }
        String lheader = phone_no.substring(0, 3);
        String sheader = phone_no.substring(0, 2);
        if (isInArray(lheader, viettelHeaders) || isInArray(sheader, viettelHeaders)) {
            network = viettel;
            return network;
        }
        if (isInArray(lheader, vinaphoneHeaders) || isInArray(sheader, vinaphoneHeaders)) {
            network = vinaphone;
            return network;
        }
        if (isInArray(lheader, mobiphoneHeaders) || isInArray(sheader, mobiphoneHeaders)) {
            network = mobiphone;
            return network;
        }
        if (isInArray(lheader, vietnammobileHeaders) || isInArray(sheader, vietnammobileHeaders)) {
            network = vietnammobile;
            return network;
        }
        if (isInArray(lheader, gmobileHeaders) || isInArray(sheader, gmobileHeaders)) {
            network = gmobile;
            return network;
        }
        network = "?";
        return network;
    }

    static boolean isInArray(String target, String[] strarr) {
        for (String header : strarr) {
            if (target.equals(header)) {
                return true;
            }
        }
        return false;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
}
