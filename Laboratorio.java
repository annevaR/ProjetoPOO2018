package projeto;

public class Laboratorio {
    private String descricao;
    private int capacidade;
    
    void View(){
        System.out.println("Informações sobre o Laboratório...      ");
        System.out.println("Descrição do laboratório:  " + this.descricao);
        System.out.println("Capacidade do Laboratório:  " + this.capacidade);
        
    }
    
    public Laboratorio(){
        this.descricao = "Laboratorio dos Cursos de Graduação ";
        this.capacidade = 15;
    }
    
    public Laboratorio(String descricao, int capacidade){
        this.descricao = descricao;
        this.capacidade = capacidade;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
     
}
