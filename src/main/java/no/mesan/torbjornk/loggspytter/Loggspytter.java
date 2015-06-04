package no.mesan.torbjornk.loggspytter;

import java.util.Random;

import org.apache.log4j.Logger;

/**
 * Loggspytter som spytter logger!
 *
 * @author Torbjorn S. Knutsen
 */
public class Loggspytter {
    private static final Logger LOGGER = Logger.getLogger(Loggspytter.class);

    public static void main(final String... args) {
        new Loggspytter().spytt();
    }

    private void spytt() {
        while (true) {
            final int rnd = new Random().nextInt(5);
            final int fangenummer = new Random().nextInt(1000);
            switch (rnd) {
            case 0:
                LOGGER.info("Noe gøy skjedde, fangenummer=" + fangenummer);
                break;
            case 1:
                LOGGER.info("Noe kjedelig skjedde, fangenummer=" + fangenummer);
                break;
            case 2:
                LOGGER.warn("Noe skummelt skjedde, fangenummer=" + fangenummer);
                break;
            case 3:
                LOGGER.error("Noe grusomt skjedde, fangenummer=" + fangenummer);
                break;
            case 4:
                LOGGER.info("Ingenting skjedde, fangenummer=" + fangenummer);
                break;
            default:
                throw new RuntimeException("omg!");
            }

            try {
                Thread.sleep(100);
            } catch (final InterruptedException e) {
                //Svelg!
            }
        }

    }
}
