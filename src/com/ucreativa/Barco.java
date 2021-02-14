/**
 * 
 */
package com.ucreativa;

/**
 * @author admin
 *
 */
public class Barco {
	
	private String puerto;
	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	public String getCantidadPasajeros() {
		return cantidadPasajeros;
	}

	public void setCantidadPasajeros(String cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	private String cantidadPasajeros;
	private String destino;
	
	// Getters Setters
	/**
	 * 
	 */
	public Barco() {
		
	}

	/**
	 * @param puerto
	 * @param cantidadPasajeros
	 * @param destino
	 */
	public Barco(String puerto, String cantidadPasajeros, String destino) {
		this.puerto = puerto;
		this.cantidadPasajeros = cantidadPasajeros;
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Barco [puerto=" + puerto + ", cantidadPasajeros=" + cantidadPasajeros + ", destino=" + destino + "]";
	}
	
	
}
