package motavieirafelipe.services;

import org.junit.jupiter.api.Test;
import util.Util;

import static util.Util.sample2x4;

class LatchDTest {

    private final LatchD latchD = new LatchD();

    @Test
    public void test() throws InterruptedException {
        Util.run(sample2x4, latchD);
    }
}