package Logger;

import Logger.ILogger;

public class ConsoleLogger implements ILogger
{
    public void log(String massage)
    {
        System.out.println(massage);
    }
}
