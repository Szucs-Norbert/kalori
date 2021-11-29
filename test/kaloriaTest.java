import static org.junit.jupiter.Assertions.assertEquals;
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
        double expectedArea= 525.0;
        double actualKaloriaFerfi= this.kalori.kaloriaFerfi(testtomeg, magassag, eletkor);

        assertEquals(expectedArea, actualArea);
    
    }

    
}
