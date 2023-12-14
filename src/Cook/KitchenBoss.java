package Cook;
import Cook.ICook;
import Logger.ILogger;

public class KitchenBoss
{
    private ILogger _logger;
    public KitchenBoss (ILogger logger)
    {
        _logger = logger;
    }
    public void  MakeDinner(ICook food)
    {
        _logger.log("Начало готовки");
        food.Cook();
        _logger.log("Окончание готовки");
    }

}
