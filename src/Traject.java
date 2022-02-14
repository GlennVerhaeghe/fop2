import java.util.*;

public class Traject {

    private final Student student;
    private final Map<Vak, Integer> vakken;

    public Traject(Student student) {
        this.student = student;
        this.vakken = new HashMap<>();
    }

    public void voegVakToe(Vak vak) {
        vakken.put(vak, null);
    }

    public void geefScore(Vak vak, int score) {
        vakken.put(vak, score);
    }

    public String geslaagdOfNiet() {
        for (Vak vak : vakken.keySet()) {
            if (vakken.get(vak) == null || vakken.get(vak) < 10) {
                return "NIET GESLAAGD";
            }
        }
        return "GESLAAGD";
    }

    public String vakMetScore(Vak vak) {
        if (vakken.get(vak) == null) {
            return vak.toString() + "niet deelgenomen";
        }
        String resultaat;
        if (vakken.get(vak) < 10) {
            resultaat = "niet geslaagd";
        } else {
            resultaat = "credit behaald";
        }
        return vak.toString() + vakken.get(vak) + "/20 " + resultaat;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(student.toString() + " " + geslaagdOfNiet() + "\n");
        for(Vak vak : vakken.keySet()) {
            builder.append(vakMetScore(vak)).append("\n");
        }

        return builder.toString();
    }
}
