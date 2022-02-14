public class Vak {

    private final String naam;
    private final String code;
    private final int studiepunten;

    public Vak(String naam, String code, int studiepunten) {
        this.naam = naam;
        this.code = code;
        this.studiepunten = studiepunten;
    }

    @Override
    public String toString() {
        return code + " " + naam + " " + studiepunten + " SP ";
    }
}
