package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Acessos;
import services.Leitor;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTRE COM O CAMINHO DO ARQUIVO FONTE: ");
		String filePath = sc.nextLine();
		Set<Acessos> listaAcessos = new HashSet<>();

		Leitor.ler(filePath, listaAcessos);
		
		System.out.println("Foram: " + listaAcessos.size() + " usuários únicos.");

		sc.close();

	}

}
