package Core.Concretes;

import Core.Abstracts.LoggerService;
import JLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log("message");
    }
}
