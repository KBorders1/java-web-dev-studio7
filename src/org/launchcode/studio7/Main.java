package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

       CD pixies = new CD("Doolittle", 400, "Music");
       DVD gladiator = new DVD("Gladiator", 4000, "Movie");

       pixies.spinDisc();
       pixies.memoryRemaining();
       gladiator.spinDisc();
       gladiator.memoryRemaining();

    }
}
