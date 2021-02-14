/**
 * 
 */
package com.ucreativa;

/**
 * @author Isaac
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bicicleta bicicleta1 = new Bicicleta("dos", "niquelada", "Trek");
        System.out.println("Instancia 1");
        System.out.println(bicicleta1.toString());
        
        Barco barco1 = new Barco("Puntarenas", "Diez", "MauriceIsland");
        System.out.println("Instancia 2");
        System.out.println(barco1.toString());
        
        Moto moto1 = new Moto("Sonido encendida", "100 km/h", "Luces stop");
        System.out.println("Instancia 2");
        System.out.println(moto1.toString());

	}	

}
