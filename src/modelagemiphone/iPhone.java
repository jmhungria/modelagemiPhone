package modelagemiphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public static void main(String[] args) {

	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Pagina " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Aba adicionada.");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina atualizada");		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligacao");		
	}

	@Override
	public void inciarCorreioVoz() {
		System.out.println("Correio de Voz iniciado");		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica");		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");		
	}

	@Override
	public void SelecionarMusica(String musica) {
		System.out.println("Musica " + musica + " selecionada");		
	}
}
