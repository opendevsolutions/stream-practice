package ojota;

import com.ojota.interfaces.ProductBehavor;

public class Practica {
	public static void main(String[] arg) {
			System.out.println("hola");
			ProductBehavor a = new ProductBehavor () {

				@Override
				public int precio(int anterior, int actual) {
					
					return actual - anterior ;
				}
			};
			
			ProductBehavor b =(anterior,actual) ->{
				System.out.println(anterior);
				System.out.println(actual) ;
				return anterior - actual; 
				};
				
				
				ProductBehavor c =(anterior,actual) ->{
					System.out.println(anterior);
					System.out.println(actual) ;
					return anterior * actual; 
					};
				System.out.println(b.precio(1,2));
				System.out.println(cosita ( b));
				System.out.println(cosita ( c));
			    ProductBehavor.prendido();
			
	}
	public static int cosita (ProductBehavor aaa  ) {
		return aaa.precio(12,2);
	}

}
