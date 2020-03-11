package unac.edu.co.v;

import unac.edu.co.v.Alumnos;
import unac.edu.co.v.Materias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws Miexcepcion {
	
		 List<Alumnos> alumnos = new ArrayList<>();
	        List<Materias> materias = new ArrayList<>();

	        Materias m1 = new Materias("1", "Calculo", new ArrayList<>());
	        Materias m2 = new Materias("2", "Algebra",  new ArrayList<>());
	        Materias m3 = new Materias("3", "POO",  new ArrayList<>());
	        Materias m4 = new Materias("4", "Estrutura de Datos", new ArrayList<>());
	        Materias m5 = new Materias("5", "Fisica 1",new ArrayList<>());

	       materias.add(m1);
	       materias.add(m2);
	       materias.add(m3);
	       materias.add(m4);
	       materias.add(m5);
	       
	       
	        
	       Scanner sc = new Scanner(System.in);
	        String resp;
	        int i = 1;
	        
	        
	        try {
	        
	        do {
	        	
	        	 System.out.println("Sistema de calificaciones \n");
		            System.out.println("Seleccione una opción:");
		            System.out.println("1 - Registrar un alumno ");
		            System.out.println("2 - Consultar materia ");
		            System.out.println("3 -  Consultar Alumnos");
		            System.out.println("4 - Calificar alumnos");
		            System.out.println("0 - Salir ");
		            resp = sc.next();
		            switch (resp) {
		                case "1":

		                    List<String> materiasA = new ArrayList<>();

		                    System.out.println("Nombres de alumno");
		                    String nombre = sc.next();
		                    Alumnos alumno = new Alumnos (i, nombre,materiasA);

		                    boolean seguirEligiendo = true;

		                    do {

		                        System.out.println("Eligir materia");
		                        for (int j = 0; j < materias.size(); j++) {
		                            System.out.println(j + 1 + " : " + materias.get(j).getNombre());
		                        }
		                        System.out.println("0 : Salir");

		                        String idMateria = sc.next();

		                        switch (idMateria) {
		                            case "0":
		                                seguirEligiendo = false;
		                                break;
		                            case "1":
		                                (alumno).agregarMateria(materias.get(0).getNombre());
		                                materias.get(0).agregarAlumno(alumno);
		                                break;
		                            case "2":
		                                (alumno).agregarMateria(materias.get(1).getNombre());
		                                materias.get(1).agregarAlumno(alumno);
		                                break;
		                            case "3":
		                                (alumno).agregarMateria(materias.get(2).getNombre());
		                                materias.get(2).agregarAlumno(alumno);
		                                break;
		                            case "4":
		                                (alumno).agregarMateria(materias.get(3).getNombre());
		                                materias.get(3).agregarAlumno(alumno);
		                                break;
		                            case "5":
		                                (alumno).agregarMateria(materias.get(4).getNombre());
		                                materias.get(4).agregarAlumno(alumno);
		                                break;
		                        }

		                    } while (seguirEligiendo);


		                    alumnos.add(alumno);
		                    i++;
		                    resp = "0";
		                    
		                    break;
		                    
		                case "2":
		                    System.out.println("Eligir materia");
		                    for (int j = 0; j < materias.size(); j++) {
		                        System.out.println(j + 1 + " : " + materias.get(j).getNombre());
		                    }

		                    String idMateria = sc.next();

		                    switch (idMateria){
		                        case "1":
		                            Materias m = materias.get(0);
		                            m.imprimirMateria();
		                            break;
		                    }

		                    break;
		                    
		                case "3":
		                    System.out.println("Introduce la id del alumno a consultar :");
		                    int id = sc.nextInt();
		                    Alumnos alumnoBuscado = new Alumnos();
		                    for (Alumnos value : alumnos) {
		                        if (value.getId() == id) {
		                            alumnoBuscado = value;
		                        }
		                    }
		                    System.out.println("Alumno: ");
		                    alumnoBuscado.imprimirInformacion();
		                    resp = "0";
		                    break;
		                    
		                case "4":
		                    boolean seguirCalificando = true;
		                    do {
		                        System.out.println("Eligir materia a calificar");
		                        for (int j = 0; j < materias.size(); j++) {
		                            System.out.println(j + 1 + " : " + materias.get(j).getNombre());
		                        }
		                        System.out.println("0 : Salir");

		                        String materiaS = sc.next();

		                        Materias materia1 = new Materias();

		                        switch (materiaS) {
		                            case "1":
		                                materia1 = materias.get(0);
		                                boolean seCalifico = materia1.calificarEstudiantes(materia1);
		                                if (!seCalifico) {
		                                    System.out.println("No hay estudiantes matriculados");
		                                    seguirCalificando = false;
		                                }

		                                break;
		                            case "0":
		                                seguirCalificando = false;
		                                break;
		                        }
		                    } while (seguirCalificando);
      
		            }
	        	
	        }while("0".equals(resp));
	        
	        }catch (Miexcepcion a) {
	        	System.out.println("No valido");
	        	System.out.println(a.getMessage());
	        }catch (Otraexecptions b) {
	        	System.out.println("Dato no valido");
	        	System.out.println(b.getMessage());
	        }finally {
	        	System.out.println("Finalizado");
	        }
	        	
	        	
	        
	        
	  
	}
}
	       

	


	

