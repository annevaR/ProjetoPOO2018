package projeto;

public class Projeto {
    public static void main(String[] args) {
      Usuario u = new Usuario("Liv", 12);
      u.View();
      
      Curso curso = new Curso(); 
      curso.setDescricao("Curso Ciências da Computação");
      curso.setCodigo(556);
      curso.setDuracao(80);
      curso.View();
      
     
      Laboratorio lab = new Laboratorio();
      lab.setDescricao("Laboratório de Programação ");
      lab.setCapacidade(20);
      lab.View();
      
      
      Docente d; 
      d = new Docente();
      d.setNome("Amanda");
      d.setApelido("Amandinha");
      d.setMatricula(908);
      d.View();
      
      
      Disciplina disc;
      disc = new Disciplina(" Programação Orientada a Objetos", "POO", 2018.1 , 10);
      disc.View();
      
      
      Turma T;
      T = new Turma("aaMGH", 2018);
      T.View();
    }
    
}
