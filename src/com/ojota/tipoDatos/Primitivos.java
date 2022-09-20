package com.ojota.tipoDatos;

public class Primitivos {
/*
 * Tipo	Tamaño	Valor mínimo	Valor máximo
 * byte	8 bits	-128	127
 * short	16 bits	-32768	32767
 * int	32 bits	-2147483648	2147483647
 * long	64 bits	-9223372036854775808	9223372036854775807
 * float	32 bits	-3.402823e38	3.402823e38
 * double	64 bits	-1.79769313486232e308	1.79769313486232e308
 * chart	16 bits	
 */
	public static void main(String Arg[]) {
		byte a = 1 ;
		short b = 10 ; 
		int c = 15;
		long d = 20 ; 
		float e = 25;
		double f = 30 ; 
		char g = 'a';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		//hace cast implicito		
		
		System.out.println(a+b);
		System.out.println(a+c);
		System.out.println(a+d);
		System.out.println(a+e);
		System.out.println(a+f);
 
		System.out.println(a+g);
		//hace cast explicito
		System.out.println((char)(a+g));
		//	
		Integer i = 10;
		String s = "hola soy un string";
		// no tenemos cast implicito 
		System.out.println(i+s);
		System.out.println(s.contains("hola"));
		System.out.println(i.doubleValue());
		
		
		try {
			Integer ff= Integer.parseInt(s);	
			   System.out.println(ff);
		 }catch(NumberFormatException err ) {
	            System.out.println( "ESTO NO SE PUEDE: " + err );

		 }
	}
}
