class Aluno {

  private String nome;
  private Avaliacao avaliacao;

  //construtor
  public Aluno(String n) {
      nome = n;
  }
  
  public String getNome() {
    return nome;
  }

  public void setAvaliacao(Avaliacao nova) {
    this.avaliacao = nova;
  }

  public Avaliacao getAvaliacao() {
    return this.avaliacao;
  }

}