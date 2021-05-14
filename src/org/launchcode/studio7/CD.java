package org.launchcode.studio7;

public class CD extends Disc implements OpticalDisc {

    private String nameOfAlbum;
    private String nameSinger;
    private int songs;

    /*
     * Area to declare the CD
     * constructor.
     */

    public CD(double storageCapacity, boolean rewritable, String content, String brand, String nameOfAlbum, String nameSinger, int songs) {
        super(storageCapacity, rewritable, content, brand);
        this.nameOfAlbum = nameOfAlbum;
        this.nameSinger = nameSinger;
        this.songs = songs;
    }

    /*
     * Area to declare the Getters
     * and setters methods.
     */

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }

    public void setNameOfAlbum(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public int getSongs() {
        return songs;
    }

    public void setSongs(int songs) {
        this.songs = songs;
    }

    /*
     * Area to declare the Override
     * methods from OpticalDisc Interface
     */
    @Override
    public void spinDisc() {
        System.out.print("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void burnDisc() {
        System.out.print("The CD is beginning to burn, it's take a few hours to file the info");
    }

    @Override
    public void readDisc() {
        System.out.print("This CD has an Album: " + this.getNameOfAlbum() + " and it has " + this.getSongs() + " Songs");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
