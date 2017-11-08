

public class Teste {
	
	public static void main(String[] args) {
		
		//EXEMPLO DE USO SINGLETON
		
		String conexao = ConexaoDB.getInstance().ObtemConexao();
		System.out.println(conexao);
		
		//Mudando atributo nomeBanco
		ConexaoDB.getInstance().setNomeBanco("BancoAulaIFTM");
		System.out.println(ConexaoDB.getInstance().getNomeBanco());
		
		//Chamamos o singleton e notamos que n�o altera  a propriedade porque a instancia � unica
		System.out.println(ConexaoDB.getInstance().getNomeBanco());
		System.out.println(ConexaoDB.getInstance().getNomeBanco());
	
		//Se tentar instanciar a classe o padr�o Singleton n�o permite (descomente a linha e tente :))
		//ConexaoDB connexao  = new ConexaoDB();
		
	}
	
	
}
