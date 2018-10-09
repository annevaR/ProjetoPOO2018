package projeto;

public class GradeDeHorarios {
     private Horario[] horario;
     int i;

     String [][] grade = new String[7][7];
     {
        grade[0][0] = "Grade De Horários";
        grade[0][1] = "segunda-feira";
        grade[0][2]= "terça-feira";
        grade[0][3]= "quarta-feira";
        grade[0][4]= "quinta-feira";
        grade[0][5]="sexta-feira";
        
        grade[1][0] = "1º Horário";
        grade[2][0] = "2º Horário";
        grade[3][0] = "3º Horário";
        grade[4][0] = "4º Horário";
        grade[5][0] = "5º Horário";
        grade[6][0] = "6º Horário";
        
         for (i = 0; i< grade.length; i++) {
             for (int d = 0; d<grade.length; d++) {
                 System.out.println(grade[i][d] + " ");
             }
         }
     };

   @Override
   public String toString() {
        return ("\n" + "GRADE DE HORÁRIOS" + "\n" + this.grade);
    }
     
     
     
       
    
    
}
