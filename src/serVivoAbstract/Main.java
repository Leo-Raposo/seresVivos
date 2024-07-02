package serVivoAbstract;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SerVivo> serVivo = new ArrayList<>();

        serVivo.add(new Planta("Dente de Leão", "Plantae", "Magnoliophyta", "Magnoliopsida", "Asterales", "Asteraceae", "Taraxacum", "Taraxacum officinale"));
        serVivo.add(new Fungo("Penicillium", "Fungi", "Ascomycota", "Eurotiomycetes", "Eurotiales", "Trichocomaceae", "Penicillium", "Penicillium chrysogenum"));
        serVivo.add(new Animal("Guepardo", "Animalia", "Chordata", "Mammalia", "Carnivora", "Felidae", "Acinonyx", "Acinonyx jubatus"));

        for (SerVivo ser : serVivo) {
            System.out.println("---------------------");
            ser.dados();
        }
    }
}

