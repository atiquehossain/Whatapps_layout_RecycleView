package com.example.whatapps_layout_recycleview;

public class ModelClass {
    private int imageview;
    private String textviewOne;
    private String textviewtwo;
    private String textthree;
    private String Devider;

    public ModelClass(int imageview, String textviewOne, String textviewtwo, String textthree, String devider) {
        this.imageview = imageview;
        this.textviewOne = textviewOne;
        this.textviewtwo = textviewtwo;
        this.textthree = textthree;
        Devider = devider;
    }

    public int getImageview() {
        return imageview;
    }

    public String getTextviewOne() {
        return textviewOne;
    }

    public String getTextviewtwo() {
        return textviewtwo;
    }

    public String getTextthree() {
        return textthree;
    }

    public String getDevider() {
        return Devider;
    }
}
