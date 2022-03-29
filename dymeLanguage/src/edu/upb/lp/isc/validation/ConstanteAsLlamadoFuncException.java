package edu.upb.lp.isc.validation;

import edu.upb.lp.isc.dymeLanguage.Declaracion;

public class ConstanteAsLlamadoFuncException extends Exception {

	private static final long serialVersionUID = 2L;
	private String code;
	private Declaracion decltTrouble;
	
	public Declaracion getDeclTrouble() {
		return decltTrouble;
	}

	public void setDeclTrouble(Declaracion constTrouble) {
		this.decltTrouble = constTrouble;
	}

	public ConstanteAsLlamadoFuncException(String code, String message, Declaracion decl) {
	    super(message);
	    this.setCode(code);
	    this.setDeclTrouble(decl);
	}

	public String getCode() {
	    return code;
	}

	public void setCode(String code) {
	    this.code = code;
	}

}
