public class Logger {
    private static Logger logger = null;
    private int currentLine = 0;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String message) {
        currentLine++;
        System.out.println(currentLine + "::" + message);
    }
}
