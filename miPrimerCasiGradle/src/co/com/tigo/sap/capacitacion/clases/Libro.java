package co.com.tigo.sap.capacitacion.clases;

import java.util.Scanner;

public class Libro {
	
	//Variables globales
	String nombre;
	String genero;
	String autor;
	int cantidadPaginas;
	boolean disponible;
	
	Scanner entrada;
	
	//Constructores
	public Libro() {
		this.nombre="";
		this.genero="";
		this.autor="";
		this.cantidadPaginas=0;
		this.disponible=false;
	}
	
	
	
	public Libro(boolean disponible){
		this.nombre="";
		this.genero="";
		this.autor="";
		this.cantidadPaginas=0;
		this.disponible=disponible;
	}
		
	
	//Getters y Settters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCantidadPaginas() {
		return cantidadPaginas;
	}

	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}

	
	//Metodos
	public void registrarLibro() {
		
		int prestamo;
		
		System.out.println("Bievenido, por favor digite los datos del libro que va a registrar");
		
		System.out.println("Ingrese el nombre del libro");
		nombre = entrada.nextLine();
		System.out.println("Ingrese el genero del libro");
		genero = entrada.nextLine();
		System.out.println("Ingrese el autor del libro");
		autor = entrada.nextLine();
		System.out.println("Ingrese la cantidad de paginas del libro");
		cantidadPaginas = entrada.nextInt();
		
		System.out.println("¿El libro se puede prestar? \n 1. Si\n 2. No");
		prestamo = entrada.nextInt();
		
	
		System.out.printf("el nombre del libro es: %s \n el genero del libro es: %s \n El nombre del autor es: %s \n "
				+ "La cantidad de paginas del libro son: %d\n", nombre,genero,autor,cantidadPaginas);
		
		if (prestamo == 1) {
			disponible = true;
			System.out.println("¿Disponibilidad de prestamo? Si");
		}else {
			disponible = false;
			System.out.println("¿Disponibilidad de prestamo? No");
		}
		
		System.out.println("Libro registrado con exito");
					
	}
	

	public boolean prestarLibro(boolean disponible, String nombreLibro) {
			
		if (disponible==true) {
			
			System.out.printf("Usted ha reservado el libro %s \n", nombreLibro);
			
		}else {
			System.out.printf("El libro %s, no se encuentra disponible \n", nombreLibro);
		}
		
		return disponible = false;
	}
	
	public boolean regresarLibro(boolean disponible, String nombreLibro) {
		
		System.out.printf("Usted a regresado el libro %s, Gracias \n", nombreLibro);
		return disponible = true;
	}
	
	
}
