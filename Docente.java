package projeto;

public class Docente {
   public String nome;
   private String apelido;
   private String email;
   public String matricula;     
   private String areaLotacao;
   public String vinculo;
   
   
    public Docente(){
        this.nome = null;
        this.apelido = null;
        this.email = null;
        this.matricula = null;
        this.areaLotacao = null;
        this.vinculo = null;
    }

    public Docente(String nome, String apelido, String email, String matricula, String areaLotacao, String vinculo) {
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

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
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

    @Override
    public String toString() {
        return ("\n" + "INFORMAÇÕES DO DOCENTE..." + "\n" + "Nome do Docente: " + nome + "\n" + "Apelido do Docente: " + apelido + "\n" + "E-mail do Docente: " + email + "\n" +"Matrícula: " + matricula + "\n" +"Àrea de Lotação: " + areaLotacao + "\n" +" Vínculo do Docente: " + vinculo );
    }
}