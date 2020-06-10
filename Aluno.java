import java.util.ArrayList;
class Aluno {

  private String nome;
  private ArrayList<Avaliacao> listaAvaliacoes = new ArrayList();
  

  //construtor
  public Aluno(String n) {
      nome = n;
  }
  
  public String getNome() {
    return nome;
  }

  public void adicionaAvaliacao(Avaliacao nova) {
    this.listaAvaliacoes.add(nova);
  }

  public ArrayList <Avaliacao> getAvaliacoes() {
    return this.listaAvaliacoes;
  }

  public int totalAvaliacoes() {
    return listaAvaliacoes.size();
  }
}