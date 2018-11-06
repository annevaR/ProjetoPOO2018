package projeto;

public class Projeto {

    
    public static void main(String[] args) {
        Fachada f = Fachada.getInstance();
		
		f.addCurso("Informática", "123456789", 366);
		
		f.addDisciplina("Informatica", "Programação OO", "POO", 2, 3);
		f.addDisciplina("Informatica", "Sistemas Operacionais", "SO", 3, 2);
		f.addDisciplina("Informatica", "Banco de Dados", "BD", 2, 2);
		f.addDisciplina("Informatica", "Programação Web I", "WEB I", 2, 3);
		f.addDisciplina("Informatica", "Programação Web II", "WEB II", 3, 2);
		f.addDisciplina("Informatica", "Análise e Projeto de Sistemas", "APS", 3, 2);
		f.addDisciplina("Informatica", "Algoritmos", "Algortimos", 1, 4);
		
		f.addDocente("Amélia Batista", "Amélia", null, null, null, null);
		f.addDocente("Carolina Dantas", "Carol", "carol@email.com", "123456", null, null);
		f.addDocente("Everton Fabiano", "Everton", null, "654321", "Informatica", "T-40");
		f.addDocente("Guilherme Harrison", "Guilhemer", "guihar@professor.edu.br", "678909", "Informatica", "T-20");
		
		f.addLaboratorio("Laboratório de Programação I", 25);
		f.addLaboratorio("Laboratório de Programação II", 25);
		f.addLaboratorio("Laboratório de Programação III", 20);
		
		f.listarCursos();
		f.listarDisciplinas("Informática");
		f.listarDocentes("Informática");
		f.listarLaboratorios("Informatica");
		// deve listar todos os dados cadastrados do curso
		f.listarTudo("Informatica");
		
		f.criarGrade("Informática - 3º Ano");
		f.addHorario("Informática - 3º Ano", "Segunda-feira", 3, "Carol", "SO", "Laboratório de Programação I");
		f.addHorario("Informática - 3º Ano", "Terça-feira", 1, "Guilherme", "APS", "Laboratório de Programação III");
		f.addHorario("Informática - 3º Ano", "Terça-feira", 3, "Everton", "WEB II", "Laboratório de Programação II");
		
		f.verGrade("Informática - 3º Ano");
    }

}
