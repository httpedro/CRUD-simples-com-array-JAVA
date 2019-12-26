import java.util.Scanner;

public class AppFarmacia {
	private static Scanner ler;

	public static void main(String[] args) {
		ler = new Scanner(System.in);
		Farmacia farmacia = new Farmacia();
		int opcao;
		opcao = 0;
		long idRemdio = 0;
		String nomeRemedio = "";
		Remedio remedioEncontrado = null;
		do {
			System.out.println("===========FARMACI@@===========");
			System.out.println("||                           ||");
			System.out.println("=============OPÇÕES============");
			System.out.println("||                           ||");
			System.out.println("||    1---registrar Remedio  ||");
			System.out.println("||                           ||");
			System.out.println("||    2---listar remedios    ||");
			System.out.println("||                           ||");
			System.out.println("||    3---vender remedio     ||");
			System.out.println("||                           ||");
			System.out.println("||    4---editar remedio     ||");
			System.out.println("||                           ||");
			System.out.println("||    5---buscar remedio     ||");
			System.out.println("||                           ||");
			System.out.println("||    6---sair do sistema    ||");
			System.out.println("||                           ||");
			System.out.println("===============================");
			opcao = ler.nextInt();
			ler.nextLine();

			switch (opcao) {
			case 1:
				Remedio remedio = new Remedio();
				System.out.println("====================================================");
				System.out.println("||               Registrar Remedio                ||");
				System.out.println("====================================================");
				System.out.println("||                                                ||");
				System.out.println("|| Digite o nome do remedio:                      ||");
				remedio.setNome(ler.nextLine());
				System.out.println("||                                                ||");
				System.out.println("|| Digite o numero de comprimidos do medicamento: ||");
				remedio.setNumcomprimido(ler.nextInt());;
				System.out.println("||                                                ||");
				System.out.println("|| Digite a quantidade de cartelas do medicamento:||");
				remedio.setNumCartela(ler.nextInt());
				System.out.println("||                                                ||");
				System.out.println("|| Digite as dosagens diarias:                    ||");
				remedio.setQuantDoseDiaria(ler.nextInt());
				System.out.println("||                                                ||");
				System.out.println("|| Digite a classificacao do medicamento:         ||");
				remedio.setClassificacao(ler.next());
				System.out.println("||                                                ||");
				System.out.println("||Digite o codigo do remedio:                     ||");
				remedio.setId(ler.nextLong());
				System.out.println("||                                                ||");
				System.out.println("====================================================");
				if (farmacia.receberRemedios(remedio)) {
					System.out.println("====================================================");
					System.out.println("   "+remedio.getNome()+" registrado com sucesso     ");
					System.out.println("====================================================");
				} else {
					System.out.println("====================================================");
					System.out.println("||                    Falha                       ||");
					System.out.println("====================================================");
				}
				break;
			case 2:
				System.out.println("====================================================");
				System.out.println("||               Lista de Remedios                ||");
				System.out.println("====================================================");
				farmacia.listarRemedios();
				break;
			case 3:
				System.out.println("====================================================");
				System.out.println("||               Vender Medicamento               ||");
				System.out.println("====================================================");
				System.out.println("====================================================");
				System.out.println("|| Digite o nome o id do remdio que será vendido  ||");
				System.out.println("====================================================");
				idRemdio=ler.nextLong();
				if(farmacia.venderRemedios(idRemdio)) {
					System.out.println("====================================================");
					System.out.println("||           Remedio vendidio com sucesso         ||");
					System.out.println("====================================================");
				}
				else{
					System.out.println("====================================================");
					System.out.println("||           Remedio nao vendidio                 ||");
					System.out.println("====================================================");
					
				}
				break;
			case 5:
				System.out.println("====================================================");
				System.out.println("||               Buscar Medicamento               ||");
				System.out.println("====================================================");
				System.out.println(" Digite o nome do Remedio que vai ser buscado: ");
				nomeRemedio=ler.next();
				remedioEncontrado=farmacia.buscarRemedio(nomeRemedio);
				if(remedioEncontrado!=null) {
					System.out.println("========================================");
					System.out.println("Remedio encontardo:");
					System.out.println("                    ");
					System.out.println("Nome:     ");
					System.out.println(remedioEncontrado.getNome());
					System.out.println("Numero de Comprimidos:   ");
					System.out.println(remedioEncontrado.getNumcomprimido());
					System.out.println("Numero de Cartelas:     ");
					System.out.println(remedioEncontrado.getNumCartela());
					System.out.println("Doses diarias:     ");
					System.out.println(remedioEncontrado.getQuantDoseDiaria());
					System.out.println("Classificação do medicamento:     ");
					System.out.println(remedioEncontrado.getClassificacao());
					System.out.println("codigo ID:     ");
					System.out.println(remedioEncontrado.getId());
					System.out.println("========================================");
				}
				else {
					System.out.println("=========================");
					System.out.println("  Contato não Encontrado ");
					System.out.println("=========================");
				}
				break;
			
			case 4:
				System.out.println("====================================================");
				System.out.println("||              Alterar Medicamento               ||");
				System.out.println("====================================================");
				System.out.println(" Digite o nome do Remedio que vai ser buscado: ");
				nomeRemedio=ler.next();
				remedioEncontrado=farmacia.buscarRemedio(nomeRemedio);
				if(remedioEncontrado!=null) {
					System.out.println("====================================================");
					System.out.println("||                     EDIÇÃO                     ||");
					System.out.println("====================================================");
					System.out.println("Remedio encontardo:");
					System.out.println("                    ");
					System.out.println("Nome:     ");
					System.out.println(remedioEncontrado.getNome());
					System.out.println("Edite o nome do Remedio: ");
					remedioEncontrado.setNome(ler.next());
					System.out.println("Edite o Numero de comprimidios do Remedio: ");
					remedioEncontrado.setNumcomprimido(ler.nextInt());
					System.out.println("Edite o numero de cartelas do Remedio: ");
					remedioEncontrado.setNumCartela(ler.nextInt());
					System.out.println("Edite aquantidade de doses do Remedio: ");
					remedioEncontrado.setQuantDoseDiaria(ler.nextInt());
					System.out.println("Edite a classificação do Remedio: ");
					remedioEncontrado.setClassificacao(ler.next());
					System.out.println("Edite o id do Remedio: ");
					remedioEncontrado.setId(ler.nextLong());
					System.out.println("====================================================");
				}else {
					System.out.println("!!Remedio não encontrado amorzinho!!");
				}
				
				break;
			default:
				break;
			}

		} while (opcao != 6);
		System.out.println("====================================================");
		System.out.println("||            OPERAÇÃO   FINALIZADA               ||");
		System.out.println("====================================================");
	}
}
