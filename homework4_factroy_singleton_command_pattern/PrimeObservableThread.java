package homework4_factroy_singleton_command_pattern;

import java.util.ArrayList;

public class PrimeObservableThread implements Runnable, Subject {
    ArrayList<Observer> observers;
    private static final int SLEEPTIME = 500;

    private int primeNumber;
    private int numCount;
    private boolean first = true;
    private boolean stopRunning = false;

    public PrimeObservableThread() {
        observers = new ArrayList<Observer>();
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
        while (stopRunning == false) {
            if (first) {
                first = false;
                primeNumber = 2;   // 泥� 踰덉?�� �냼�닔�뒗 2
                System.out.println(primeNumber);
                notifyObservers();
                numCount = 1; // �떎�쓬 �떒?�꾨��꽣�?�� 2?���? �뜑�빐�꽌 ���닔留� �솗�씤�븯誘�濡� 1濡� 諛붽?���꽌 �떎�쓬 �닽�옄?���? 3�쑝濡� 留뚮뱾�뼱��? �븿
            } else {
                numCount += 2; // 2?���? �젣�쇅�븳 吏앹?���뒗 �냼�닔媛� �맆 �닔 �뾾�쓬. �뵲�씪�꽌 ���닔留� 寃��궗
                if (isPrimeNumber(numCount)) {
                    primeNumber = numCount;
                    System.out.println(primeNumber);
                    notifyObservers();
                }
            }
            try {
                Thread.sleep(SLEEPTIME); // 1?���? �돹
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        generatePrimeNumber();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(primeNumber);
        }
    }
}
