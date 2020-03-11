package unac.edu.co.v;

import java.util.List;

public class Alumnos {
	
	private String nombre;
	private int id;
	private Double calificacio;
	private List<String> materiasMatriculadas;
	
	public Alumnos(int id, String nombre,List<String> materiasMatriculadas) {
		
		this.id = id;
		this.nombre = nombre;
		this.materiasMatriculadas = materiasMatriculadas;
		
	}
	
	public Alumnos() {

	}
	
	
	
	public Double getCalificacio() {
		return calificacio;
	}

	public void setCalificacio(Double calificacion) {
		this.calificacio = calificacion;
	}

	public void imprimirInformacion() {

		System.out.println("Informacion de alumno");
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Materias matriculadas: ");
		for (String m : this.materiasMatriculadas) {
			System.out.println(m);
		}

	}
	
	
	public void agregarMateria(String nombreMateria) {
		this.materiasMatriculadas.add(nombreMateria);
	}

	public List<String> getMateriasMatriculadas() {
		return materiasMatriculadas;
	}

	public void setMateriasMatriculadas(List<String> idMaterias) {
		this.materiasMatriculadas = idMaterias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
