package persona;

public class TestPersona {
	public static void main(String[] args) {
	//vamos a crear un objeto persona
		Persona p=new Persona ("juanito",25);
		System.out.println(p);
		//vamos a cambiar la edad a juanito
		p.setEdad(27);
		System.out.println(p);
		System.out.println("¿Es mayor de edad: "+p);
	}
	/** Metodo que me devuelve si es mayor de edad
	 * @return true si es mayor de edad
	 
	 */
	


}

