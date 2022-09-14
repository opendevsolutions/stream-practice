package ojota;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Crear una clase de StreamPractice donde quiero que hagas lo siguiente
 */
public class StreamPractice {

	
	private  List<Integer> numeros= new ArrayList<Integer>();
	private  List<String> nombres= new ArrayList<String>();

	//crees una lista del 1 al 100 y filtres los numeros impares.
	public List<Integer> impares(int desde,int hasta){		
		this.LLenarListaNumeros(desde,hasta);
		return this.numeros.stream().filter(n->n%2!=0).collect(Collectors.toList());
	}
	//crees una lista de nombre propios y filtres por aquellos que tengan "a"

	public List<String>nombresQueContengan(String coincidencia){
		this.llenarListaNombres();
		return this.nombres.stream().filter(nombre-> nombre.contains(coincidencia)).collect(Collectors.toList());
	}
	private void llenarListaNombres() {
		this.nombres.add("axel");
		this.nombres.add("lucas");
		this.nombres.add("manuel");
		this.nombres.add("nico");
		this.nombres.add("jose");
	}
	private void LLenarListaNumeros( int desde,int hasta ){
		int n = desde ; 
		while (n <=hasta) {
			this.numeros.add(n);
			n++;			
		}		
	}

}

