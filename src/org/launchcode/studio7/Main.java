package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ConsoleReader CR = new ConsoleReader();
        ArrayList<CD> CDs = CR.getCDs();
        ArrayList<DVD> DVDs = CR.getDVDs();

        for (CD cd: CDs) {
            cd.burnDisc();
            cd.readDisc();
            cd.spinDisc();
        }

        for (DVD dvd: DVDs) {
            dvd.burnDisc();
            dvd.readDisc();
            dvd.spinDisc();
        }

    }
}
