package projeto;

public class Turma {
    private String IDENT;
    private double anoOferta;
    private GradeDeHorarios[] gradeDeHorarios;  
    int count;
           
    public Turma(){
        this.IDENT = "ID null";
        this.anoOferta = 2001;
    }

    public Turma(String IDENT, double anoOferta) {
        this.IDENT = IDENT;
        this.anoOferta = anoOferta;
        this.gradeDeHorarios = new GradeDeHorarios[1];
    
    }
     public void addGrade(GradeDeHorarios gradeDeHorarios){
        for (count = 0; count < gradeDeHorarios.length; count ++){
                System.out.println(gradeDeHorarios[count]);
            } 
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

    public GradeDeHorarios[] getGradeDeHorarios() {
        return this.gradeDeHorarios;
    }

    public void setGradeDeHorarios(GradeDeHorarios[] gradeDeHorarios) {
        this.gradeDeHorarios = gradeDeHorarios;
    }

    
    @Override
    public String toString() {
        return ( "\n" +"INFORMAÇÕES DA TURMA..." + "\n" + "Identificador: " + IDENT + "\n" + "Ano de Oferta: " + anoOferta + "\n" + "Grade de Horários da Turma: " + this.gradeDeHorarios);
    }
    
}
    
    
    
   
    
    
