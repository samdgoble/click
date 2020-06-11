import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Robot;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class actions {

    JFrame frame = new JFrame("dragonclicker69");
    JLabel textLabel = new JLabel("<html>dragonclicker<br><br>" + formatTime(System.currentTimeMillis()) + "<br><br> Program will start in 5 <br><br><br><br><br><br><br><br></html>",SwingConstants.CENTER);
    private Robot robot;
    private int max=44694;
    private int min=56246;
    private int maxBetweenClicks=240;
    private int minBetweenClicks=69;

    public actions() {
        try {
            robot = new Robot();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public int antiban1Check(int clickCounter, int finalClicks) {
        double antiban1Probability=Math.floor((Math.random()*4));
        return (int) antiban1Probability;
    }

    public int antiban2Check(int clickCounter, int finalClicks) {
        double antiban2Probability=Math.floor((Math.random()*10));
        return (int) antiban2Probability;
    }

    public int antiban3Check(int clickCounter, int finalClicks) {
        double antiban3Probability=Math.floor((Math.random()*10));
        return (int) antiban3Probability;
    }

    public int antiban4Check(int clickCounter, int finalClicks) {
        double antiban4Probability=Math.floor((Math.random()*15));
        return (int) antiban4Probability;
    }

    public void createWindow() {
        //Create and set up the window.
        textLabel.setPreferredSize(new Dimension(250, 250));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        try {
            Thread.sleep(1000);
            textLabel.setText("<html>dragonclicker<br><br>" + formatTime(System.currentTimeMillis()) + "<br><br> Program will start in 4 <br><br><br><br><br><br><br><br></html>");
            Thread.sleep(1000);

            textLabel.setText("<html>dragonclicker<br><br>" + formatTime(System.currentTimeMillis()) + "<br><br> Program will start in 3 <br><br><br><br><br><br><br><br></html>");
            Thread.sleep(1000);

            textLabel.setText("<html>dragonclicker<br><br>" + formatTime(System.currentTimeMillis()) + "<br><br> Program will start in 2 <br><br><br><br><br><br><br><br></html>");
            Thread.sleep(1000);

            textLabel.setText("<html>dragonclicker<br><br>" + formatTime(System.currentTimeMillis()) + "<br><br> Program will start in 1 <br><br><br><br><br><br><br><br></html>");
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void updateWindow(int clickCounter,int finalClicks,int delayCycle,int delayDoubleClick,int ab1, int ab2, int ab3, int ab4) {
        textLabel.setText("<html>dragonclicker<br><br>" + formatTime(System.currentTimeMillis()) + "<br><br> Clicks: " + clickCounter + " / " + finalClicks + "<br><br> Delay Cycle: " + delayCycle + "<br><br> Delay Double Click: " + delayDoubleClick + "<br><br> Antiban Events <br><br> Ab1: " + ab1 + " | Ab2: " + ab2 + " | Ab3: " + ab3 + " | Ab4: " + ab4 +"</html>");

    }

    public int cycleDelay() {
        double delayCycle = Math.floor((Math.random() * (max - min)) + (min));
        return (int) delayCycle;
    }

    public void doubleClickMouse(int button,int delayCycle,int delayDoubleClick) {
        try {
            robot.delay(delayCycle);
            robot.mousePress(button);
            robot.mouseRelease(button);
            robot.delay(delayDoubleClick);
            robot.mousePress(button);
            robot.mouseRelease(button);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int doubleClickMouseDelay() {
        double delayDoubleClick = Math.floor((Math.random() * (maxBetweenClicks - minBetweenClicks)) + (minBetweenClicks));
        return (int) delayDoubleClick;
    }

    public final String formatTime(final long time) {
        long s = time / 1000, m = s / 60, h = m / 60;
        s %= 60;
        m %= 60;
        h %= 24;
        return String.format("%02d:%02d:%02d", h, m, s);
    }

}