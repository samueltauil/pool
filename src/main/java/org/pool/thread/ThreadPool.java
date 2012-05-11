package org.pool.thread;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public abstract class ThreadPool implements Job {

	public ThreadPool() {
		BasicConfigurator.configure();
	}
	
	static Logger logger = Logger.getLogger(ThreadPool.class); 
	
	private List<CallableWorkerThread> workers = new LinkedList<CallableWorkerThread>();

	private ExecutorService executorService; 
	
	private List<Future<String>> futures = new LinkedList<Future<String>>();
	
	public ExecutorService getExecutorService() {
		return executorService;
	}

	public void setExecutorService(ExecutorService executorService) {
		this.executorService = executorService;
	}
	
	public void addCallableWorkerThread(CallableWorkerThread thread) {
		workers.add(thread);
	}
	
	private List<CallableWorkerThread> getWorkers() {
		return workers;
	}

	public void setWorkers(List<CallableWorkerThread> workers) {
		this.workers = workers;
	}
	
	private void addFuture(Future<String> future) {
		futures.add(future);
	}

	private List<Future<String>> getFutures() {
		return futures;
	}
	
	
	/**
	 * M�todo que define os valores para os par�metros do pool. 
	 * <br>Deve ser definido o log level.
	 * <br>Deve ser definido a implementa��o do {@link ExecutorService}.
	 */
	protected abstract void setUp();
	
	protected void tearDown(){
		getExecutorService().shutdownNow();
	}
	
	protected void runProcess() throws InterruptedException, ExecutionException {
		
		setUp();
		
		for (Iterator iterator = getWorkers().iterator(); iterator.hasNext();) {
			CallableWorkerThread thread = (CallableWorkerThread) iterator.next();
			addFuture(getExecutorService().submit(thread));
		}
		for (Iterator iterator = getFutures().iterator(); iterator.hasNext();) {
			Future<String> future = (Future<String>) iterator.next();
			logger.debug(future.get());
		}
		
		tearDown();
	
	}

	public abstract void execute(JobExecutionContext arg0) throws JobExecutionException;
	
}