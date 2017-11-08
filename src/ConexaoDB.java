
public class ConexaoDB {
	
	private static ConexaoDB instanciaUnica;
	private String NomeBanco;
	
	public String getNomeBanco() {
		return NomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		NomeBanco = nomeBanco;
	}

	private ConexaoDB() {}
	
	public static ConexaoDB getInstance() 
	{
		if (instanciaUnica == null)
			instanciaUnica = new ConexaoDB();
		
		return instanciaUnica;
	}
	

	public String ObtemConexao()
	{
		return "conexao efetuada";
	}
	
	public String ExecutaSQL(String sql) 
	{
		return "Executado com sucesso comando:" +sql;
	}
}
