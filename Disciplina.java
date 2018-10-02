package projeto;

public class Disciplina {
    public String descricao;
    private String sigla;
    public double periodo; 
    private int quantCredito;

   
    void View(){
        System.out.println("Informações sobre a Disciplina...   ");
        System.out.println("Descrição da Disciplina:  " + this.descricao + "// ");
        System.out.println("Sigla:  " + this.sigla + "// ");
        System.out.println("Período:  " + this.periodo + "// ");
        System.out.println("Quantidade de Crédito:  " + this.quantCredito + "// ");
       
    }
    
    public Disciplina(){
        this.descricao = "-Descrição-null-";
        this.sigla = "-Sigla-null-";
        this.periodo = 0 ;
        this.quantCredito = 000;
                
    }

    
    public Disciplina(String descricao, String sigla, double periodo, int quantCredito){
        this.descricao = descricao;
        this.sigla = sigla;
        this.periodo = periodo;
        this.quantCredito = quantCredito;
                
        }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return this.sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    
    public double getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(double periodo) {
        this.periodo = periodo;
    }

    public long getQuantCredito() {
        return this.quantCredito;
    }

        public void setQuantCredito(int quantCredito) {
        this.quantCredito = quantCredito;
    }
    
    
}
