package mapp.com.java_lib;

import java.util.Random;

public class MyJavaLibrary {

    public int getRandomNumber() {
        return new Random().nextInt(20 - 10 + 1);
    }
}
