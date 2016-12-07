import java.util.ArrayList;
import java.util.LinkedList;

public class GrafoListaAdj {
	
	private ArrayList<LinkedList<Vertice>> mGrafo;
	
	public GrafoListaAdj(ArrayList<LinkedList<Vertice>> grafo){
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
			mGrafo.get(i).get(0).setLigacao(mGrafo.get(i));
		}
	}
	
	public void printGrafo(){
		for (int i = 0; i < mGrafo.size(); i++){
			mGrafo.get(i).get(0).printVesticesAdjacentes();
		}
	}

}
