package Problems.DesignLogger;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    public void log(int logLevel, String message) {

        if(logLevel==DEBUG){
            System.out.println("Debuh log" + message);
        }
        else{
            super.log(logLevel, message);
        }

    }
}
