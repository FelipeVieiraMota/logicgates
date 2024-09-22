package motavieirafelipe.services;

import lombok.Getter;
import motavieirafelipe.domains.interfaces.IExecutor4Bits;

public class DLatch4Bits implements IExecutor4Bits {


    private final LatchD latchD0 = new LatchD();
    private final LatchD latchD1 = new LatchD();
    private final LatchD latchD2 = new LatchD();
    private final LatchD latchD3 = new LatchD();

    @Getter private boolean outputBit0 = false;
    @Getter private boolean outputBit1 = false;
    @Getter private boolean outputBit2 = false;
    @Getter private boolean outputBit3 = false;

    @Override
    public void execute(boolean bit0, boolean bit1, boolean bit2, boolean bit3, boolean store) {
        latchD0.execute(bit0, store);
        latchD1.execute(bit1, store);
        latchD2.execute(bit2, store);
        latchD3.execute(bit3, store);


        outputBit0 = latchD0.getOutput();
        outputBit1 = latchD1.getOutput();
        outputBit2 = latchD2.getOutput();
        outputBit3 = latchD3.getOutput();
    }
}