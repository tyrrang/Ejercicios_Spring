package beans;

import beans.InterpreteEspanol;
import beans.Traductor;

public class PruebaInterprete {
	public static void main(String[] args) {
		Traductor traductor = new Traductor();
		InterpreteEspanol interprete = new InterpreteEspanol();
		// El interprete se inyecta manualmente
		// Y solamente puede recibir un interprete en Espa�ol
		// No un interprete en Ingl�s u otros idiomas
		traductor.setInterprete(interprete);
		traductor.setNombre("Carlos Esparza");
		traductor.hablar();
	}
}
