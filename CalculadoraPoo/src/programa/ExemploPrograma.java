package classes;

import interfaces.ICalculadora;

public class Multiplicacao implements ICalculadora {
	
	public Integer calcula(Integer n1, Integer n2) {
	   return n1 * n2;
	 }

	 public Float calcula(Float n1, Float n2) {
	   return n1 * n2;
	 }

	 public Double calcula(Double n1, Double n2) {
	   return n1 * n2;
	 }

	 public Integer calcula(Integer[] numbers) {
	   Integer multi = 1;
	for (int i = 0; i < numbers.length; i++) {
	multi *= numbers[i];
	}
	return multi;
	 }

	 public Float calcula(Float[] numbers) {
	 Float multi = 1F;
	for (int i = 0; i < numbers.length; i++) {
	multi *= numbers[i];
	}
	return multi;
	 }

	 public Double calcula(Double[] numbers) {
	 Double multi = 1D;
	for (int i = 0; i < numbers.length; i++) {
	multi *= numbers[i];
	}
	return multi;
	 }
	}
