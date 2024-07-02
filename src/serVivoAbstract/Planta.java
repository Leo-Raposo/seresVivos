package serVivoAbstract;

public class Planta extends SerVivo {
    public Planta(String nome, String reino, String filo, String classe, String ordem, String familia, String genero, String especie) {
        super(nome, reino, filo, classe, ordem, familia, genero, especie);
    }

    @Override
    public void dados() {
        System.out.println("Planta: " + getNome() +
                " | Reino: " + getReino() +
                " | Filo: " + getFilo() +
                " | Classe: " + getClasse() +
                " | Ordem: " + getOrdem() +
                " | Família: " + getFamilia() +
                " | Gênero: " + getGenero() +
                " | Espécie: " + getEspecie() + "\n");
    }
}
