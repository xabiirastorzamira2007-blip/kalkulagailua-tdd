package com.zubirimanteo.ssa32.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KalkulagailuaTest {

    @Test
    void oinarrizkoBatuketaTest() {
        Kalkulagailua kalk = new Kalkulagailua();

        int emaitza = kalk.batu(2, 3);

        assertEquals(5, emaitza, "2 + 3 batuketak 5 izan beharko luke");
    }
    @Test
void oinarrizkoKenketaTest() {
    Kalkulagailua kalk = new Kalkulagailua();

    int emaitza = kalk.kendu(10, 4);

    assertEquals(6, emaitza);
}
@Test
void oinarrizkoBiderketaTest() {
    Kalkulagailua kalk = new Kalkulagailua();

    int emaitza = kalk.biderkatu(5, 5);

    assertEquals(25, emaitza);
}
}