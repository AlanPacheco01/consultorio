package aapr.consultorio.exceptions;

public class CurpNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public CurpNotFoundException(String curp) {
		super("El usuario con el curp: " + curp + " no existe");
	}

}
