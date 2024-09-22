package motavieirafelipe.domains.gates;

import motavieirafelipe.domains.interfaces.ILogicalGate;

public class AND extends NOT implements ILogicalGate{

    protected boolean and(boolean ...inputs) {
        boolean and = true;

        for (boolean input : inputs) {
            and &= input;
        }

        return and;
    }

    @Override
    public boolean addAll(boolean ...inputs) {
        return and(inputs);
    }
}