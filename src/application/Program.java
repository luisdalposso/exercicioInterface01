package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Acessos;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTRE COM O CAMINHO DO ARQUIVO FONTE: ");
		String filePath = sc.nextLine();

		Set<Acessos> set = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] vetor = linha.split(" ");
				String login = vetor[0];
				Date dataAcesso = Date.from(Instant.parse(vetor[1]));

				Acessos acesso = new Acessos(login, dataAcesso);

				set.add(acesso);

				linha = br.readLine();
			}
			
			System.out.println("Foram: " + set.size() + " acessos únicos.");

		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}

		sc.close();

	}

}
