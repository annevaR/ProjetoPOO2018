package projeto;

public class Fachada {
    private static Fachada instance = null;
  
    Curso[][] cursos = new Curso[30][3];{

    }
    
    @Override
    public String toString(){
        String [] atributos = {"Descrição", "Código", "Duração"};
        String print = " ";
        
        for (int c = 0 ; c < 3 ; c++){
            print += atributos[c] + "\n";
            for (int l = 0 ; l < 30 ; l++){
                print += cursos[l][c] + " ";
            }
            print += "\n";
        }
        return print;
    }
    
    public void addCurso( String descricao, String codigo, int duracao) {
        this.curso;
    }
    
    private Fachada(){
        
    }

    public static Fachada getInstance(){
        if (instance == null){
            Fachada.instance = new Fachada();
        }
        return instance;
    }
    
    
}
