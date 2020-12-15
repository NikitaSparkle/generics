package org.itstep.step02;

import org.itstep.step01.ObjectPair;

public class PairDriver {
    public static void main(String[] args) {
        Pair<String, Integer>[] stadiums = new Pair[3];
        stadiums[0] = new Pair<>("Bridgeforth Stadium",(int) 25000);
        stadiums[1] = new Pair<>("Michigan Stadium",(int) 109901);
        stadiums[2] = new Pair<>("Lane Stadium", 66233);

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }
    public static String largestStadium(Pair<String, Integer>[] stadiums) {
        Pair<String, Integer> largest = stadiums[0];
        for (int i = 0; i < stadiums.length; i++) {
            if(stadiums[i].getSecond()>largest.getSecond()){
                largest=stadiums[i];
            }
        }
        return largest.getFirst();
    }

}

/*
1 бонусный вопрос: нет не скомпилируется, потому что там стояла "," а не "."

2 бонусный вопрос нет.
 */
