package org.launchcode.studio7;

public abstract class Disc {

    private double storageCapacity;
    private boolean rewritable;
    private String content;
    private String brand;

    public Disc(double storageCapacity, boolean rewritable, String content, String brand) {
        this.storageCapacity = storageCapacity;
        this.rewritable = rewritable;
        this.content = content;
        this.brand = brand;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public boolean isRewritable() {
        return rewritable;
    }

    public void setRewritable(boolean rewritable) {
        this.rewritable = rewritable;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
