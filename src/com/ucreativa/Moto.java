/**
 * 
 */
package com.ucreativa;

/**
 * @author admin
 *
 */
public class Moto {
	
	private String encenderse;
	public String getEncenderse() {
		return encenderse;
	}

	public void setEncenderse(String encenderse) {
		this.encenderse = encenderse;
	}

	public String getAcelerar() {
		return acelerar;
	}

	public void setAcelerar(String acelerar) {
		this.acelerar = acelerar;
	}

	public String getEncenderLuces() {
		return encenderLuces;
	}

	public void setEncenderLuces(String encenderLuces) {
		this.encenderLuces = encenderLuces;
	}

	private String acelerar;
	private String encenderLuces;

	// getters setters
	/**
	 * 
	 */
	public Moto() {
		
	}

	/**
	 * @param encenderse
	 * @param acelerar
	 * @param encenderLuces
	 */
	public Moto(String encenderse, String acelerar, String encenderLuces) {
		super();
		this.encenderse = encenderse;
		this.acelerar = acelerar;
		this.encenderLuces = encenderLuces;
	}

	@Override
	public String toString() {
		return "Moto [encenderse=" + encenderse + ", acelerar=" + acelerar + ", encenderLuces=" + encenderLuces + "]";
	}

}
