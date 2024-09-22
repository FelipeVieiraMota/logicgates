package motavieirafelipe.domains.gates;

import motavieirafelipe.domains.interfaces.ILogicalGate;

public class OR extends NOT implements ILogicalGate {

    protected boolean or(boolean ...inputs) {
        boolean or = false;

        for (boolean input : inputs) {
            or |= input;
        }

        return or;
    }

    @Override
    public boolean addAll(boolean ...inputs) {
        return or(inputs);
    }
}
