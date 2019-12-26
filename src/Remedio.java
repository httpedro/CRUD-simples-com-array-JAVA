
public class Remedio {
	
	private String nome;
	private int numcomprimido;
	private int numCartela;
	private int quantDoseDiaria;
	private String classificacao;
	private long id;
	
	
	public Remedio() {
		super();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumcomprimido() {
		return numcomprimido;
	}
	public void setNumcomprimido(int numcomprimido) {
		this.numcomprimido = numcomprimido;
	}
	public int getNumCartela() {
		return numCartela;
	}
	public void setNumCartela(int numCartela) {
		this.numCartela = numCartela;
	}
	public int getQuantDoseDiaria() {
		return quantDoseDiaria;
	}
	public void setQuantDoseDiaria(int quantDoseDiaria) {
		this.quantDoseDiaria = quantDoseDiaria;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
}
