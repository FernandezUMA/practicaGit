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
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
        System.out.println("modificado por Enrique Fernandez Galvez");//insertado por Enrique Fernandez Galvez
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	//modificaciones Enrique Fernandez Galvez
	System.out.println("Enrique Fernandez Galvez inserta esta sentencia");
    }
	
	public void testGitAux() {
		// Método en rama testing
		System.out.println("Método de testing");
	}
}
