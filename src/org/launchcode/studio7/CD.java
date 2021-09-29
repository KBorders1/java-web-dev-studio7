package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{

    private double storageCapacity = 680;

    public CD(String aName, double aFileSize, String aContentType) {
        super(aName, aFileSize, aContentType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200-500 rpm.");
    }

    @Override
    public void memoryRemaining() {
        if (this.getFileSize() >= this.storageCapacity) {
            System.out.println("Max capacity reached.");
        } else {
            System.out.println("This CD has " + (this.storageCapacity - this.getFileSize()) + "MB of memory remaining.");
        }
    }
}
