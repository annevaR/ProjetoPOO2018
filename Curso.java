package projeto;

import java.util.ArrayList;

public class Curso {
    private String descricao;
    private String codigo;
    private int duracao;
    private ArrayList<Docente> docentes;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Laboratorio> laboratorios;
    private ArrayList<Turma> turmas;

       
    public Curso(){
        this.descricao = "Curso de Graduação";
        this.codigo = "0000000";
        this.duracao = 00;
        
    }

    public Curso(String descricao, String codigo, int duracao) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.duracao = duracao;
        this.docentes = new ArrayList<Docente>();
        this.disciplinas = new ArrayList<Disciplina>();
        this.laboratorios = new ArrayList<Laboratorio>();
        this.turmas = new ArrayList<Turma>() ;
        
    }
    
    
    
    public String getDescricao(){
        return this.descricao;
    
    }
    
    public void setDescricao(String descricao ){
        this.descricao = descricao ;
        
    }
    
     public String getCodigo(){
        return this.codigo;
    
    }
    
    public void setCodigo(String codigo ){
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

    public ArrayList<Laboratorio> getLaboratorios() {
        return this.laboratorios;
    }

    public void setLaboratorios(ArrayList<Laboratorio> laboratorios) {
        this.laboratorios = laboratorios;
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

    public void removeDocente(int i) {
        this.docentes.remove(i);
    }
    
    
    public void addDisciplina(Disciplina disc) {
        this.disciplinas.add(disc);
    }

    public void removeDisciplina(int i) {
        this.disciplinas.remove(i);
    }

    public void addLaboratorio(Laboratorio l) {
        this.laboratorios.add(l);
    }

    public void remove(int i) {
        this.laboratorios.remove(i);
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