
import java.util.logging.Level;
import java.util.logging.Logger;



public class JC436 {
    public static void main(String[] args) {
        logging();
    }
    public static void logging() {
        Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");
        LOGGER.log(Level.INFO, "Все хорошо");
        LOGGER.warning("Произошла ошибка");
    }

}
