package SingletonPattern;

public class Logger {
	private Logger() {
		System.out.println("Instance created");
	}
	private static Logger Instance;
	public static Logger getInstance() {
		if(Instance == null) {
			Instance = new Logger();
		}
		return Instance;
	}
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
