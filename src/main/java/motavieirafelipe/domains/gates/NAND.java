package motavieirafelipe.domains.gates;

import motavieirafelipe.domains.interfaces.ILogicalGate;

public class NAND extends AND implements ILogicalGate {
    @Override
    public boolean addAll(boolean ...inputs) {
        return invert(and(inputs));
    }
}
