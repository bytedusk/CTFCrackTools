/*
 * Created by JFormDesigner on Sat Jul 16 19:06:09 CST 2022
 */

package org.ctfcracktools.ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class TestFile extends JPanel {
    public TestFile() {
        initComponents();
    }

    private void chooseFileTextFieldMouseClicked(MouseEvent e) {
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int value = jFileChooser.showOpenDialog(null);
        if(value == JFileChooser.APPROVE_OPTION){
            chooseFileTextField.setText(jFileChooser.getSelectedFile().getAbsolutePath());
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        chooseFileLabel = new JLabel();
        chooseFileTextField = new JTextField();
        chooseFileHSpacer = new JPanel(null);

        //======== this ========
        setLayout(new GridBagLayout());
        ((GridBagLayout)getLayout()).columnWidths = new int[] {98, 300, 68, 0};
        ((GridBagLayout)getLayout()).rowHeights = new int[] {34, 0, 0, 0};
        ((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0, 1.0E-4};
        ((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 1.0, 1.0, 1.0E-4};

        //---- chooseFileLabel ----
        chooseFileLabel.setText("\u9009\u62e9\u6587\u4ef6");
        add(chooseFileLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- chooseFileTextField ----
        chooseFileTextField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chooseFileTextFieldMouseClicked(e);
            }
        });
        add(chooseFileTextField, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        add(chooseFileHSpacer, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel chooseFileLabel;
    private JTextField chooseFileTextField;
    private JPanel chooseFileHSpacer;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
