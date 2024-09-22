package motavieirafelipe.services;

import org.junit.jupiter.api.Test;
import util.Util;

import static util.Util.sample2x4;

class LatchDNANDTest {

    private final LatchDNAND latchDNAND = new LatchDNAND();

    @Test
    public void test() throws InterruptedException {
        Util.run(sample2x4, latchDNAND);
    }
}