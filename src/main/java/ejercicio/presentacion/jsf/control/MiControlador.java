package ejercicio.presentacion.jsf.control;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ViewScoped
@ManagedBean(name = "miControlador")
public class MiControlador implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre = "Escriba un nombre";
	private String saludo = "";

	public void saluda() {

		this.saludo = "Hola " + this.nombre;
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Saludado", "Se ha saludado a " + this.nombre + " ."));

		System.out.println("hola");

	}

	public MiControlador() {
		super();
		saluda();
	}

	public void resetNombre() {
		System.out.println("reset");
		this.nombre = "";
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSaludo() {
		return this.saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

}
