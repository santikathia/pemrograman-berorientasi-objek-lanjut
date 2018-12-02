/*
 * pemrograman-berorientasi-objek-lanjut

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 2, 2018 10:58:58 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.lanjut.pertemuan6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author od3ng
 */
public class ThreadNumber implements Runnable {

    private String name;
    private NumberGenerator generator;

    public ThreadNumber(String name) {
        this.name = name;
    }

    public ThreadNumber(String name, NumberGenerator generator) {
        this.name = name;
        this.generator = generator;
    }

    @Override
    public void run() {
        increment();
        callGenerator();
    }

    private void callGenerator() {
        synchronized (generator) {
            for (int i = 0; i < 3; i++) {
                System.out.println(this.name + " genreated: " + generator.randomNumber());
                try {
                    Thread.sleep(250);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ThreadNumber.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void increment() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name + " " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadNumber.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
