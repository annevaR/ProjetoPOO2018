package projeto;

public class GradeDeHorarios {
    int l;
    int c;
    
    Horario[][] gradeDeHorarios = new Horario[6][5]; {
    
    }
    
    @Override
    public String toString(){
        String [] diaSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};
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