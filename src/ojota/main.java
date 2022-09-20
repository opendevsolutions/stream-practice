package ojota;

import java.util.List;
import java.util.Optional;

/*
 * Un programa con varias clases que implemente al menos una interface, con al menos dos métodos.
Que la misma pueda llamarse con una expresion lambda, existen condiciones para que esto sea posible
 */
public class main {
	public static void main(String[] args) {
		
		StreamPractice practica = new StreamPractice();
		List<Integer> impares = practica.impares(1,100);
		
		impares.stream().forEach(n->System.out.print(n + "\n"));
		
		List<String> nombres= practica.nombresQueContengan("a");
		practica.cosa(nombres);
		nombres.stream().forEach(n->System.out.print(n + "\n"));
		interfaceProducto a  = new producto();
		interfaceProducto b  = new producto();
		repositoryProducto repo = new repositoryProducto();
		
		a.setCodigo(1);
		a.setNombre("productito");
		a.setDescripcion("soy el mejor producto");
		a.setCosto(1000);		
		a.setGanancia(1.5);
		a.setIva(1.21);
		
		b.setCodigo(2);
		b.setNombre("2productito");
		b.setDescripcion("2soy el mejor producto");
		b.setCosto(120);		
		b.setGanancia(1.2);
		b.setIva(1.0);
		
		repo.add(a);
		repo.add(b);
		
		
		Object econtrado = repo.getById(b.getCodigo());
		System.out.print("solo uno\n");
		System.out.print(econtrado.toString());
		System.out.print("\todos\n");
		System.out.print(repo.toString());
		repo.remove(a.getCodigo());
		System.out.print("\ndespues de eliminar\n");
		System.out.print(repo.toString());
	}
}

