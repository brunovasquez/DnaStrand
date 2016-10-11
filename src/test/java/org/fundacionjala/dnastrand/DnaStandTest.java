package org.fundacionjala.dnastrand;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link DnaStrand}.
 */
public class DnaStandTest {

    /**
     * Test to validate the Complement.
     */
    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }

    /**
     * Test to validate the Complement.
     */
    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Test to validate the Complement.
     */
    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}
