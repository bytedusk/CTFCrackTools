package org.ctfcracktools;

import java.awt.*;

import com.formdev.flatlaf.FlatLightLaf;
import org.ctfcracktools.ui.MainUi;
import org.ctfcracktools.ui.TestFile;
//import org.ctfcracktools.ui.*;
import javax.swing.*;

/**
 * @author 0chencc
 */
public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        String title = "CTFCrackTools %s %s";
        JFrame f = new JFrame(String.format(title, Config.VERSION,Config.SLOGAN));
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        f.setBounds((int)(d.getWidth()-900)/2,(int)d.getWidth()/2-600,900,600);
        MainUi m = new MainUi();
        f.add(m);
//        TestFile testFile = new TestFile();
//        f.add(testFile);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
