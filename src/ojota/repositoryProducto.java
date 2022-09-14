package ojota;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class repositoryProducto {

	private  List<interfaceProducto> productos = new ArrayList<>();
	
	public  void add(interfaceProducto p) {
		this.productos.add(p);
	}
	public void remove(int codigo) {
	    
	    this.productos = this.productos.stream().filter(p -> p.getCodigo()!=codigo).collect(Collectors.toList());

	}
	public  Object getById(int id) {
		return   this.productos.stream().filter(p -> p.getCodigo()==id).collect(Collectors.toList());
	}
	public String toString() {
		String  output=""; 
		// por el scope de output no encontre como usar stream
		
		int i = 0;		
        while (i < this.productos.size()) {
        	output +=this.productos.get(i).toString()+"\n";
		 i++;
        }
        return output;
	
	}
	
}
