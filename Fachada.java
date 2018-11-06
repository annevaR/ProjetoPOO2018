package projeto;

import java.util.ArrayList;

public class Fachada {
    private static Fachada instance = null;
    private ArrayList<Curso> cursos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Docente> docentes;
    private ArrayList<Laboratorio> laboratorios;
    private ArrayList<GradeDeHorarios> grades;
    private ArrayList<Horario> horarios;
    
   
    
    // método construtor de fachada
    
    private Fachada(){
        this.cursos = new ArrayList<Curso>();
        this.disciplinas = new ArrayList<Disciplina>();
        this.docentes = new ArrayList<Docente>();
        this.laboratorios = new ArrayList<Laboratorio>();
        this.grades = new ArrayList<GradeDeHorarios>();
        this.horarios = new ArrayList<Horario>();
    }

    // métodos addCurso e listarCursos
  
    public void addCurso( String descricao, String codigo, int duracao) {
       Curso c = new Curso(descricao, codigo, duracao);
       cursos.add(c);
    }
    
    public void listarCursos(){
        for (Curso c : cursos){
    	   System.out.println(c.toString());
        }
    }
    
   // métodos addDisciplina e listarDisciplinas 
    
    public void addDisciplina(String nomeDisciplina, String descricao, String sigla, int periodo, int quantCredito){
        Disciplina d = new Disciplina(nomeDisciplina, descricao, sigla, periodo,quantCredito);
        for (Curso c : cursos){
            if (c.getDescricao() == nomeDisciplina) {
                c.addDisciplina(d);
            }
        }
    }
    
    public void listarDisciplinas(String a){
        for (Disciplina d: disciplinas){
     	   System.out.println(d.toString());
        }
    }
    
   // métodos addDocente e listarDocentes
    
    public void addDocente(String nome, String apelido, String email, String matricula, String areaLotacao, String vinculo){
        Docente doc = new Docente(nome, apelido, email, matricula, areaLotacao,vinculo);
    	for (Curso c : cursos){
            if(c.getDescricao() == nome){
                c.addDocente(doc);
            }
        }
    }
    
    public void listarDocentes(String b){
        for (Docente doc : docentes){
     	   System.out.println(doc.toString());
        }
    }
    
    // métodos addLaboratorio e listarLaboratorios
   
    public void addLaboratorio(String descricao, int capacidade){
        Laboratorio lab = new Laboratorio(descricao, capacidade);
        for(Curso c : cursos){
            if(c.getDescricao() == descricao){
                c.addLaboratorio(lab);
            }
        }
    }
     
    public void listarLaboratorios(String c){
       for (Laboratorio lab : laboratorios){
           System.out.println(lab.toString());
       }
    }
     
    // método para listar tudo...
    
    public void listarTudo(String d){
        for ( Curso co : cursos){
            System.out.println(co.toString());
        }
    }   
    
    // métodos para criar grade...
       
    GradeDeHorarios[][] g;
        
     public void criarGrade(String nomeGrade){
        for(Curso c : cursos){
            if(c.getDescricao() == nomeGrade){
                g = new GradeDeHorarios[6][5];
            }
        }
    }
     
    // método para adicionar horário...
   
    public String addHorario(String nomeGrade, String diaSemana, int periodo , String docente, String sigla, String descricaoLaboratorio){
        Horario h = new Horario(nomeGrade, diaSemana, periodo, docente, sigla, descricaoLaboratorio);
        for (GradeDeHorarios g : grades){
            if (g.getNomeGrade() == nomeGrade){
                g.addHorario(periodo, h);
            }
        }
    }
    
    // método para visualizar a grade...
    
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
   
    public static Fachada getInstance(){
        if (instance == null){
            Fachada.instance = new Fachada();
        }
        return instance;
    }

    
    
}