package pkg;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        final Level VIOLATION = Level.forName("VIOLATION", 150); // szint a karantén szabályok megsértésének naplózásához
        final Level REQUEST = Level.forName("REQUEST", 350); // szint kérelmek naplózásához
        int n = Integer.parseInt(args[0]);
        System.out.println(n);
        for (int i = 1; i <= n; i++) {
            logger.log(VIOLATION, "Zöld erdőben jártam,");
            logger.info("Kék ibolyát láttam,");
            logger.warn("El akart hervadni,");
            logger.log(REQUEST, "Szabad-e locsolni?");
            logger.fatal("Locsolók érkeznek a házhoz!");
            try {
                Thread.sleep(10); // egy kis késleltetés
            } catch (InterruptedException e) {}
        }
    }
}
