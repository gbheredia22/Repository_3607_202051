package Encapsulamiento;

public class Persona {
	  private String nombre;
	  public void setNombre(String value) {
	    if (nombre != null) {
	      throw new IllegalStateException("El nombre solamente puede ser fijado una vez");
	    }
	    if (value==null) {
	      throw new IllegalArgumentException("Nombre no puede ser nulo");
	    }
	    if (value.length() < 4 || value.length() > 50) {
	      throw new IllegalArgumentException("Nombre debe medir entre 4 y 50 caracteres");
	    }
	    nombre = value;
	  }
	}