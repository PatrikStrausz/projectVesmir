package sk.itsovy.strausz.project;

public class Main {

    public static void main(String[] args) {
	Sun sun1 = Sun.getInstance();

	sun1.addPlanet(new Planet("Venus"));
	sun1.addPlanet(new Planet("Earth"));
	sun1.addPlanet(new Planet("Jupiter"));

	sun1.printPlanet();

	Sun sun2 = Sun.getInstance();

	sun2.addPlanet(new Planet("Mars"));

	sun2.printPlanet();
    }
}
