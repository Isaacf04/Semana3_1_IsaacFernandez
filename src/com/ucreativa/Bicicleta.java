/**
 * 
 */
package com.ucreativa;

/**
 * @author admin
 *
 */
public class Bicicleta {
	
	private String ruedas;
	public String getRuedas() {
		return ruedas;
	}

	public void setRuedas(String ruedas) {
		this.ruedas = ruedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	private String color;
	private String marca;

	// Getters Setters
	
	
	/**
	 * 
	 */
	public Bicicleta() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param ruedas
	 * @param color
	 * @param marca
	 */
	public Bicicleta(String ruedas, String color, String marca) {
		this.ruedas = ruedas;
		this.color = color;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bicicleta [ruedas=" + ruedas + ", color=" + color + ", marca=" + marca + "]";
	}
	
}
