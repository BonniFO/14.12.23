import Cook.ChickenCook;
import Cook.KitchenBoss;
import Cook.PotatoCook;
import Logger.ConsoleLogger;
import Logger.ServerLogger;

public class Main
{
    public static void main(String[] args)
    {
        KitchenBoss boss = new KitchenBoss(new ConsoleLogger());
        boss.MakeDinner(new ChickenCook());
        boss.MakeDinner(new PotatoCook());

        String[] strs = new String[] {"flower", "flow", "flight"};
        var prefix = LongestPrefix(strs);
        var expectedResult = "fl";
        System.out.println(LongestPrefix(new String[]{"flower", "flow", "flight"}));
    }
    public static String LongestPrefix(String[] strs)
    {
        StringBuilder LongestPrifix = new StringBuilder();

        if (strs == null || strs.length == 0)
        {
            return LongestPrifix.toString();
        }
        int minLength = strs[0].length();

        for (int i = 1; i < strs.length; i++)
        {
            minLength = Math.min(minLength, strs[i].length());
        }
        for (int i = 0; i < minLength; i++)
        {
            char current = strs[0].charAt(i);

            for (String str : strs)
            {
                if (str.charAt(i) != current)
                {
                    return LongestPrifix.toString();
                }
            }
            LongestPrifix.append(current);
        }
        return LongestPrifix.toString();
    }
}