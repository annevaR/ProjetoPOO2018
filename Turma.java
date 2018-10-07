package projeto;

public class Turma {
    private final String IDENT;
    private final int anoOferta;
  
   public Turma(){
        this.IDENT = "ID null";
        this.anoOferta = 2001;
    }
    
    public Turma( String ID, int anoOferta){
        this.IDENT = ID;
        this.anoOferta = anoOferta;
        
    }

      @Override
    public String toString() {
        return ( "\n" +"INFORMAÇÕES DA TURMA..." + "\n" + "Identificador: " + IDENT + "\n" + "Ano de Oferta: " + anoOferta );
    }
   
       
    }
    
    
    
   
    
    
