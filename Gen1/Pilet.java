/**
 * Pilet
 */
public class Pilet {
    private String piletiOmanik;
    private String filmiInfo;

    public Pilet(String inOmanik, String inFilmiInfo) {
        this.piletiOmanik = inOmanik;
        this.filmiInfo = inFilmiInfo;
    }

    public String toString() {
        return String.format(
            "%s | Film: %s",
            this.piletiOmanik, this.filmiInfo
        );
    }
}