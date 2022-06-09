package Chain_of_Responsibility_Pattern;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console Logger ❗ Error:: Logger "+message);
    }
}
