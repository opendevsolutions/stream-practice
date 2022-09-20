package ojota;

public class PracticaDos {
//	modificadores de acceso, datatypes -> primitivos y sus clases wrappers, casting, y Excepciones chequeadas y no chequeadas

	//desde cualquier lado 
	public int sumaEnteros(int a , int b ) {
		return a +b ;
	}
	//solo desde aca 
	private int  RestaEnteros(int  a , int b ) {
		return a + b ; 
	}
	public int TenemosQueRestar(int a , int b ) {
		return RestaEnteros(a,b);
	}
	//solo desde el mismo package,clase o quienes hereden
	protected int MultiplicacionEnteros(int a , int b ) {
		return a* b ;
	}
	//solo desde el mismo paquete o clase.
	int DivisionEnteros(int a , int b ) {
		return a / b ;
	}
}
