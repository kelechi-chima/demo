package com.demo.misc;

public class LongRunningTask implements Runnable {
    
    @Override
    public void run() {
        try {
            for (double progressPercentage = 0.0; progressPercentage < 1.0; progressPercentage += 0.01) {
                updateProgress(progressPercentage);
                Thread.sleep(40L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Long running task complete");
    }
    
    private void updateProgress(double progressPercentage) {
        final int width = 50;
        
        System.out.print("\r[");
        int i = 0;
        for (; i <= (int)(progressPercentage*width); i++) {
            System.out.print(".");
        }
        for (; i < width; i++) {
            System.out.print(" ");
        }
        System.out.print("]");
    }
}
