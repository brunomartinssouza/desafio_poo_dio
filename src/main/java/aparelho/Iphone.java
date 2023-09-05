package aparelho;

import internet.Navegador;
import reprodutorMusical.Ipod;
import telefone.Telefone;

public class Iphone implements Ipod, Telefone, Navegador{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
		System.out.println();
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada");
		System.out.println();
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
		System.out.println();
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
		System.out.println();
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
		System.out.println();
	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("Correio de Voz iniciado");
		System.out.println();
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo Música");
		System.out.println();
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
		System.out.println();
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Música selecionada");
		System.out.println();
	}
}
