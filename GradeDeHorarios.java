package projeto;

public class GradeDeHorarios {
    int i;
    int d;
     
        Horario[][] gradeDeHorarios = new Horario[6][5]; {
        
            for (i = 0; i< gradeDeHorarios.length; i++) {
                for (d = 0; d < gradeDeHorarios.length; d++) {
                    System.out.println(gradeDeHorarios[i][d] + " ");
                }
            }
        }
    
    
    public void addHorario(int dia, Horario h){
         this.gradeDeHorarios[h.getAula()][dia] = h;
    
    }
    
}