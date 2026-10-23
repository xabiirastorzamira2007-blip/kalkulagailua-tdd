
package com.zubirimanteo.ssa32.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IkasleaTest {

    @Test
    void testObjektuenEgoera_Null_NotNull_True_False() {
        Ikaslea ikasle1 = new Ikaslea("100", "Ane", true, new int[]{7, 8, 9});
        Ikaslea ikasleHutsa = null;

        assertNotNull(ikasle1, "Ikaslea ondo sortu beharko litzateke");
        assertNull(ikasleHutsa, "Objektuak null izan behar du");

        assertTrue(ikasle1.isAktibo(), "Ikasleak aktibo egon beharko luke");

        Ikaslea ikasle2 = new Ikaslea("101", "Jon", false, new int[]{5, 6});
        assertFalse(ikasle2.isAktibo(), "Ikasle honek ez luke aktibo egon behar");
    }

    @Test
    void testObjektuenKonparazioa_Equals_NotEquals() {
        Ikaslea ikasleA = new Ikaslea("100", "Ane", true, new int[]{7, 8, 9});
        Ikaslea ikasleB = new Ikaslea("100", "Ane M.", true, new int[]{7, 8, 9});
        Ikaslea ikasleC = new Ikaslea("102", "Mikel", true, new int[]{5, 5, 5});

        assertEquals(ikasleA, ikasleB,
                "ID bera duten ikasleak berdinak dira gure sistemarentzat");

        assertNotEquals(ikasleA, ikasleC,
                "ID desberdina duten ikasleak ez dira berdinak");
    }

    @Test
    void testArrayKonparazioa_ArrayEquals() {
        Ikaslea ikasle1 = new Ikaslea("100", "Ane", true, new int[]{7, 8, 9});
        int[] esperoDirenNotak = {7, 8, 9};

        assertArrayEquals(esperoDirenNotak, ikasle1.getNotak(),
                "Noten zerrendak zehatz-mehatz berdina izan behar du");
    }

    @Test
    void testSalbuespenak_Fail() {
        try {
            Ikaslea ikasleAkastuna =
                    new Ikaslea("103", null, true, new int[]{});

            fail("Ez du espero zen IllegalArgumentException bota");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    void testDatuOkerrak_Fail() {
        Ikaslea ikaslea = new Ikaslea("104", "Ane", true, new int[]{7, 8});

        try {
            ikaslea.setIzena(null);

            fail("setIzena(null) metodoak IllegalArgumentException bota behar du");
        } catch (IllegalArgumentException e) {
            assertNotNull(e.getMessage());
        }
    }
}
