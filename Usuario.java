package projeto;

public class Usuario {
     private String apelido;
     private int senha;
     
     void View(){
        System.out.print("Informações do Usuário...");                                                                            
        System.out.print("O apelido é:  " + this.apelido + " /");
        System.out.print("/ " + "A nova senha é: " + this.senha);
         }
     public  Usuario(){
       this.apelido = "null";
        this.senha = 98;
     }
     
     public Usuario(String apelido, int senha){
         this.setApelido(apelido);
         this.setSenha(senha);
     }
        
        
     public String getApelido(){
         return this.apelido;
     }
     
     public void setApelido(String apelido){
         this.apelido = apelido;
     }
     
     public int getSenha(){
         return this.senha;
     }
     
     public void setSenha(int senha){
         this.senha = senha;
     
     }
     

     
}
        