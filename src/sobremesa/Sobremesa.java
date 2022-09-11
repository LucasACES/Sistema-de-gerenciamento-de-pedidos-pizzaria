package sobremesa;

public class Sobremesa {
	private String nomeSobremesa;
	private String descricaoSobremesa;
	private double precoSobremesa;
	
	public void setNameBebida(String nomeSobremesa) {
		this.nomeSobremesa = nomeSobremesa;
	}
	
	public void setDescricaoBebida(String descricaoSobremesa) {
		this.descricaoSobremesa = descricaoSobremesa;
	}
	
	public void setPrecoBebida(double precoSobremesa) {
		this.precoSobremesa = precoSobremesa;
	}
	
	public void Cadastrar(String nomeSobremesa, String descricaoSobremesa, double precoSobremesa) {
		// TODO criar conexão com banco e enviar dados
		
	}
}
