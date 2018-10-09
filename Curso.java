package projeto;

public class Curso {
    private String descricao;
    private long codigo;
    private int duracao;
    private Docente[] docente;
    private Disciplina[] disciplina;
    private Turma[] turma;

       
    public Curso(){
        this.descricao = "Curso de Graduação";
        this.codigo = 000;
        this.duracao = 40;
        
    }
    
    public Curso(String descricao, long codigo, int duracao, Docente[] docente, Disciplina[] disciplina, Turma[] turma){
        this.descricao = descricao;
        this.codigo = codigo;
        this.duracao = duracao;
        this.docente = docente;
        this.disciplina = disciplina;
        this.turma = turma;
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

    public Docente[] getDocente() {
        return this.docente;
    }

    public void setDocente(Docente[] docente) {
        this.docente = docente;
    }

    public Disciplina[] getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public Turma[] getTurma() {
        return this.turma;
    }

    public void setTurma(Turma[] turma) {
        this.turma = turma;
    }
    
    

    @Override
    public String toString() {
        return ("\n" + "INFORMAÇÕES DO CURSO..." + "\n" + "Descrição:" + descricao + "\n" + " O código do Curso: " + codigo + "\n" + " A Duração do Curso: " + duracao + "\n" + "Docentes associados: " + this.docente + "\n" + "Disciplinas associadas: " + this.disciplina + "\n" + "Turmas associadas: " + this.turma);
    }
    
    
}
