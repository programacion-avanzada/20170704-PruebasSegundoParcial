package edu.unlam.pe;

import java.io.File;

public abstract class EjercicioOIA {

	protected File entrada, salida;

	public EjercicioOIA(File entrada, File salida) {
		super();
		this.entrada = entrada;
		this.salida = salida;
	}
	
	public abstract void resolver();
	
}
