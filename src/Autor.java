
public class Autor {
   
	private String id;
	private String nome;
	private String dataNscimento;
	

	public Autor(String nome) {
		super();
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNscimento() {
		return dataNscimento;
	}
	public void setDataNscimento(String dataNscimento) {
		this.dataNscimento = dataNscimento;
	}
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nome=" + nome + ", dataNscimento=" + dataNscimento + "]";
	}
	
	
}
