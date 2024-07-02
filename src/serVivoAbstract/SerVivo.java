package serVivoAbstract;

public abstract class SerVivo {
    private String nome;
    private String reino;
    private String filo;
    private String classe;
    private String ordem;
    private String familia;
    private String genero;
    private String especie;

    public SerVivo(String nome, String reino, String filo, String classe, String ordem, String familia, String genero, String especie) {
        this.nome = nome;
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public String getReino() {
        return reino;
    }

    public String getFilo() {
        return filo;
    }

    public String getClasse() {
        return classe;
    }

    public String getOrdem() {
        return ordem;
    }

    public String getFamilia() {
        return familia;
    }

    public String getGenero() {
        return genero;
    }

    public String getEspecie() {
        return especie;
    }

    public abstract void dados();

}


