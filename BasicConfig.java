import org.Log4j.Logger;
class BasicConfig
{

	public static void main(String []args)


	{
   Logger l=Logger.getLogger("BasicConfig.class");
		BasicConfigurator.Configure();

		logger.debug("Sample of debug message");
		logger.info("Sample of info message");
		logger.warn("Sample of warn message");
		logger.error("Sample of error message");
		logger.fatal("Sample of fatal message");
	}
}

