import java.util.ArrayList;
import java.util.LinkedList;

public class GrafoListaAdj {
	
	private ArrayList<LinkedList<Vertice>> mGrafo;
	private ArrayList<Vertice> mVertices;
	
	private final int BRANCO = 0;
	private final int CINZA = 1;
	private final int PRETO = 2;
	
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
	
	public void printCaminhoEmLargura(){
		for (int i = 1; i < mGrafo.size(); i++){
//			System.out.println(mGrafo.get(i).get(0).getVertice());
		}
	}

}
