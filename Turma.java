package projeto;

public class Turma {
    private String IDENT;
    private double anoOferta;
    private GradeDeHorarios[] gradeDeHorarios; 
           
    public Turma(){
        this.IDENT = "ID null";
        this.anoOferta = 2001;
    }

    public Turma(String IDENT, double anoOferta) {
        this.IDENT = IDENT;
        this.anoOferta = anoOferta;
        this.gradeDeHorarios = new GradeDeHorarios[1];
    
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
    
// falta métodos de adicionar e remover uma Grade de Horários à Turma
    
    @Override
    public String toString() {
        return ( "\n" +"INFORMAÇÕES DA TURMA..." + "\n" + "Identificador: " + IDENT + "\n" + "Ano de Oferta: " + anoOferta + "\n" + "Grade de Horários da Turma: " + this.gradeDeHorarios);
    }
    
}
    
    
    
   
    
    
