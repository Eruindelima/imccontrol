class Teste {

  public void executar() {
      Aluno a = new Aluno("Dolores");
      Aluno b = new Aluno("Nemo");

    Avaliacao a1 = new Avaliacao(90,2);
    Avaliacao a2 = new Avaliacao(70,1);

    a.avaliacao = a1;
    b.avaliacao = a2;

    System.out.println("listagem de alunos:");
    mostraAluno(a);
    mostraAluno(b);
  }



  public void mostraAluno(Aluno a) {

    System.out.println("\n" + a.getNome());
    System.out.println("Indice = " + a.avaliacao.indice());
    System.out.println("Categoria = " + a.avaliacao.classificacao());

    

  }


}