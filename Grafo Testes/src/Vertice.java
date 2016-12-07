import java.util.HashMap;
import java.util.LinkedList;

public class Vertice {
	
	private LinkedList<Vertice> ligacao;
	private int vertice;
	
	private Integer cor;
	private Vertice predecessor;
	private Integer distancia;

	

	Integer getCor() {
		return cor;
	}

	void setCor(Integer cor) {
		this.cor = cor;
	}

	Vertice getPredecessor() {
		return predecessor;
	}

	void setPredecessor(Vertice predecessor) {
		this.predecessor = predecessor;
	}

	Integer getDistancia() {
		return distancia;
	}

	void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}

	public int getVertice() {
		return vertice;
	}

	public void setVertice(int vertice) {
		this.vertice = vertice;
	}

	public LinkedList<Vertice> getLigacao() {
		return ligacao;
	}

	public Vertice(int mVertice){
		this.ligacao = null;
		this.vertice = mVertice;
	}

	public void setLigacao(LinkedList<Vertice> mLigacao){
		this.ligacao = mLigacao;
	}

	public LinkedList<Vertice> getVerticesProximos(){
		return ligacao;
	}

	public void printVesticesAdjacentes(){
		
		String imprimirLista;
		
		if(ligacao.isEmpty() || ligacao == null){
			imprimirLista = vertice + "->/";
		} else {
			imprimirLista = vertice + "->";

			for(int i = 0; i < ligacao.size(); i++){
				if(ligacao.get(i) == ligacao.getLast()){
					imprimirLista = imprimirLista + ligacao.get(i).vertice + "->/";
				} else {
					imprimirLista = imprimirLista + ligacao.get(i).vertice + "->";
				}
				
			}

		}
		
		System.out.println(imprimirLista);
	}
	
	public void printPredecessor(){
		if(predecessor != null)
			System.out.print(predecessor.getVertice());
		else
			System.out.print("Nulo");
	}
}
