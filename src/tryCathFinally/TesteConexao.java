package tryCathFinally;

public class TesteConexao {

	public static void main(String[] args) {
	
		Conexao con = new Conexao();
		try {
			con.leDados();
			//Estava fechando a conexao no try, mas como pode ser lancada uma excecao do 
			//tipo unchecked no metodo leDados, pode ser q essa linha nao seja executada
			//con.fechaDados();
		}catch(Exception e) {
			System.out.println("Deu error");
			//Resolvi fechar a conexao no catch mais houve repeticao de codigo, pois sem a 
			//excecao ocorrendo no try ele nao entraria no catch, assim eu teria q fechar 
			//a conexao tanto no try quanto no catch
			//con.fechaDados();
		}finally {
			//Entao a melhor solucao para n ter repeticao de codigo, foi o uso do finally
			// pois independente da excecao ser lancada ou n, o codigo desse bloco sera
			// executado, fechando assim a conexao
			con.fechaDados();
		}
		
	}

}
