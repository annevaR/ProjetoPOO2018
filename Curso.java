package projeto;

public class Curso {
    private String descricao;
    private long codigo;
    private int duracao;
    
      
    public Curso(){
        this.descricao = "Curso de Graduação";
        this.codigo = 000;
        this.duracao = 40;
        
    }
    
    public Curso(String descricao, long codigo, int duracao){
        this.descricao = descricao;
        this.codigo = codigo;
        this.duracao = duracao;
    } 
    
    public String getDescricao(){
        return this.descricao;
    
    }
    
    public void setDescricao(String descricao ){
        this.descricao = descricao ;
        
    }
    
     public long getCodigo(){
        return this.codigo;
    
    }
    
    public void setCodigo(long codigo ){
        this.codigo = codigo ;
    }
    
     public int getDuracao(){
        return this.duracao;
    
    }
    
    public void setDuracao(int duracao ){
        this.duracao = duracao;
    }
    
    @Override
    public String toString() {
        return ("\n" + "INFORMAÇÕES DO CURSO..." + "\n" + "Descrição:" + descricao + "\n" + " O código do Curso: " + codigo + "\n" + " A Duração do Curso: " + duracao);
    }
}
