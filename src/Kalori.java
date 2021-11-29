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

    
    double testtomeg;
    double magassag;
    double eletkor;

    public void setDatas(double testtomeg, double magassag, double eletkor){
        this.testtomeg=testtomeg;
        this.magassag=magassag;
        this.eletkor=eletkor;
    }

    public void getDatas() {
        testtomeg = Input.input("Testtömeg: ");
        magassag = Input.input("Magasság: ");
        eletkor = Input.input("Életkor: ");
        
    }
    

    public double calcKaloriaFerfi(){      
            
        double kaloriaFerfi= 13.397*this.testtomeg+4.799*this.magassag-5.667*this.eletkor+88.362; 
        return kaloriaFerfi;
    }

    public double calcKaloriaNo(){
        
        double kaloriaNo= 9.247* this.testtomeg+3.098*this.magassag - 4.330*this.eletkor+447.593;
        return kaloriaNo;
    }
}
