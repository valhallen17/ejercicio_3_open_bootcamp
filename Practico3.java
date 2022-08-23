package ejercicios;

public class Practico3 {

	public static void main(String[] args) {
		
		//instanciando el objeto
		Persona persona1 = new Persona();
		persona1.setEdad(30);
		persona1.setNombre("Karen");
		persona1.setTelefono("12345678910");
		
		//mostrando por consola
		System.out.println("Nombre: "+persona1.getNombre());
		System.out.println("Edad: "+persona1.getEdad());
		System.out.println("Teléfono: "+persona1.getTelefono());
	}
}
		//Aquí creo la clase Persona
		class Persona {
		private int edad;
		private String nombre;
		private String telefono;
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
	}
