import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vertice v1 = new Vertice(1);
		Vertice v2 = new Vertice(2);
		Vertice v3 = new Vertice(3);
		Vertice v4 = new Vertice(4);
		Vertice v5 = new Vertice(5);
		
		ArrayList<Vertice> vertices = new ArrayList<>();
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		vertices.add(v4);
		vertices.add(v5);
		
		
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
		
		ArrayList<LinkedList<Vertice>> grafo = new ArrayList<>();
		grafo.add(ligacaoV1);
		grafo.add(ligacaoV2);
		grafo.add(ligacaoV3);
		grafo.add(ligacaoV4);
		grafo.add(ligacaoV5);
		
		GrafoListaAdj meuGrafo = new GrafoListaAdj(vertices, grafo);
//		meuGrafo.printCaminhoEmLargura();
		meuGrafo.printGrafo();
		
		
	}

}
