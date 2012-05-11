package org.pool.thread.example;

import org.pool.thread.CallableWorkerThread;
import org.pool.thread.enums.Status;

public class ExemploCallable extends CallableWorkerThread {

	@Override
	public String call() {
		
		setStatus(Status.INICIANDO_EXECUCAO.getStatus());
		for (int i = 0; i <= 1000; i += 20) {
            setStatus(Status.EXECUTANDO.getStatus());
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
		setStatus(Status.FINALIZANDO.getStatus());
		return Status.TERMINADO.getStatus();
	}

	@Override
	public void setUp() {
		System.out.println("NAKA");
	}

	
	 
}
