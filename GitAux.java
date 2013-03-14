/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 * @author Francisco Fernández
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
		System.out.println("modificado por Fco Fernandez"); // insertado por Fco Fernandez
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
		// modificaciones Fco Fernandez
		System.out.println("Fco Fernandez inserta esta sentencia");
    }
	
	public void testGitAux() {
		// Método en rama testing
		System.out.println("Método de testing");
	}
}
