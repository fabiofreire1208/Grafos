import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vertice v1 = new Vertice(1);
		Vertice v2 = new Vertice(2);
		Vertice v3 = new Vertice(3);
		Vertice v4 = new Vertice(4);
		Vertice v5 = new Vertice(5);
		
		LinkedList<Vertice> ligacaoV1 = new LinkedList<>();
		ligacaoV1.add(v2);
		ligacaoV1.add(v5);
		
		LinkedList<Vertice> ligacaoV2 = new LinkedList<>();
		ligacaoV2.add(v1);
		ligacaoV2.add(v5);
		ligacaoV2.add(v3);
		ligacaoV2.add(v4);
		
		LinkedList<Vertice> ligacaoV3 = new LinkedList<>();
		ligacaoV3.add(v2);
		ligacaoV3.add(v4);

		LinkedList<Vertice> ligacaoV4 = new LinkedList<>();
		ligacaoV4.add(v2);
		ligacaoV4.add(v5);
		ligacaoV4.add(v3);
		
		LinkedList<Vertice> ligacaoV5 = new LinkedList<>();
		ligacaoV5.add(v4);
		ligacaoV5.add(v1);
		ligacaoV5.add(v2);
		
		v1.setLigacao(ligacaoV1);
		v1.printVesticesAdjacentes();
		v2.setLigacao(ligacaoV2);
		v2.printVesticesAdjacentes();
		v3.setLigacao(ligacaoV3);
		v3.printVesticesAdjacentes();
		v4.setLigacao(ligacaoV4);
		v4.printVesticesAdjacentes();
		v5.setLigacao(ligacaoV5);
		v5.printVesticesAdjacentes();
		
	}

}
