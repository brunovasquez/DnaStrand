package org.fundacionjala.dnastrand;

/**
 * This class to operate with dna.
 */
final class DnaStrand {

    /**
     * Private constructor.
     */
    private DnaStrand() {

    }

    /**
     * This method to make the complements given a dna.
     *
     * @param dna is a string with the dna to be complement.
     * @return the complemented dna.
     */
    static String makeComplement(final String dna) {
        return dna.replaceAll("A", "t")
                .replaceAll("C", "g")
                .replaceAll("T", "a")
                .replaceAll("G", "c")
                .toUpperCase();
    }
}
