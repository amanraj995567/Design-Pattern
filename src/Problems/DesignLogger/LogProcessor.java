package Problems.DesignLogger;

public abstract class LogProcessor {

    public static  int INFO = 1;
    public static  int DEBUG = 2;
    public static  int ERROR = 3;

    LogProcessor nextLoggerProcessor;

    LogProcessor(LogProcessor logProcessor){
        this.nextLoggerProcessor = logProcessor;
    }

    public void log(int logLevel, String message){
        if(nextLoggerProcessor!=null){
            nextLoggerProcessor.log(logLevel, message);
        }
        else if(nextLoggerProcessor==null){
            System.out.println("Returning error");
        }
    }


}
