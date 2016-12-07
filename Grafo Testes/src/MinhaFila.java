import java.util.ArrayList;

public class MinhaFila {

	private ArrayList<Vertice> mVertices = new ArrayList<>();
	
	public void enfileirar(Vertice vertice){
		mVertices.add(vertice);
	}
	
	public Vertice desenfileirar(){
		return mVertices.remove(0);
	}
	
	public boolean estaVazia(){
		return mVertices.isEmpty();
	}

}
