package scanner_arrays;

import java.util.Scanner;

public class Entrada_arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] valores = new int[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Digite o valor para armazenar " + (i + 1) + "º valor: ");
			valores[i] = scan.nextInt();
		}
		for(int j = 0; j < valores.length;j++) {
			System.out.println("O valor no " + (j + 1) + "º vetor é: " + valores[j]);
		}
		int soma =+ valores[j];
		System.out.println(soma);
	}

}
