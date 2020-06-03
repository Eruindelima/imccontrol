class IMC {
  
  public static double calcular(double p, double a){
      double imc = p / (a * a);
      return imc; 
  } 
  public static String situacao(double indice) {
      if (indice < 18) 
         return "MAGRO";
      if (indice > 30)
         return "OBESO";
      return "EQUILIBRADO";
  }
  
}