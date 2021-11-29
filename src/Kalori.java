/*
 * File: Kalori.java
 * Created Date: 2021-11-29 08:20:34
 * Author:Szűcs Norbert
 * Github: https://github.com/Szucs-Norbert
 *
 *         
 * -----
 * Last Modified: 2021-11-29
 * Modified By: Szűcs Norbert
 * -----
 * Copyright (c) 2021 Szűcs Norbert
 * Group: Szoft II/N
 * 
 * GNU GPL v2
 */

public class Kalori{
    public double kaloriaFerfi(double testtomeg, double magassag, double eletkor){
        return 13.397*testtomeg+4.799*magassag-5.667*eletkor+88.362;
    }

    public double kaloriaNo(double testtomeg, double magassag, double eletkor){
        return 9.247* testtomeg+3.098*magassag - 4.330*eletkor+447.593;
    }
}
