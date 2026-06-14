package Problems.DesignLogger;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }


    public void log(int logLevel, String message) {
        if(logLevel==ERROR){
            System.out.println("Error log"+message);
        }else{
            super.log(logLevel, message);
        }
    }
}
