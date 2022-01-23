package tryCathFinally;

public class Conexao {

	public Conexao() {
		System.out.println("Abrindo conexao");
	}

	public void leDados() {
		System.out.println("Recebendo Dados");
		//Exemplo de lancamento de excecao do tipo unchecked, se fosse do tipo checked 
		//teria q declarar na assinatura do metodo, e em todos os pontos q o utilizasse
		 throw new IllegalStateException();
	}
	public void fechaDados() {
		System.out.println("Fechando conexao");
	}
}
