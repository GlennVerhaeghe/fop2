import java.util.Random;

public class Main {

    private static final Random random = new Random();

    public static void main(String[] args) {
        // Creeer studenten
        Student jan = new Student("Jan", "Delange");
        Student kim = new Student("Kim", "Dekorte");
        Student ann = new Student("Ann", "Degrote");

        // Creeer vakken
        Vak coop = new Vak("Concepten OOP", "COOP", 6);
        Vak stat = new Vak("Statistiek", "STAT", 3);
        Vak engels = new Vak("Engels", "ENGELS", 2);
        Vak pl = new Vak("ProgrammaLogica", "PL", 5);

        Vak[] vakken = new Vak[]{coop, stat, engels, pl};

        // Creeer trajecten
        Traject trajectJan = new Traject(jan);
        Traject trajectKim = new Traject(kim);
        Traject trajectAnn = new Traject(ann);

        Traject[] trajecten = new Traject[]{trajectJan, trajectKim, trajectAnn};

        // Voeg vakken toe aan trajecten
        for (Traject traject : trajecten) {
            for (Vak vak : vakken) {
                traject.voegVakToe(vak);
            }
        }

        // Geef punten voor de vakken (In 1 op 10 gevallen wordt een examen niet afgelegd)
        for (Traject traject : trajecten) {
            for (Vak vak : vakken) {
                if (random.nextInt(10) != 9) {
                    traject.geefScore(vak, random.nextInt(0, 21));
                }
            }
        }

        // Print de trajecten af
        for (Traject traject : trajecten) {
            System.out.println(traject);
        }
    }
}
