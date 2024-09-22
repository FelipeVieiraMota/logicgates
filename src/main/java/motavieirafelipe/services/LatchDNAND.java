package motavieirafelipe.services;

import motavieirafelipe.domains.gates.NAND;
import motavieirafelipe.domains.interfaces.IExecutorOneBit;

public class LatchDNAND implements IExecutorOneBit {

    private boolean finalOutput = false;

    private final NAND nand1 = new NAND();
    private final NAND nand2 = new NAND();
    private final NAND nand3 = new NAND();
    private final NAND nand4 = new NAND();
    private final NAND nand5 = new NAND();

    public void execute(boolean data, boolean store) {
        finalOutput = nand5.addAll(
            nand3.addAll(data, store),
            nand4.addAll(
                nand2.addAll(
                    nand1.addAll(
                        data,
                        data
                    ),
                    store
                ),
                finalOutput
            )
        );
    }

    public boolean getOutput() {
        return finalOutput;
    }
}
