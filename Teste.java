import java.util.ArrayList;

class Teste {

  public void executar() {
      Aluno a = new Aluno("Dolores");
      Aluno b = new Aluno("Belmiro Silva");

    Avaliacao amatricula = new Avaliacao(90,2);
    Avaliacao acontrole1 = new Avaliacao(70,1);
    Avaliacao acontrole2 = new Avaliacao(30,1);
    Avaliacao acontrole3 = new Avaliacao(31,1);
    Avaliacao acontrole4 = new Avaliacao(39,1);

    a.adicionaAvaliacao(amatricula);
    a.adicionaAvaliacao(acontrole1);
    a.adicionaAvaliacao(acontrole2);
    a.adicionaAvaliacao(acontrole3);
    a.adicionaAvaliacao(acontrole4);


    Avaliacao bmatricula = new Avaliacao(90,1);
    b.adicionaAvaliacao(bmatricula);

    //Relatório de saida
    System.out.println("listagem de alunos:");
    mostraAluno(a);
    mostraAluno(b);
  }


  
  public void mostraAluno(Aluno aluno) {

    System.out.println("\nAluno " + aluno.getNome());
    System.out.println( aluno.getAvaliacoes().size() + " Avaliações");
    ArrayList<Avaliacao> lista = aluno.getAvaliacoes();

    for (int i=0; i < lista.size(); i++) {
      Avaliacao umadelas = lista.get(i);
      System.out.println(i + 1 + ") " + umadelas.indice() + " [" + umadelas.classificacao() + "]"); 
    }
  }
}