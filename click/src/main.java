import java.awt.event.InputEvent;

public class main {

    public static void main(String[] args) {

        actions clicker = new actions();

        int finalClicks = 500;
        int clickCounter=0;
        int ab1=0;
        int ab2=0;
        int ab3=0;
        int ab4=0;

        clicker.createWindow();

        for (int i = 0; i < finalClicks; i++) {
            int antiban1=clicker.antiban1Check(clickCounter,finalClicks);
            int antiban2=clicker.antiban2Check(clickCounter,finalClicks);
            int antiban3=clicker.antiban3Check(clickCounter,finalClicks);
            int antiban4=clicker.antiban4Check(clickCounter,finalClicks);
            int delayCycle=clicker.cycleDelay();
            int delayDoubleClick=clicker.doubleClickMouseDelay();
            if (i==0) {
                delayCycle=0;
            }
            if (antiban1==0) {
                delayCycle=delayCycle-(delayCycle/4);
                ab1++;
            }
            if (antiban2==0) {
                delayDoubleClick=delayDoubleClick*4;
                ab2++;
            }
            if (antiban3==0) {
                delayCycle=delayCycle-(delayCycle/2);
                ab3++;
            }
            if (antiban4==0) {
                delayDoubleClick=delayDoubleClick*20;
                ab4++;
            }
            clicker.doubleClickMouse(InputEvent.BUTTON1_MASK, delayCycle, delayDoubleClick);
            clickCounter++;
            clicker.updateWindow(clickCounter,finalClicks,delayCycle,delayDoubleClick,ab1,ab2,ab3,ab4);
        }
    }
}