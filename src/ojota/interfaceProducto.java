package ojota;

public interface interfaceProducto {

	public static  int codigo = 0;
	public static String nombre="";
	public static String descripcion="";
	public static double costo=0;
	public static double iva=0;
	public static double ganancia=0;
	public void setCodigo(int codigo) ;
	public int getCodigo();
    public String getNombre() ;
    public void setNombre(String nombre) ;
    public String getDescripcion() ;
    public void setDescripcion(String descripcion) ;
    public double getCosto() ;
    public void setCosto(double costo) ;
    public double getIva() ;
    public void setIva(double iva) ;
    public double getGanancia() ;
    public void setGanancia(double ganancia) ;
    public double  precioVenta();
    public double precioConsumidorFinal() ;
    public String toString();
}
