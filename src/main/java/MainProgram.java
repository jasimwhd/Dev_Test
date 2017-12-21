import org.apache.log4j.Logger;

public class MainProgram {
    final static Logger logger = Logger.getLogger(MainProgram.class);
    public static void main(String[] args) {
        String db = args[0];
        String table = args[1];
        String timestamp = args[2];
        String apikey = args[3];
        if(logger.isInfoEnabled()){
            logger.info("Calling arguments db, table, timestamp apikey : " + db +
                    " "+ table
            + " "+ timestamp
            + " " + apikey);
        }


    }
}
