package com.educacionit;

public class Pedido {
	private int id;
	private int cantidad;
	private Producto producto;
	
	public Pedido(int id, int cantidad, Producto producto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.producto = producto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	public int calcularSubtotalPedido() {
		/* int total = cantidad*producto.getPrecio();
		 * return total; */
		
		return cantidad*producto.getPrecio();
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cantidad=" + cantidad + ", producto=" + producto + "]";
	}
}
