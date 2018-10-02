package projeto;

public class Docente {
   public String nome;
   private String apelido;
   private String email;
   public long matricula;     
   private String areaLotacao;
   public String vinculo;
   
    
   void View(){
       System.out.println("Informações sobre o Docente...    ");
       System.out.println("Nome do Docente: " + this.nome + " //");
       System.out.println("Apelido do Docente: " + this.apelido + " //");
       System.out.println("Email do Docente: " + this.email + " //");
       System.out.println("Matrícula do Docente: " + this.matricula + " //");
       System.out.println("Àrea de Lotação: " + this.areaLotacao + " //");
       System.out.println( "Vínculo: " + this.vinculo);
   }
   
   
    public Docente(){
        this.nome = "null";
        this.apelido = "null";
        this.email = "null";
        this.matricula = 000;
        this.areaLotacao = "null";
        this.vinculo = "null";
    }

    public Docente(String nome, String apelido, String email, long matricula, String areaLotacao, String vinculo) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.matricula = matricula;
        this.areaLotacao = areaLotacao;
        this.vinculo = vinculo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMatricula() {
        return this.matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getAreaLotacao() {
        return this.areaLotacao;
    }

    public void setAreaLotacao(String areaLotacao) {
        this.areaLotacao = areaLotacao;
    }

    public String getVinculo() {
        return this.vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }
    
            
}
