package Attestation_1.Task2;

import java.util.Random;

public class HumiditySensor {

    public int setHumidity() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
