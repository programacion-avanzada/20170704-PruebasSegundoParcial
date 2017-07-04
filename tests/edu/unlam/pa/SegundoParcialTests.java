package edu.unlam.pa;

import java.io.File;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.unlam.pe.EjercicioOIA;

public class SegundoParcialTests {

	@BeforeClass
	public static void setUp() {
		for (File file : new File("salidas").listFiles()) {
			if (!file.isDirectory()) {
				file.delete();
			}
		}
	}

	public void ejecutarCaso(int caso) {
		File entrada = new File("entradas/caso" + caso + ".in");
		File salida = new File("salidas/caso" + caso + ".out");
		
		EjercicioOIA ejercicio = new ApellidoUnoApellidoDos(entrada, salida);
		ejercicio.resolver();
	}

	@Test(timeout = 10000)
	public void caso0() {
		ejecutarCaso(0);
	}

	@Test(timeout = 10000)
	public void caso1() {
		ejecutarCaso(1);
	}

	@Test(timeout = 10000)
	public void caso2() {
		ejecutarCaso(2);
	}

	@Test(timeout = 10000)
	public void caso3() {
		ejecutarCaso(3);
	}

	@Test(timeout = 10000)
	public void caso4() {
		ejecutarCaso(4);
	}

	@Test(timeout = 10000)
	public void caso5() {
		ejecutarCaso(5);
	}

	@Test(timeout = 10000)
	public void caso6() {
		ejecutarCaso(6);
	}

	@Test(timeout = 10000)
	public void caso7() {
		ejecutarCaso(7);
	}

	@Test(timeout = 10000)
	public void caso8() {
		ejecutarCaso(8);
	}

	@Test(timeout = 15000)
	public void caso9() {
		ejecutarCaso(9);
	}

}
