package projeto;

public class Horario  {
    private Disciplina disciplina; 
    private Docente professor;
    private Laboratorio laboratorio;
          
   
    public Horario(Disciplina disciplina, Docente  professor, Laboratorio laboratorio) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.laboratorio = laboratorio;
    }

    public Horario() {
        
        
    }

    public Disciplina  getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Docente getProfessor() {
        return this.professor;
    }

    public void setProfessor(Docente professor) {
        this.professor = professor;
    }

    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    @Override
    public String toString() {
        return ("\n" + "HORÁRIO..." + "\n" +"Disciplina: " + this.disciplina + "\n" +"Professor: " + this.professor + "\n" + "Laboratório: " + this.laboratorio);
    }
    
    
  
  
    
}
