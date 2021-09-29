package org.launchcode.studio7;

public class BaseDisc {
    private double fileSize;
    private String name;
    private String contentType;

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public BaseDisc(String aName, double aFileSize, String aContentType) {
        this.name = aName;
        this.fileSize = aFileSize;
        this.contentType = aContentType;
    }



}
