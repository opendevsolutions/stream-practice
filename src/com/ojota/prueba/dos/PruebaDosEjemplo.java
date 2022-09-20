package com.ojota.prueba.dos;

import ojota.PracticaDos;
import ojota.QueremosDividir;

public class PruebaDosEjemplo {
	public static void main(String Arg[]) {
				PracticaDos t = new PracticaDos();
				System.out.println(t.sumaEnteros(1, 2));
				// se va a ir a la goma, xq no es acesible desde aca 
			//	System.out.println(t.RestaEnteros(1, 2));
				//este si le copa 
				System.out.println(t.TenemosQueRestar(1, 2));
				// se va a ir a la goma 
				//System.out.println(t.MultiplicacionEnteros(1, 2));
				//asi si funciona
				QueremosMultiplicar m = new QueremosMultiplicar();
				System.out.println(m.AhoraSi(1, 2));
				// se va a la goma 
				//System.out.println(t.DivisionEnteros(1,2));
				//esto si funciona
				QueremosDividir d= new QueremosDividir();
				System.out.println(d.AhoraSi(2,2));
	}
}

