package projekte.Builder;

import projekte.util.Logger;

public class MainBase {
    public MainBase() {
    }

    public void start() {
        Logger.log("system","Initiating builder...");
        init();
    }

    public void init() {
        Builder builder = new Builder();
        Logger.log("system","Initiation complete.");
        builder.create(8, 2);
    }
}
