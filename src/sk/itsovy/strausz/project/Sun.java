package sk.itsovy.strausz.project;

import java.util.ArrayList;
import java.util.List;

public class Sun {
    private static Sun instance;
    private List<Planet> planet = new ArrayList<>();

    private Sun(){

    }

    public static Sun getInstance(){
        if(instance==null){
            instance = new Sun();
        }
        return instance;
    }

    public void addPlanet(Planet name){
        planet.add(name);
    }

    public void printPlanet() {
        for (int i = 0; i < planet.size(); i++) {
            System.out.println(planet.get(i).getName());
        }
    }
}
