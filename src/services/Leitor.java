package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.Set;

import entities.Acessos;

public class Leitor {

	public static void ler(String filePath, Set<Acessos> listaAcessos ) {

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String linha = br.readLine();

			while (linha != null) {
				String[] vetor = linha.split(" ");
				String login = vetor[0];
				Date dataAcesso = Date.from(Instant.parse(vetor[1]));

				Acessos acesso = new Acessos(login, dataAcesso);

				listaAcessos.add(acesso);

				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}

	}
}
