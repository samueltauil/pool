package org.pool.thread;

import java.util.concurrent.Callable;

import org.apache.log4j.Logger;

public abstract class CallableWorkerThread implements Callable<String> {
    
	public CallableWorkerThread() {
//		setUp();
	}
	
	static Logger logger = Logger.getLogger(CallableWorkerThread.class); 
	
	private String status;

    public abstract void setUp(); 
    
    public abstract String call();
    
    public void setStatus(String status) {
    	this.status = status;
    	logger.debug(status);
    }
}