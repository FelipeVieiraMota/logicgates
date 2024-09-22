package motavieirafelipe.domains.interfaces;

public interface IExecutorOneBit {
    void execute(boolean data, boolean store);
    boolean getOutput();
}
