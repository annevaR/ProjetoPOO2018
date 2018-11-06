package projeto;

public class Laboratorio {
    private String descricaoLaboratorio;
    private int capacidade;
   
    public Laboratorio(){
        this.descricaoLaboratorio = "Laboratorio dos Cursos de Graduação ";
        this.capacidade = 15;
    }
    
    public Laboratorio(String descricaoLaboratorio, int capacidade){
        this.descricaoLaboratorio = descricaoLaboratorio;
        this.capacidade = capacidade;
    }

    public String getDescricaoLaboratorio() {
        return this.descricaoLaboratorio;
    }

    public void setDescricaoLaboratorio(String descricaoLaboratorio) {
        this.descricaoLaboratorio = descricaoLaboratorio;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return ("\n" + "INFORMAÇÕES DO LABORATÓRIO..."+ "\n" + "Descrição : " + descricaoLaboratorio + "\n" + "Capacidade do Laboratório:" + capacidade );
    }
}