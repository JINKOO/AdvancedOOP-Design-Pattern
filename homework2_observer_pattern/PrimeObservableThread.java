package homework2_observer_pattern;

import java.util.ArrayList;

public class PrimeObservableThread implements Runnable, Subject{
	
    private static final int SLEEPTIME = 500;
    private int primeNumber;
    private int numCount;
    private boolean first = true;
    private boolean stopRunning = false;
    
    private ArrayList<Observer> observerLists;
    
    public PrimeObservableThread() {
		// TODO Auto-generated constructor stub
    	this.observerLists = new ArrayList<>();
	}
    
    public int getPrimeNumber() {
        return primeNumber;
    }
    
    public void stopRunning() {
    	stopRunning = true;
    }
    
    public void startRunning() {
    	stopRunning = false;
    	run();
    }
    
    private void generatePrimeNumber() {
    	
    	while(stopRunning == false) {
    		if(first) {
    			first = false;
    			primeNumber = 2;
    			System.out.println(primeNumber);
    			numCount = 1;
    		}
    		else {
    			numCount = numCount + 2;
    			if(isPrimeNumber(numCount)) {
    				primeNumber = numCount;
    				System.out.println(primeNumber);
    			}
    		}
    		try {
//    			notifyObservers();
    			Thread.sleep(SLEEPTIME);
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    		notifyObservers();
    	}
    }
    
    private boolean isPrimeNumber(int n) {
    	for(int i = 2; i*i <= n; i++) {
    		if(n % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
    
    @Override
    public void run() {
    	generatePrimeNumber();
    	
    }
    
    public boolean isStopRunning() {
    	return this.stopRunning;
    }
    
    @Override
    public void registerObserver(Observer o) {
    	observerLists.add(o);
    }
    
    
    @Override
    public void removeObserver(Observer o) {
    	int i = observerLists.indexOf(o);
    	if(i >= 0)
    		observerLists.remove(i);
    }
    
    @Override
    public void notifyObservers() {
    	for(int i = 0; i<observerLists.size(); i++) {
    		Observer observer = (Observer)observerLists.get(i);
    		observer.update(this.getPrimeNumber());
    	}
    }
}
