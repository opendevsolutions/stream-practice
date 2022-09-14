package ojota;

public class producto implements interfaceProducto{

	private int codigo ;
	private String nombre;
	private String descripcion;
	private double costo;
	private double iva;
	private double ganancia;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public double getIva() {
		return (iva*100)-100;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getGanancia() {
		return (ganancia*100)-100;
	}
	public void setGanancia(double ganancia) {
		this.ganancia = ganancia;
	}
	public double  precioVenta() {
		 return this.ganancia * this.costo;				  
	}
	public double precioConsumidorFinal() {
		return this.precioVenta() * this.iva;
	}
	public String toString() {
		return "codigo:" + this.codigo 
				+ " - nombre:" + this.nombre 
				+ " - descripcion:" + this.descripcion 
				+ " - costo: $" + this.costo 
				+ " - ganancia: % " + this.getGanancia() 
				+ " - iva: % "+ this.getIva() 
				+ " - precio venta: $" + this.precioVenta()
				+ " - consumidor final: $" +this.precioConsumidorFinal();		
	}
	
	
}
