class Avaliacao{
  
  private float altura;
  private float peso;

  

  public Avaliacao( float p, float a){
    
    this.altura = a;
    this.peso = p;
  } 

  public float getPeso(){
    return this.peso;
  }

  public float getAltura(){
    return this.altura;
  }

  public  float indice(){
    float imc = this.peso / (this.altura * this.altura);
    return imc; 
  }

  public String classificacao() {
      if (this.indice() < 18) 
         return "MAGRO";
      if (this.indice() > 30)
         return "OBESO";
      return "EQUILIBRADO";
  }
}