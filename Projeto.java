package projeto;

public class Projeto {
    public static void main(String[] args) {
      Usuario u = new Usuario("Liv", 12);
      System.out.println(u.toString());  
      
      
      Curso curso = new Curso(); 
      curso.setDescricao("Curso Ciências da Computação");
      curso.setCodigo(556);
      curso.setDuracao(80);
      System.out.println(curso.toString());  
     
      
     
      Laboratorio lab = new Laboratorio();
      lab.setDescricao("Laboratório de Programação ");
      lab.setCapacidade(20);
      System.out.println(lab.toString());
      
      
      Docente d; 
      d = new Docente();
      d.setNome("Amanda");
      d.setApelido("Amandinha");
      d.setMatricula(908);
      System.out.println(d.toString());  
      
      
      
      Disciplina disc;
      disc = new Disciplina(" Programação Orientada a Objetos", "POO", 2018.1 , 10);
      System.out.println(disc.toString());  
     
      
      
      Turma T;
      T = new Turma("aaMGH", 2018);
      System.out.println(T.toString());
      
    }
    
}
