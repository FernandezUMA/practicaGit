/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 * @author Francisco Fern�ndez
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
		System.out.println("modificado por Fco Fernandez"); // insertado por Fco Fernandez
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
        System.out.println("modificado por Enrique Fernandez Galvez");//insertado por Enrique Fernandez Galvez
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	//modificaciones Enrique Fernandez Galvez
	System.out.println("Enrique Fernandez Galvez inserta esta sentencia");
	// modificaciones Fco Fernandez
	System.out.println("Fco Fernandez inserta esta sentencia");
    }
	
	public void testGitAux() {
		// M�todo en rama testing
		System.out.println("M�todo de testing");
	}
}
