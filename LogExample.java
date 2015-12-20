import org.apache.log4j.Logger;
public class LogExample
{
static final Logger logger=Logger.getLogger(LogExample.class);
  public static void main(String args[])
  {
    logger.debug("this is a debug message");
    logger.info("this is a info message");
    logger.warn("this is a warn message");
    logger.error("this is a error message");
    logger.fatal("this is a fatal message");
  }
}