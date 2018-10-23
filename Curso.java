package projeto;

import java.util.ArrayList;

public class Curso {
    private String descricao;
    private long codigo;
    private int duracao;
    private ArrayList<Docente> docentes;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;

       
    public Curso(){
        this.descricao = "Curso de Graduação";
        this.codigo = 000;
        this.duracao = 40;
        
    }

    public Curso(String descricao, long codigo, int duracao) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.duracao = duracao;
        this.docentes = new ArrayList<Docente>();
        this.disciplinas = new ArrayList<Disciplina>();
        this.turmas = new ArrayList<Turma>() ;
        
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

    public ArrayList<Docente> getDocentes() {
        return this.docentes;
    }

    public void setDocentes(ArrayList<Docente> docentes) {
        this.docentes = docentes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Turma> getTurmas() {
        return this.turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public void addDocente(Docente d) {
        this.docentes.add(d);
    }

    public void removeDocente(int d) {
        this.docentes.remove(d);
    }
    
    
    public void addDisciplina(Disciplina disc) {
        this.disciplinas.add(disc);
    }

    public void removeDisciplina(int disc) {
        this.disciplinas.remove(disc);
    }

    public void addTurma(Turma t) {
        this.turmas.add(t);
    }

    public void removeTurma(int t) {
        this.turmas.remove(t);
    }
    
    @Override
    public String toString() {
        return ("\n" + "INFORMAÇÕES DO CURSO..." + "\n" + "Descrição:" + descricao + "\n" + " O código do Curso: " + codigo + "\n" + " A Duração do Curso: " + duracao + "\n" + "Docentes associados: " + this.docentes + "\n" + "Disciplinas associadas: " + this.disciplinas + "\n" + "Turmas associadas: " + this.turmas);
    }
    
    
}
