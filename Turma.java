package projeto;

import java.util.ArrayList;


public class Turma {
    private String IDENT;
    private double anoOferta;
    private ArrayList<GradeDeHorarios> gradeDeHorarios; 
   
    
     
    public Turma(){
        this.IDENT = "ID null";
        this.anoOferta = 2001;
    }

    public Turma(String IDENT, double anoOferta) {
        this.IDENT = IDENT;
        this.anoOferta = anoOferta;
        this.gradeDeHorarios = new ArrayList<GradeDeHorarios>();
    }

    
    public String getIDENT() {
        return this.IDENT;
    }

    public void setIDENT(String IDENT) {
        this.IDENT = IDENT;
    }

    public double getAnoOferta() {
        return this.anoOferta;
    }

    public void setAnoOferta(double anoOferta) {
        this.anoOferta = anoOferta;
    }

    public ArrayList<GradeDeHorarios> getGradeDeHorarios() {
        return this.gradeDeHorarios;
    }

    public void setGradeDeHorarios(ArrayList<GradeDeHorarios> gradeDeHorarios) {
        this.gradeDeHorarios = gradeDeHorarios;
    }

    public void addGradeDeHorarios(GradeDeHorarios e) {
        this.gradeDeHorarios.add(e);
    }

    public void removeGradeDeHorarios(int i) {
        this.gradeDeHorarios.remove(i);
    }
    
    
    
       @Override
       public String toString() {
        return ( "\n" +"INFORMAÇÕES DA TURMA..." + "\n" + "Identificador: " + IDENT + "\n" + "Ano de Oferta: " + anoOferta + "\n" + "Grade de Horários da Turma: " + this.gradeDeHorarios);
    }
    
    

   
       
    }
    
    
    
   
    
    
