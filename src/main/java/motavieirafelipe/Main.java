package motavieirafelipe;


import motavieirafelipe.domains.interfaces.IExecutorOneBit;
import motavieirafelipe.services.LatchD;
import motavieirafelipe.services.LatchDNAND;

public final class Main {

    private Main(){}

    private static Main instance = null;

    private final LatchD latchD = new LatchD();
    private final LatchDNAND latchDNAND = new LatchDNAND();

    private static Main getInstance(){
        if (instance == null){
            instance = new Main();
        }

        return instance;
    }

    public static void main(String[] args) throws InterruptedException {

        final boolean [][] sample2x4 =
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

        extracted(sample2x4, getInstance().latchD);
        extracted(sample2x4, getInstance().latchDNAND);
    }

    private static void extracted(boolean[][] sample2x4, IExecutorOneBit iExecutorOneBit) throws InterruptedException {
        System.out.println("+-----------------------+");
        System.out.println("| Data | Store | Result |");
        System.out.println("+-----------------------+");
        for (boolean[] row : sample2x4) {
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