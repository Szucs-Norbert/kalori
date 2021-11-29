/*
 * File: kaloriaTest.java
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

public class kaloriaTest {
    Kalori kalori;
    
    @BeforeEach
    void setUp(){
        this.kalori= new Kalori();
    }

    @Test
    void calacKaloriaFerfi(){
        double testtomeg= 80;
        double magassag= 180;
        double eletkor= 35;
        kalori.setDatas(testtomeg, magassag, eletkor);
        
        double actualKaloriaFerfi= kalori.calcKaloriaFerfi();
        double expectedKaloriaFerfi= 1825.597;

        assertEquals(expectedKaloriaFerfi, actualKaloriaFerfi, 0.01);   
    }

    @Test
    void calacKaloriaFerfi2(){
        double testtomeg= 72;
        double magassag= 165;
        double eletkor= 26;
        kalori.setDatas(testtomeg, magassag, eletkor);
        
        double actualKaloriaFerfi= kalori.calcKaloriaFerfi();
        double expectedKaloriaFerfi= 1825.597;

        assertEquals(expectedKaloriaFerfi, actualKaloriaFerfi, 0.01);   
    }

    @Test
    void calacKaloriaNo(){
        double testtomeg= 80;
        double magassag= 180;
        double eletkor= 35;
        kalori.setDatas(testtomeg, magassag, eletkor);
        
        double actualKaloriaNo= kalori.calcKaloriaNo();
        double expectedKaloriaNo= 1825.597;

        assertEquals(expectedKaloriaNo, actualKaloriaNo, 0.01); 
    }

    @Test
    void calacKaloriaNo2(){
        double testtomeg= 60;
        double magassag= 160;
        double eletkor= 42;
        kalori.setDatas(testtomeg, magassag, eletkor);
        
        double actualKaloriaNo= kalori.calcKaloriaNo();
        double expectedKaloriaNo= 1825.597;

        assertEquals(expectedKaloriaNo, actualKaloriaNo, 0.01); 
    }

    @Test
    @DisplayName("A testomeg 0 teszt Ferfi")
    @Disabled()
    void calacKaloriaFerfiTesttomegZero(){
        assertEquals(0, this.kalori.calcKaloriaFerfi(80, 180, 35));
    }

    @Test
    @DisplayName("A testomeg 0 teszt No")
    @Disabled()
    void calacKaloriaNoTesttomegZero(){
        assertEquals(0, this.kalori.calcKaloriaNo(80, 180, 35));
    }

    
}
