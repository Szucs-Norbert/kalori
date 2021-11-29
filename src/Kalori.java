public class Kalori{
    public double kaloriaFerfi(double testtomeg, double magassag, double eletkor){
        return 13.397*testtomeg+4.799*magassag-5.667*eletkor+88.362;
    }

    public double kaloriaNo(double testtomeg, double magassag, double eletkor){
        return 9.247* testtomeg+3.098*magassag - 4.330*eletkor+447.593;
    }
}
