package projeto;

public class Horario  {
    private String disciplina; 
    private String professor;
    private String laboratorio;
          
   
    public Horario(String disciplina, String  professor,String laboratorio) {
        this.setDisciplina(disciplina); 
        this.setProfessor(professor);
        this.setLaboratorio(laboratorio);
    }

    public Horario() {
        this.setDisciplina("Disciplina 00");
        this.setProfessor("Professor 00");
        this.setLaboratorio("Laboratório 00");
        
    }

    
    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return this.professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getLaboratorio() {
        return this.laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
  
  
    @Override
    public String toString() {
        return ("\n" + "HORÁRIO..." + "\n" +"Disciplina: " + this.disciplina + "\n" +"Professor: " + this.professor + "\n" + "Laboratório: " + this.laboratorio);
    }
    
    
  
  
    
}
