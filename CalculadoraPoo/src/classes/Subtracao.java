package classes;

import interfaces.ICalculadora;

public class Subtracao implements ICalculadora {
	public Integer calcula(Integer n1, Integer n2) {
	    return n1 - n2;
	  }

	  public Float calcula(Float n1, Float n2) {
	    return n1 - n2;
	  }

	  public Double calcula(Double n1, Double n2) {
	    return n1 - n2;
	  }

	  public Integer calcula(Integer[] numeros) {
	    Integer subtracao = numeros[0];
	    for (int i = 1; i < numeros.length; i++) {
			subtracao -= numeros[i];
		}
	    return subtracao;
	  }

	  public Float calcula(Float[] numeros) {
		float subtracao = numeros[0];
		   for (int i = 1; i < numeros.length; i++) {
				subtracao -= numeros[i];
	    }
	    return subtracao;
	  }

	  public Double calcula(Double[] numeros) {
		 Double subtracao = numeros[0];
		   for (int i = 1; i < numeros.length; i++) {
				subtracao -= numeros[i];;
	    }
	    return subtracao;
	  }
}