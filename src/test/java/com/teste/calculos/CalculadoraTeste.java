package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTeste {

	@Test
	@DisplayName("Teste 5 + 5 = 10")
	void testSum() {
		//Arrange
		Calculadora  calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;
		
		//Act
		double resultado = calc.sum(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "5 + 5 não gerou o valor 10.");
	}
	
	void testSub() {
		//Arrange
		Calculadora  calc = new Calculadora();
		double valor1 = 7D;
		double valor2 = 4D;
		double esperado = 3D;
		
		//Act
		double resultado = calc.sub(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "7 - 4 não gerou o valor 3.");
	}
	
	void testMult() {
		//Arrange
		Calculadora  calc = new Calculadora();
		double valor1 = 6D;
		double valor2 = 3D;
		double esperado = 18D;
		
		//Act
		double resultado = calc.mult(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "6 * 3 não gerou o valor 18.");
	}

	void testDiv() {
		//Arrange
		Calculadora  calc = new Calculadora();
		double valor1 = 24D;
		double valor2 = 6D;
		double esperado = 4D;
		
		//Act
		double resultado = calc.div(valor1, valor2);
		
		//Assert
		assertEquals(esperado, resultado, "24 / 6 não gerou o valor 4.");
	}
}
