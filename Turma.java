package projeto;


public class Turma {
    private String IDENT;
    private double anoOferta;
    private GradeDeHorarios[] gradeDeHorarios; 
    
    
     
    public Turma(){
        this.IDENT = "ID null";
        this.anoOferta = 2001;
    }

    
    public Turma( String ID, double anoOferta){
        this.IDENT = ID;
        this.anoOferta = anoOferta;
        
        
    }

       @Override
    public String toString() {
        return ( "\n" +"INFORMAÇÕES DA TURMA..." + "\n" + "Identificador: " + IDENT + "\n" + "Ano de Oferta: " + anoOferta + "\n" + "Grade de Horários da Turma: " + this.gradeDeHorarios);
    }
    
    

   
       
    }
    
    
    
   
    
    
