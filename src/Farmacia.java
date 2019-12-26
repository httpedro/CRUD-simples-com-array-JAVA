import java.util.ArrayList;

public class Farmacia {
	ArrayList<Remedio> remedios = new ArrayList<Remedio>();
	
	
	public boolean receberRemedios(Remedio remedio) {
		try {
			remedios.add(remedio);
			return true;
		} catch (Exception e) {
			
		}
		return false;
	}
	
	public boolean venderRemedios(long id) {
		try {
			for (Remedio remedio : remedios) {
				if(remedio.getId()==id) {
					remedios.remove(remedio);
					return true;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	} 
	
	public void listarRemedios() {
		System.out.println("================");
		System.out.println("     Remdios    ");
		System.out.println("================");
		for (Remedio remedio : remedios) {
			System.out.println(remedio.getNome());
		}
	}
	Remedio buscarRemedio(String nome) {
		for (Remedio remedio : remedios) {
			if(remedio != null && remedio.getNome().equals(nome)) {
				return remedio;
			}
		}
		return null;
	}
	
	public boolean atualizarRemedio(String nome, int numcomprimido,int numCartela,int quantDoseDiaria,String classificacao) {
		Remedio remedio = buscarRemedio(nome);
		if(remedio != null){
			remedio.setClassificacao(classificacao);
			remedio.setNumcomprimido(numcomprimido);
			remedio.setNumCartela(numCartela);
			remedio.setQuantDoseDiaria(quantDoseDiaria);
			return true;
		}
	return false;
	}
	
	
	public Farmacia() {
		super();
	}
	
	public ArrayList<Remedio> getRemedios() {
		return remedios;
	}

	public void setRemedios(ArrayList<Remedio> remedios) {
		this.remedios = remedios;
	}
	
}