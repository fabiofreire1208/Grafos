import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class GrafoListaAdj {

	private ArrayList<LinkedList<Vertice>> mGrafo;
	private ArrayList<Vertice> mVertices;

	private final int BRANCO = 0;
	private final int CINZA = 1;
	private final int PRETO = 2;
	private final int INFINITO = Integer.MAX_VALUE;

	public GrafoListaAdj(ArrayList<Vertice> vertices, ArrayList<LinkedList<Vertice>> grafo){
		this.mVertices = vertices;
		this.mGrafo = grafo;
		buildGrafo();
	}

	public ArrayList<LinkedList<Vertice>> getmGrafo() {
		return mGrafo;
	}

	public void setmGrafo(ArrayList<LinkedList<Vertice>> mGrafo) {
		this.mGrafo = mGrafo;
	}

	private void buildGrafo(){
		for (int i = 0; i < mGrafo.size(); i++){

			mVertices.get(i).setLigacao(mGrafo.get(i));
		}
	}

	public void printGrafo(){
		for (int i = 0; i < mGrafo.size(); i++){
			mVertices.get(i).printVesticesAdjacentes();
		}
	}

	public void printCaminhoEmLargura(Vertice origem){

		if(mVertices.contains(origem)){
			for (int i = 0; i < mVertices.size(); i++){
				if(mVertices.get(i) == origem){
					mVertices.get(i).setCor(CINZA);
					mVertices.get(i).setDistancia(i + 1);
					mVertices.get(i).setPredecessor(null);
				} else {
					mVertices.get(i).setCor(BRANCO);
					mVertices.get(i).setDistancia(INFINITO);
					mVertices.get(i).setPredecessor(null);
				}
			}

			MinhaFila q = new MinhaFila();
			q.enfileirar(origem);

			while(!q.estaVazia()){
				Vertice u = q.desenfileirar();
				System.out.println(u.getVertice());
				for(Vertice adjacente : u.getVerticesProximos()){
					if(adjacente.getCor() == BRANCO){
						adjacente.setCor(CINZA);
						adjacente.setDistancia(0); //arrumar isso aqui
						adjacente.setPredecessor(u);
						q.enfileirar(adjacente);
					}

				}
				
				u.setCor(PRETO);
			}
		} else {
			System.out.println("There is not that vertex");
		}


	}

}
