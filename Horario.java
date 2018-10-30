package projeto;

public class Horario  {
    private String disciplina; 
    private String professor;
    private String laboratorio;
    private int aula;
          
   
    public Horario(String disciplina, String  professor,String laboratorio, int aula) {
        this.setDisciplina(disciplina); 
        this.setProfessor(professor);
        this.setLaboratorio(laboratorio);
        this.setAula(aula);
    }

    public Horario() {
        this.setDisciplina("----------");
        this.setProfessor("---------");
        this.setLaboratorio("-----------");
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

    public int getAula() {
        return this.aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }
  
    @Override
    public String toString() {
        return ("\n" + "HORÁRIO..." + "\n" +"Disciplina: " + this.disciplina + "\n" +"Professor: " + this.professor + "\n" + "Laboratório: " + this.laboratorio + "\n" + "Aula " + this.aula);
    }
}