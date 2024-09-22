package motavieirafelipe.domains.gates;

import motavieirafelipe.domains.interfaces.ILogicalGate;

public class NOR extends OR implements ILogicalGate {
    @Override
    public boolean addAll(boolean ...inputs) {
        return invert(or(inputs));
    }
}
