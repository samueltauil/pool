package org.pool.thread.enums;

public enum Status {
	
	INICIANDO_EXECUCAO("INICIANDO EXECUCAO"),
	EXECUTANDO("EXECUTANDO"),
	FINALIZANDO("FINALIZANDO"),
	TERMINADO("TERMINADO");
	
	private String status;
	
	private Status(String status){
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
}
