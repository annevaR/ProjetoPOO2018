package projeto;

public class Horario  {
    private String disciplina; 
    private String docente;
    private String laboratorio;
    private int aula;
          
   
    public Horario(String disciplina, String  docente,String laboratorio, int aula) {
        this.setDisciplina(disciplina); 
        this.setDocente(docente);
        this.setLaboratorio(laboratorio);
        this.setAula(aula);
    }

    public Horario() {
        this.setDisciplina("----------");
        this.setDocente("---------");
        this.setLaboratorio("-----------");
    }

    
    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDocente() {
        return this.docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
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
        return ("\n" + "HORÁRIO..." + "\n" +"Disciplina: " + this.disciplina + "\n" +"Professor: " + this.docente + "\n" + "Laboratório: " + this.laboratorio + "\n" + "Aula " + this.aula);
    }
}