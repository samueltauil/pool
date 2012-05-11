package org.pool.thread.example;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import org.pool.thread.ThreadPool;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ExemploThreadPool extends ThreadPool {

	@Override
	protected void setUp() {
		setExecutorService(Executors.newCachedThreadPool());
	}

	private void execute() {
		
		ExemploCallable exemploCallable1 = new ExemploCallable();
		ExemploCallable exemploCallable2 = new ExemploCallable();
		ExemploCallable exemploCallable3 = new ExemploCallable();
		ExemploCallable exemploCallable4 = new ExemploCallable();
		ExemploCallable exemploCallable5 = new ExemploCallable();
		ExemploCallable exemploCallable6 = new ExemploCallable();
		ExemploCallable exemploCallable7 = new ExemploCallable();
		ExemploCallable exemploCallable8 = new ExemploCallable();
		ExemploCallable exemploCallable9 = new ExemploCallable();
		ExemploCallable exemploCallable10 = new ExemploCallable();
		ExemploCallable exemploCallable11 = new ExemploCallable();
		ExemploCallable exemploCallable12 = new ExemploCallable();
		ExemploCallable exemploCallable13 = new ExemploCallable();
		ExemploCallable exemploCallable14 = new ExemploCallable();
		ExemploCallable exemploCallable15 = new ExemploCallable();
		ExemploCallable exemploCallable16 = new ExemploCallable();
		ExemploCallable exemploCallable17 = new ExemploCallable();
		ExemploCallable exemploCallable18 = new ExemploCallable();
		ExemploCallable exemploCallable19 = new ExemploCallable();
		ExemploCallable exemploCallable20 = new ExemploCallable();
		ExemploCallable exemploCallable21 = new ExemploCallable();
		ExemploCallable exemploCallable22 = new ExemploCallable();
		ExemploCallable exemploCallable23 = new ExemploCallable();
		ExemploCallable exemploCallable24 = new ExemploCallable();
		ExemploCallable exemploCallable25 = new ExemploCallable();
		ExemploCallable exemploCallable26 = new ExemploCallable();
		ExemploCallable exemploCallable27 = new ExemploCallable();
		ExemploCallable exemploCallable28 = new ExemploCallable();
		ExemploCallable exemploCallable29 = new ExemploCallable();
		ExemploCallable exemploCallable30 = new ExemploCallable();
		ExemploCallable exemploCallable31 = new ExemploCallable();
		ExemploCallable exemploCallable32 = new ExemploCallable();
		
		addCallableWorkerThread(exemploCallable1);
		addCallableWorkerThread(exemploCallable2);
		addCallableWorkerThread(exemploCallable3);
		addCallableWorkerThread(exemploCallable4);
		addCallableWorkerThread(exemploCallable5);
		addCallableWorkerThread(exemploCallable6);
		addCallableWorkerThread(exemploCallable7);
		addCallableWorkerThread(exemploCallable8);
		addCallableWorkerThread(exemploCallable9);
		addCallableWorkerThread(exemploCallable10);
		addCallableWorkerThread(exemploCallable11);
		addCallableWorkerThread(exemploCallable12);
		addCallableWorkerThread(exemploCallable13);
		addCallableWorkerThread(exemploCallable14);
		addCallableWorkerThread(exemploCallable15);
		addCallableWorkerThread(exemploCallable16);
		addCallableWorkerThread(exemploCallable17);
		addCallableWorkerThread(exemploCallable18);
		addCallableWorkerThread(exemploCallable19);
		addCallableWorkerThread(exemploCallable20);
		addCallableWorkerThread(exemploCallable21);
		addCallableWorkerThread(exemploCallable22);
		addCallableWorkerThread(exemploCallable23);
		addCallableWorkerThread(exemploCallable24);
		addCallableWorkerThread(exemploCallable25);
		addCallableWorkerThread(exemploCallable26);
		addCallableWorkerThread(exemploCallable27);
		addCallableWorkerThread(exemploCallable28);
		addCallableWorkerThread(exemploCallable29);
		addCallableWorkerThread(exemploCallable30);
		addCallableWorkerThread(exemploCallable31);
		addCallableWorkerThread(exemploCallable32);

		
		try {
			runProcess();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}


	public static void main(String[] args) {
		ExemploThreadPool exemploThreadPool = new ExemploThreadPool();
		exemploThreadPool.execute();
	}

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		
	}


}
