package com.ian.observer.example2.right;

import com.ian.observer.example2.right.boy.BiologyBoy;
import com.ian.observer.example2.right.boy.ComputerBoy;
import com.ian.observer.example2.right.boy.EconomicBoy;
import com.ian.observer.example2.right.boy.Observer;
import com.ian.observer.example2.right.girl.Girl;

/**
 * Created by Ian.Lu on 2019/8/22.
 * Project : DesignPatterns
 */

class Start {
    public static void main(String[] args) {
        Girl girl = new Girl();

        Observer economicBoy = new EconomicBoy(girl);
        Observer biologyBoy = new BiologyBoy(girl);
        Observer computerBoy = new ComputerBoy(girl);

        girl.hungry();
    }
}
