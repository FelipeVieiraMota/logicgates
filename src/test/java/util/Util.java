package util;

import lombok.experimental.UtilityClass;
import motavieirafelipe.domains.interfaces.IExecutorOneBit;

@UtilityClass
public class Util {

    public static final boolean [][] sample2x4 =
    {
        { false,  false},
        { false,  true },
        { true ,  false},
        { true ,  true },
        { true ,  false},
        { false,  false},
        { true ,  false},
        { false,  false},
        { false,  false},
        { false,  false},
        { false,  false},
        { false,  false},
        { false,  true },
        { true,   false},
    };

    public static void run(boolean[][] samples, IExecutorOneBit iExecutorOneBit) throws InterruptedException {
        System.out.println("+-----------------------+");
        System.out.println("| Data | Store | Result |");
        System.out.println("+-----------------------+");
        for (boolean[] row : samples) {
            iExecutorOneBit.execute(row[0], row[1]);

            var data = row[0] ? "1" : "0";
            var store = row[1] ? "1" : "0";
            var result =  iExecutorOneBit.getOutput() ? "1" : "0";

            System.out.println(data + "        " + store + "        " + result);
            Thread.sleep(3000);
        }
        System.out.println("+-----------------------+");
    }

}
