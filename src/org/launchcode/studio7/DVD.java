package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    private double storageCapacity = 4812;

    public DVD(String aName, double aFileSize, String aContentType) {
        super(aName, aFileSize, aContentType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570-1600 rpm.");
    }

    @Override
    public void memoryRemaining() {
        if (this.getFileSize() >= this.storageCapacity) {
            System.out.println("Max capacity reached.");
        } else {
            System.out.println("This DVD has " + (this.storageCapacity - this.getFileSize()) + "MB of memory remaining.");
        }
    }


}
