package classes;

import interfaces.ICalculadora;

public class Divisao implements ICalculadora{

	public Integer calcula(Integer n1, Integer n2) {
	   return n1 / n2;
	 }

	 public Float calcula(Float n1, Float n2) {
	   return n1 / n2;
	 }

	 public Double calcula(Double n1, Double n2) {
	   return n1 / n2;
	 }

	 public Integer calcula(Integer[] numeros) {
	 Integer tamanho = numeros.length;
	 	if (tamanho == 0) {
	 		return null;
	}
	 	Integer divisao = numeros[0];
	 	for (int i = 1; i < numeros.length; i++) {
	 		divisao /= numeros[i];
	}
	 	return divisao;
	 }

	 public Float calcula(Float[] numeros) {
	 Integer tamanho = numeros.length;
	 	if (tamanho == 0) {
	 		return null;
	}
	Float divisao = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			divisao /= numeros[i];
	}
		return divisao;
	 }

	 public Double calcula(Double[] numeros) {
		 	Integer tamanho = numeros.length;
		 	if (tamanho == 0) {
		 	return null;
	}
	Double divisao = numeros[0];
			for (int i = 1; i < numeros.length; i++) {
				divisao /= numeros[i];
	}
			return divisao;
	}
	 }