package model.exceptions;

public class DomainException extends RuntimeException { //vai ser uma extensão da classe RuntimeException (não vai ser obrigatório que ela seja tratada)
	private static final long serialVersionUID = 1L; //é obrigatório colocar isso pois essa é uma classe serializible

	public DomainException(String msg) {
		super(msg);
	}
}
