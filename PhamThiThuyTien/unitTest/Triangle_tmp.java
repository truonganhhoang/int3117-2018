class Triangle_tmp {
    public String isTriangle(int a, int b, int c) {
    int hieu_ab = Math.abs(a - b);
    int hieu_ac = Math.abs(a - c);
    int hieu_bc = Math.abs(b - c);
    int tong_ab = a + b;
    int tong_ac = a + c;
    int tong_bc = b + c;
    int x = Math.pow(a, 2);
    int y = Math.pow(b, 2);
    int z = Math.pow(c, 2);


    if ((a == b) && (b == c)) {

        return("Tam giac deu");
        
    } else if ((x == y + z) || 

               (y == x + z) || 

               (z == x + y)) 
    {

        return("Tam giac vuong");


    } else if ((a > hieu_bc && a < tong_bc) ||

               (b > hieu_ac && b < tong_ac) ||

               (c > hieu_ab && c < tong_ab)) 
    {

        return("Tam giac thuong"); 


    } else {
        return("Khong phai tam giac");
    }
}
}

