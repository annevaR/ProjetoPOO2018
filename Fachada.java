package projeto;

public class Fachada {
    private static Fachada instance = null;
   
  
    Curso[][] cursos = new Curso[30][3];{

    }
    
    public void addCurso( String descricao, String codigo, int duracao) {
       
    }
    
    public String listarCursos(){
        String [] curso = {"Descrição", "Código", " Duração"};
        String print = "";
        
         for (int c = 0; c < 3; c++){
            print += curso[c] + "\n";
            for (int l = 0; l < 30; l++){
                print +=  cursos[l][c] + " ";
            }
            print += "\n";
        }
         return print;
    }
    
    Disciplina [][] disciplinas = new Disciplina[12][5];{
    
    }
    
    public void addDisciplina(String nomeDisciplina, String descricao, String sigla, int periodo, int quantCredito){
    
    }
    
    public String listarDisciplinas(String d){
        String [] dados = {"Nome da Disciplina", "Descrição", "Sigla", "Período", "Quantidade de Crédito"};
        
        for (int c = 0; c < 5; c++){
            d += dados[c] + "\n";
            for (int l = 0; l < 12; l++){
                d +=  disciplinas[l][c] + " ";
            }
            d += "\n";
        }
         return d;
    }
    
    Docente [][] docentes = new Docente[50][6]; {

    }
    
    public void addDocente(String nome, String apelido, String email, String matricula, String areaLotacao, String vinculo){
    
    }
    
    public String listarDocentes(String doc){
        String [] dcnt = {"Nome", "Apelido", "E-mail", "Matrícula", "Área de Lotação", "Vínculo" };
        
            for (int c = 0; c < 5; c++){
            doc += dcnt[c] + "\n";
            for (int l = 0; l < 12; l++){
                doc +=  docentes[l][c] + " ";
            }
            doc += "\n";
        }
         return doc;
    }
    
    Laboratorio [][] laboratorios = new  Laboratorio[10][2]; {

    }
     public void addLaboratorio(String descricao, int capacidade){
     
    }
     
    public String listarLaboratorios(String lab){
        String [] lbrt = {"Descrição", "Capacidade"};
        
         for (int c = 0; c < 5; c++){
            lab += lbrt[c] + "\n";
            for (int l = 0; l < 12; l++){
                lab +=  laboratorios[l][c] + " ";
            }
            lab += "\n";
        }
         return lab;
    }
     
    
    public String listarTudo(String all){
        
       
    }
    
     GradeDeHorarios[][] g = new GradeDeHorarios[6][5];
       
     public String criarGrade(String grade){
        grade += g;
        return grade;
        }
   
    public String addHorario(String a, String b, int d, String e, String f, String i){
        
    }
    
    
    public String verGrade(String v){
        String [] diaSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};
        
        for (int c = 0; c < 5 ; c++) {
            v += diaSemana[c] + "\n";
            for (int l = 0; l < 6 ; l++) {
                v += g[l][c] + " ";
            }
            v += "\n";
        }
        return v;
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
