package state_Pattern;

public class Vibration implements MobileAlertState{
    @Override
    public void alert(AlertStateContext ASC) {
        System.out.println("vibration mode on...");
    }
}
