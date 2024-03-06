package projekte.Builder;

import projekte.util.Logger;

public class MainBase {
    public static Logger logger;

    public MainBase() {
        logger = new Logger();
    }

    public void start() {
        logger.log("system","Initiating builder...");
    }

    public void init() {
        Builder builder = new Builder();
        logger.log("system","Initiation complete.");
        builder.create(4, 2);
    }
}
