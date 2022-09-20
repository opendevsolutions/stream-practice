package com.ojota.interfaces;

public interface ProductBehavor {

	int precio(int anterior, int actual);
	static boolean prendido() {
		return true;
	};
}
