package motavieirafelipe.services;

import motavieirafelipe.domains.gates.AND;
import motavieirafelipe.domains.gates.NOR;
import motavieirafelipe.domains.gates.NOT;
import motavieirafelipe.domains.interfaces.IExecutorOneBit;

public class LatchD implements IExecutorOneBit {

    private final NOT notGate = new NOT();
    private final NOR nor3    = new NOR();
    private final NOR nor4    = new NOR();
    private final AND and3    = new AND();
    private final AND and4    = new AND();

    private boolean getOutput = false;

    @Override
    public void execute(boolean data, boolean store) {
        getOutput = nor4.addAll(and4.addAll(notGate.invert(data), store), nor3.addAll(and3.addAll(data, store), getOutput));
    }

    @Override
    public boolean getOutput() {
        return getOutput;
    }
}
