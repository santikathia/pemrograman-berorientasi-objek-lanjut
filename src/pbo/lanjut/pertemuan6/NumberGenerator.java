/*
 * pemrograman-berorientasi-objek-lanjut

 * Copyright (c) 2018
 * All rights reserved.
 * Written by od3ng created on Dec 2, 2018 11:54:18 PM
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package pbo.lanjut.pertemuan6;

import java.util.Random;

/**
 *
 * @author od3ng
 */
public class NumberGenerator {

    private int low, high;

    public NumberGenerator(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int randomNumber() {
        Random r = new Random();
        int result = r.nextInt(high - low) + low;
        return result;
    }
}
