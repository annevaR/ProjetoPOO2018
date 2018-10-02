package projeto;

public class Turma {
    private final String IDENT;
    private final int anoOferta;
    
    void View(){
        System.out.println("Informações sobre a Turma...    ");
        System.out.println("Identificador da Turma:  " + this.IDENT + "// ");
        System.out.println("Ano de Oferta:  " + this.anoOferta + "// ");
    }
     
    public Turma(){
        this.IDENT = "ID null";
        this.anoOferta = 2001;
    }
    
    public Turma( String ID, int anoOferta){
        this.IDENT = ID;
        this.anoOferta = anoOferta;
        
    }

   
       
    }
    
    
    
   
    
    
