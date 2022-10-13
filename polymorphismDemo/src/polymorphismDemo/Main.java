package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
//		EmailLogger emailLogger = new EmailLogger();
//		FileLogger fileLogger = new FileLogger();
//		DataBaseLogger dataBaseLogger = new DataBaseLogger();
//		
//		dataBaseLogger.Log("Hello world");
//		BaseLogger[] loggers = new BaseLogger[] {new ConsoleLogger(),new FileLogger(), new EmailLogger()}; 
//
//		for(BaseLogger logger:loggers) {logger.Log("Log Mesaji");};
	
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
		
	}  

}
