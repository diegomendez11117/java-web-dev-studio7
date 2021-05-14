package org.launchcode.studio7;

import java.sql.Time;

public class DVD extends Disc implements OpticalDisc {

    private String nameOfMovie;
    private Time durationMovie;


    /*
     * Area to declare the DVD
     * constructor.
     */

    public DVD(double storageCapacity, boolean rewritable, String content, String brand, String nameOfMovie, Time durationMovie) {
        super(storageCapacity, rewritable, content, brand);
        this.nameOfMovie = nameOfMovie;
        this.durationMovie = durationMovie;
    }

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public void setNameOfMovie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    public Time getDurationMovie() {
        return durationMovie;
    }

    public void setDurationMovie(Time durationMovie) {
        this.durationMovie = durationMovie;
    }

    /*
     * Area to declare the Override
     * methods from OpticalDisc Interface
     */
    @Override
    public void spinDisc() {
        System.out.print("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void burnDisc() {
        System.out.print("The DVD is beginning to burn, it's take a few minutes to file the info");
    }

    @Override
    public void readDisc() {
        System.out.print("This DVD has a movie: " + this.getNameOfMovie() + " and will take a long " + this.getDurationMovie());
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
