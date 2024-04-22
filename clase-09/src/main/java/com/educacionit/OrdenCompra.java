package com.educacionit;

import java.util.ArrayList;

public class OrdenCompra {
	private int id;
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	public OrdenCompra(int id) {
		super();
		this.id = id;
		//this.pedidos = new ArrayList<Pedido>();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void anadirItem(int id, int cantidad, Producto producto) {
		
		Pedido unPedido = new Pedido(id, cantidad, producto);
		pedidos.add(unPedido);
	}
	
	public int calcularTotalOrden() {
		int totalOrden = 0;
		
		for (int unContador = 0; unContador < pedidos.size(); unContador++) {
			Pedido unPedido = pedidos.get(unContador);
			totalOrden = totalOrden + unPedido.calcularSubtotalPedido();
		}
		return totalOrden;
	}
	
	@Override
	public String toString() {
		return "OrdenCompra [id=" + id + ", pedidos=" + pedidos + "]";		
	}	
}
