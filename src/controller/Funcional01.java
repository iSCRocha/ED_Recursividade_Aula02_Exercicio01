package controller;

public class Funcional01 {
	public Funcional01() {
		super();
	}
	
	int soma = 0;
	
	public int multiplicaPorSoma(int a, int b) { //inicia recursiva com valores recebidos
		
		if(b > 0) {
			b = b - 1;
			soma = soma + a;
			return multiplicaPorSoma(a, b); //prossegue recursividade com valores alterados
		} else {
			return soma; //fim da recursiva e retorno do produto
		}
	}
}


/* Criar uma função recursiva
 * que receba 2 valores A e B
 * e, por somas,
 * apresente o resultado da multiplicação de A por B.*/
