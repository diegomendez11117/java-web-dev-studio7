package org.launchcode.studio7;

import java.sql.Time;
import java.util.ArrayList;

public class ConsoleReader {
    private ArrayList<CD> CDs = new ArrayList<>();
    private ArrayList<DVD> DVDs = new ArrayList<>();

    public ConsoleReader() {
        CD cd1 = new CD(507, true, "Music From 80s", "Maxell", "TRESS", "Bee Gees", 22);
        CD cd2 = new CD(800, false, "English School Audio", "Verbatin ", "Verbs", "Teacher", 40);
        CD cd3 = new CD(789, false, "Pop", "Maxell", "Thriller", "Michael Jackson", 10);

        CDs.add(cd1);
        CDs.add(cd2);
        CDs.add(cd3);

        DVD dvd1 = new DVD(4800, true, "Movie", "ASUS", "The Lord of The Rings", new Time(1405255));
        DVD dvd2 = new DVD(4800, true, "Documentary", "ASUS", "Blue Planet", new Time(15655));

        DVDs.add(dvd1);
        DVDs.add(dvd2);
    }

    public ArrayList<CD> getCDs() {
        return CDs;
    }

    public void setCDs(ArrayList<CD> CDs) {
        this.CDs = CDs;
    }

    public ArrayList<DVD> getDVDs() {
        return DVDs;
    }

    public void setDVDs(ArrayList<DVD> DVDs) {
        this.DVDs = DVDs;
    }
}
