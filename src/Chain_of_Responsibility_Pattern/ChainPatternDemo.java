package Chain_of_Responsibility_Pattern;

import java.util.Scanner;


//Enter '1' : will show only normal logger result
//Enter '2' : will show warning logger with normal logger result.
//Enter '3' : Will show error logger with warning and normal logger result.
//Enter '4' : will show all logger result .


public class ChainPatternDemo {
    private static AbstractLogger getLogger(){
        AbstractLogger ConsoleLogger =
                new ConsoleLogger(AbstractLogger.Console);
        AbstractLogger warningLogger =
                new WarningLogger(AbstractLogger.Warning) ;
        AbstractLogger errorLogger =
                new ErrorLogger(AbstractLogger.Error);

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(ConsoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter a input :\n1:(normal)\n" +
                "2:(warning)\n" +
                "3:(Error)\n" +
                "4:(Show all)\n"
        );
        int a = input.nextInt() ;
        AbstractLogger loggerChain = getLogger();


        switch (a){
            case 1 : loggerChain.logMessage(AbstractLogger.Console,"This is normal Logger ✅"); break ;
            case 2 : loggerChain.logMessage(AbstractLogger.Warning,"This is Warning message ⚠"); break ;
            case 3 : loggerChain.logMessage(AbstractLogger.Error,"This is an Error Message ❌"); break ;
            case 4 : {
                loggerChain.logMessage(AbstractLogger.Console,"This is normal Logger ✅");
                loggerChain.logMessage(AbstractLogger.Warning,"This is Warning message ⚠");
                loggerChain.logMessage(AbstractLogger.Error,"This is an Error Message ❌");
                break ;
            }
            default:
                System.out.println("Invalid : type 1/2/3/4");
        }

    }
}
