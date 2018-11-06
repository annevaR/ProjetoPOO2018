package projeto;

public class GradeDeHorarios {
    private String nomeGrade;
    private String [] diaSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};;
    private
    int l;
    int c;

    public String getNomeGrade() {
        return nomeGrade;
    }

    public void setNomeGrade(String nomeGrade) {
        this.nomeGrade = nomeGrade;
    }
    
    
    Horario[][] gradeDeHorarios = new Horario[6][5]; {
    
    }
    
    @Override
    public String toString(){
        String print = "";
        
        for (c = 0; c < 5 ; c++) {
            print += diaSemana[c] + "\n";
            for (l = 0; l < 6 ; l++) {
                print += gradeDeHorarios[l][c] + " ";
               
            }
            print += "\n";
         }
            
         return print;
    }
  
    public void addHorario(int dia, Horario h){
         this.gradeDeHorarios[h.getAula()][dia] = h;
    
    }
    
}