package unac.edu.co.v;

import java.util.List;
import java.util.Scanner;

public class Materias {

	private String nombre;
	private String idMateria;
	private List<Alumnos> alumnos;

	Scanner sc = new Scanner(System.in);
	

	public Materias(String idMateria, String nombre, List<Alumnos> alumnos) {

		this.idMateria = idMateria;
		this.nombre = nombre;
		this.alumnos = alumnos;

	}
	
	public Materias() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setAlumnos(List<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

	public List<Alumnos> getAlumnos() {
		return alumnos;
	}
	
	public String getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}
	
	public void imprimirMateria(){
        System.out.println("Informacion de materia");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Alumnos matriculados");
        for(Alumnos al: this.getAlumnos()){
            System.out.println("Nombre: " + al.getNombre());
            System.out.println("Nota: " + al.getCalificacio());
        }
    }
	
	public boolean calificarEstudiantes(Materias materia1) throws Miexcepcion, Otraexecptions {

        if (!materia1.getAlumnos().isEmpty()) {
            for (Alumnos alumno : materia1.alumnos) {
                System.out.println("Alumno: " + alumno.getNombre());
                System.out.print("Nota: ");
                String calificacion = sc.next();
                if (isNumeric(calificacion)) {
				alumno.setCalificacio(parseDouble(calificacion));
                }else {
                	
                	throw new Miexcepcion("Valor invalido");
                }
                
                if (parseDouble(calificacion)<0 && parseDouble(calificacion)>5) {
                	
                	throw new Otraexecptions ("Fuera de Rango");
                }
            }
            return true;
        }else {
            return false;
        }
        
    }
	
	private Double parseDouble(String calificacion) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public void agregarAlumno(Alumnos alumno) {
        this.alumnos.add(alumno);
    }
	

}
