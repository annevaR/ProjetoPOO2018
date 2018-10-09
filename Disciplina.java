package projeto;

public class Disciplina {
    private String nomeDisciplina;
    private String descricao;
    private String sigla;
    private double periodo; 
    private int quantCredito;

   
    
    public Disciplina(){
        this.nomeDisciplina = "not found";
        this.descricao = "-Descrição-null-";
        this.sigla = "-Sigla-null-";
        this.periodo = 0 ;
        this.quantCredito = 000;
                
    }

    
    public Disciplina(String nomeDisciplina, String descricao, String sigla, double periodo, int quantCredito){
        this.nomeDisciplina = nomeDisciplina;
        this.descricao = descricao;
        this.sigla = sigla;
        this.periodo = periodo;
        this.quantCredito = quantCredito;
                
        }
 
    public String getNomeDisciplina(){
        return this.nomeDisciplina;
            }
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
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

    @Override
    public String toString() {
        return ("\n" + "INFORMAÇÕES DA DISCIPLINA..." + "\n" + "Nome da Disciplina:" + this.nomeDisciplina + "\n" +"Descrição: " + descricao + "\n" + "Sigla: " + sigla + "\n" + "Período: " + periodo + "\n" + "Quantidade de Crédito: " + quantCredito);
    }
   
    
        
    
}
