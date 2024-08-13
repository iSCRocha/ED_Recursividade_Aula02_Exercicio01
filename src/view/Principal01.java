package view;

import controller.Funcional01;

public class Principal01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcional01 funcional = new Funcional01();
		int a = 2;
		int b = 4;
		
		System.out.println("Resultado esperado => " + a * b);
		
		int visu = funcional.multiplicaPorSoma(a, b);
		
		System.out.println("Resultado alcançado => " + visu);
	}

}
