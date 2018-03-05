package chapter6.anonymousinnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AnonymousinnerClassTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock();
        talkingClock.start(1000,true);

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}

class TalkingClock
{
    public void start(int interval, boolean beep) {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer t = new Timer(interval, listener);
        t.start();
    }
}

