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
        double expectedKaloriaFerfi= 1825.597;
        double actualKaloriaFerfi= this.kalori.kaloriaFerfi(testtomeg, magassag, eletkor);

        assertEquals(expectedKaloriaFerfi, actualKaloriaFerfi);   
    }

    @Test
    void calacKaloriaNo(){
        double testtomeg= 80;
        double magassag= 180;
        double eletkor= 35;
        double expectedKaloriaNo= 1593.4430000000002;
        double actualKaloriaNo= this.kalori.kaloriaNo(testtomeg, magassag, eletkor);

        assertEquals(expectedKaloriaNo, actualKaloriaNo);
    
    }

    
}
