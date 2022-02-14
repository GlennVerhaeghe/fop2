public class Student {

    private final String voornaam;
    private final String achternaam;

    public Student(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    @Override
    public String toString() {
        return voornaam + " " + achternaam;
    }

}
