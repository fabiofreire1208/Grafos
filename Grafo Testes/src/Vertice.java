import java.util.LinkedList;

public class Vertice {
	
	private LinkedList<Vertice> ligacao;
	private int vertice;

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
}
