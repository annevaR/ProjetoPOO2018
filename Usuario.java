package projeto;

public class Usuario {
     private String apelido;
     private int senha;
  
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
      @Override
    public String toString() {
        return ( "INFORMAÇÕES DO USUÁRIO...  " + "\n" + "O apelido do Usuário é " + this.apelido + "\n"  + " A senha do Usuário é " + this.senha);
    }

     
}
        
