package com.educacionit;

public class Main {

	public static void main(String[] args) {
		
		OrdenCompra unOrdenCompra = new OrdenCompra(100);
		
		int totalOrden = unOrdenCompra.calcularTotalOrden();   // -> $0
		System.out.println("Total de mi Orden de Compra: $" + totalOrden);
		
		//Creamos un producto Pan, vale $1000, cantidad: 1
		Producto productoUno = new Producto(100, "Pan", 1000);
		unOrdenCompra.anadirItem(1, 1, productoUno);
		
		Producto productoDos = new Producto(200, "Leche", 500);
		unOrdenCompra.anadirItem(2, 1, productoDos);
		
		Producto productoTres = new Producto(300, "Agua", 800);
		unOrdenCompra.anadirItem(3, 3, productoTres);
		
		totalOrden = unOrdenCompra.calcularTotalOrden();
		System.out.println("Total de mi Orden de Compra: $" + totalOrden);
		
		System.out.println(unOrdenCompra);
		
		System.out.println(productoUno);
		System.out.println(productoDos);
		System.out.println(productoTres);
	}
}
