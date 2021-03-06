/*
 * Created by JFormDesigner on Fri Apr 06 11:30:42 CST 2018
 */

package wagner.stephanie.lizzie.gui;

import java.awt.event.*;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

/**
 * @author Cao Hu
 */
public class ChangeMoveDialog extends JDialog {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel labelMoveNumber;
    private JSpinner spinnerMoveNumber;
    private JLabel labelChangeTo;
    private JTextField textFieldCoordinates;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel panelNotes;
    private JLabel labelNotes;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private boolean userApproved;
    private int moveNumber;
    private String correctedMove;

    public ChangeMoveDialog(Frame owner) {
        super(owner);
        initComponents();
        initVariables();
    }

    public ChangeMoveDialog(Dialog owner) {
        super(owner);
        initComponents();
        initVariables();
    }

    public boolean isUserApproved() {
        return userApproved;
    }

    public int getMoveNumber() {
        return moveNumber;
    }

    public String getCorrectedMove() {
        return correctedMove;
    }

    private void okButtonActionPerformed(ActionEvent e) {
        userApproved = true;
        moveNumber = (int) spinnerMoveNumber.getValue();
        correctedMove = textFieldCoordinates.getText();
        dispose();
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        dispose();
    }

    private void initVariables() {
        userApproved = false;
        moveNumber = 0;
        correctedMove = "";
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        ResourceBundle bundle = ResourceBundle.getBundle("wagner.stephanie.lizzie.i18n.GuiBundle");
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        labelMoveNumber = new JLabel();
        spinnerMoveNumber = new JSpinner();
        labelChangeTo = new JLabel();
        textFieldCoordinates = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        panelNotes = new JPanel();
        labelNotes = new JLabel();

        //======== this ========
        setTitle(bundle.getString("ChangeMoveDialog.this.title"));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(Borders.createEmptyBorder("7dlu, 7dlu, 7dlu, 7dlu"));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new FormLayout(
                    "default, $lcgap, default",
                    "default, $lgap, default"));

                //---- labelMoveNumber ----
                labelMoveNumber.setText(bundle.getString("ChangeMoveDialog.labelMoveNumber.text"));
                contentPanel.add(labelMoveNumber, CC.xy(1, 1));

                //---- spinnerMoveNumber ----
                spinnerMoveNumber.setModel(new SpinnerNumberModel(1, 1, 999, 1));
                contentPanel.add(spinnerMoveNumber, CC.xy(3, 1));

                //---- labelChangeTo ----
                labelChangeTo.setText(bundle.getString("ChangeMoveDialog.labelChangeTo.text"));
                contentPanel.add(labelChangeTo, CC.xy(1, 3));
                contentPanel.add(textFieldCoordinates, CC.xy(3, 3));
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(Borders.createEmptyBorder("5dlu, 0dlu, 0dlu, 0dlu"));
                buttonBar.setLayout(new FormLayout(
                    "$glue, $button, $rgap, $button",
                    "pref"));

                //---- okButton ----
                okButton.setText(bundle.getString("ChangeMoveDialog.okButton.text"));
                okButton.addActionListener(e -> okButtonActionPerformed(e));
                buttonBar.add(okButton, CC.xy(2, 1));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("ChangeMoveDialog.cancelButton.text"));
                cancelButton.addActionListener(e -> cancelButtonActionPerformed(e));
                buttonBar.add(cancelButton, CC.xy(4, 1));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);

            //======== panelNotes ========
            {
                panelNotes.setLayout(new FlowLayout(FlowLayout.LEFT));

                //---- labelNotes ----
                labelNotes.setText(bundle.getString("ChangeMoveDialog.labelNotes.text"));
                panelNotes.add(labelNotes);
            }
            dialogPane.add(panelNotes, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
