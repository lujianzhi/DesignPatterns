package com.ian.observer.example2.wrong.girl;

import com.ian.observer.example2.wrong.boy.BiologyBoy;
import com.ian.observer.example2.wrong.boy.ComputerBoy;
import com.ian.observer.example2.wrong.boy.EconomicBoy;

/**
 * Created by Ian.Lu on 2019/8/21.
 * Project : DesignPatterns
 * <p>
 * 女神
 */

class Girl {

    public static void main(String[] args) {

        //我饿了
        System.out.println("女神:我饿了");

        EconomicBoy economicBoy = new EconomicBoy();
        BiologyBoy biologyBoy = new BiologyBoy();
        ComputerBoy computerBoy = new ComputerBoy();

        economicBoy.careWay();
        biologyBoy.careWay();
        computerBoy.careWay();
    }
}
