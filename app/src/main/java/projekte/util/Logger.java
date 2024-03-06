package projekte.util;

public class Logger {
    public static void log(String message) {
        log ("",message);
    }

    public static void log(String type, String message) {
        String präfix="";
        switch (type.toLowerCase()) {
            case "error":
                präfix = "[ERROR] ";
                break;
            case "system":
                präfix =  "[SYSTEM] ";
                break;
            default:
                break;
        }
        System.out.println(präfix+message+" ("+getCallerClassName()+")");
    }

    public static String getCallerClassName() { 
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        for (int i=1; i<stElements.length; i++) {
            StackTraceElement ste = stElements[i];
            if (!ste.getClassName().equals(Logger.class.getName()) && ste.getClassName().indexOf("java.lang.Thread")!=0) {
                return ste.getClassName();
            }
        }
        return null;
     }
}
