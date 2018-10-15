package projeto;

import java.util.ArrayList;

public class GradeDeHorarios {
     private ArrayList<Horario> horarios;
     int i;

    public GradeDeHorarios() {
        this.horarios = new ArrayList<Horario>();
    }
  
     String [][] grade = new String[6][5];
     {
        grade[0][0] = " ";
        grade[0][1] = " ";
        grade[0][2]= " ";
        grade[0][3]= " ";
        grade[0][4]= " ";
 
        
        grade[1][0] = " ";
        grade[1][1] = " ";
        grade[1][2] = " ";
        grade[1][3] = " ";
        grade[1][4] = " ";
    
         
        grade[2][0] = " ";
        grade[2][1] = " ";
        grade[2][2] = " ";
        grade[2][3] = " ";
        grade[2][4] = " ";
    
        
        grade[3][0] = " ";
        grade[3][1] = " ";
        grade[3][2] = " ";
        grade[3][3] = " ";
        grade[3][4] = " ";
    

        grade[4][0] = " ";
        grade[4][1] = " ";
        grade[4][2] = " ";
        grade[4][3] = " ";
        grade[4][4] = " ";
      
        
        grade[5][0] = " ";
        grade[5][1] = " ";
        grade[5][2] = " ";
        grade[5][3] = " ";
        grade[5][4] = " ";
        
        
        for (i = 0; i< grade.length; i++) {
             for (int d = 0; d<grade.length; d++) {
                 System.out.println(grade[i][d] + " ");
             }
         }
     };

    public ArrayList<Horario> getHorarios() {
        return this.horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
     
    public void addHorario(Horario h){
        this.horarios.add(h);
    };     
    
    public void removeHorario(int i) {
        this.horarios.remove(i);
    };
    

  
   @Override
   public String toString() {
        return ("\n" + "GRADE DE HORÁRIOS" + "\n" + this.grade);
    }
     
     
     
       
    
    
}
