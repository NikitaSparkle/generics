package org.itstep.step02;

import org.itstep.step01.ObjectPair;

public class PairDriver {
    public static void main(String[] args) {
        Pair[] stadiums = new Pair[3];
        // Где здесь generic. Это raw type?
        stadiums[0] = new Pair("Bridgeforth Stadium", 25000);
        stadiums[1] = new Pair("Michigan Stadium", 109901);
        stadiums[2] = new Pair("Lane Stadium", "66,233");

        System.out.println(stadiums[0]);

        System.out.println(largestStadium(stadiums));
    }
    public static String largestStadium(Pair[] stadiums) {
        Pair largest = stadiums[0];
        for (int i = 0; i < stadiums.length; i++) {
            if(Double.valueOf(stadiums[i].getSecond().toString())>Double.valueOf(largest.getSecond().toString())){
                largest=stadiums[i];
            }
        }
        return largest.getFirst().toString();
    }
}

/*
1 бонусный вопрос: нет не скомпилируется, потому что там стояла "," а не "."

2 бонусный вопрос нет.
 */
