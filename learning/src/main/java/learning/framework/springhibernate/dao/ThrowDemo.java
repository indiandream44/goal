package learning.framework.springhibernate.dao;

import java.io.FileNotFoundException;

public class ThrowDemo {

    static void recharge(int r) {
        try {
            if (r < 0)
                throw new FileNotFoundException();
        } catch (Exception e) {
            r = 0;
            System.out.println(e);
        }

        System.out.println("ur successfully recharged with " + r + " amount ");
    }

    public static void main(String[] args) {
        recharge(100);
    }
}

