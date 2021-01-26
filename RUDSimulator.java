import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.plaf.*;
/*
 * Created by JFormDesigner on Sat Jan 23 19:29:48 PHT 2021
 */



/**
 * @author Samantha de Leon
 */
public class RUDSimulator extends JFrame {
    public RUDSimulator() {
        initComponents();
    }

    public void showErrorMessage(String message, String title)
    {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE);
    }

    private void button4ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButton1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jTextField1ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void jButton2ActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void file_buttonActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    public static void main (String[] args) throws Exception{
        // main here

    }

    private void button3ActionPerformed(ActionEvent e) {
        CardLayout card = (CardLayout)card_container.getLayout();
        card.show(card_container, "card1");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Johann Gonzales
        card_container = new JPanel();
        InputMenu = new JPanel();
        panelInside = new JPanel();
        inputDividend = new JTextField();
        labelDividend = new JLabel();
        btnEnter = new JButton();
        labelGroupNames = new JLabel();
        inputDivisor = new JTextField();
        labelDivisor = new JLabel();
        radiobtnSteps = new JRadioButton();
        radiobtnAll = new JRadioButton();
        labelAppName = new JLabel();
        OutputSteps = new JPanel();
        btnGenerateFile = new JButton();
        btnBacktoMenu = new JButton();
        textareaOutput = new JScrollPane();
        btnNextStep = new JButton();
        OutputAll = new JPanel();
        btnGenerateFile2 = new JButton();
        btnBacktoMenu2 = new JButton();
        textareaOutput2 = new JScrollPane();
        btngroup = new ButtonGroup();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restorative Unsigned Division Simulator");
        setResizable(false);
        setVisible(true);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== card_container ========
        {
            card_container.setBackground(new Color(17, 99, 65));
            card_container.setForeground(Color.white);
            card_container.setPreferredSize(null);
            card_container.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder(
            0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder
            . BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color.
            red) ,card_container. getBorder( )) ); card_container. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .
            beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            card_container.setLayout(new CardLayout());

            //======== InputMenu ========
            {
                InputMenu.setForeground(Color.white);
                InputMenu.setBackground(new Color(17, 99, 65));

                //======== panelInside ========
                {
                    panelInside.setBackground(new Color(68, 68, 68));
                    panelInside.setForeground(Color.white);

                    //---- labelDividend ----
                    labelDividend.setText("Dividend");
                    labelDividend.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                    labelDividend.setForeground(Color.white);

                    //---- btnEnter ----
                    btnEnter.setText("Enter");
                    btnEnter.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                    btnEnter.setForeground(Color.white);
                    btnEnter.setBackground(new Color(17, 99, 65));

                    //---- labelGroupNames ----
                    labelGroupNames.setText("By S12 Group 9 - DE LEON, CHUA CHIACO, GONZALES, MARASIGAN");
                    labelGroupNames.setForeground(new Color(0, 255, 137));
                    labelGroupNames.setHorizontalAlignment(SwingConstants.CENTER);
                    labelGroupNames.setFont(new Font("Lucida Grande", Font.PLAIN, 11));

                    //---- labelDivisor ----
                    labelDivisor.setText("Divisor");
                    labelDivisor.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
                    labelDivisor.setForeground(Color.white);

                    //---- radiobtnSteps ----
                    radiobtnSteps.setText("Show Step by Step");
                    radiobtnSteps.setForeground(Color.white);
                    radiobtnSteps.setBackground(new Color(68, 68, 68));

                    //---- radiobtnAll ----
                    radiobtnAll.setText("Show All");
                    radiobtnAll.setForeground(Color.white);
                    radiobtnAll.setBackground(new Color(68, 68, 68));

                    GroupLayout panelInsideLayout = new GroupLayout(panelInside);
                    panelInside.setLayout(panelInsideLayout);
                    panelInsideLayout.setHorizontalGroup(
                        panelInsideLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelInsideLayout.createSequentialGroup()
                                .addGap(0, 169, Short.MAX_VALUE)
                                .addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelInsideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelGroupNames, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(panelInsideLayout.createSequentialGroup()
                                .addGroup(panelInsideLayout.createParallelGroup()
                                    .addGroup(panelInsideLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(panelInsideLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelDividend, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelDivisor, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelInsideLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputDividend, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputDivisor)))
                                    .addGroup(panelInsideLayout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addGroup(panelInsideLayout.createParallelGroup()
                                            .addComponent(radiobtnAll)
                                            .addComponent(radiobtnSteps))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    panelInsideLayout.setVerticalGroup(
                        panelInsideLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelInsideLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(panelInsideLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelDividend, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputDividend, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelInsideLayout.createParallelGroup()
                                    .addGroup(panelInsideLayout.createSequentialGroup()
                                        .addComponent(labelDivisor, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addGroup(GroupLayout.Alignment.TRAILING, panelInsideLayout.createSequentialGroup()
                                        .addComponent(inputDivisor, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(radiobtnSteps)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiobtnAll)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelGroupNames, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
                    );
                }

                //---- labelAppName ----
                labelAppName.setText("Restoring Unsigned Division Simulator");
                labelAppName.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
                labelAppName.setForeground(Color.white);
                labelAppName.setHorizontalAlignment(SwingConstants.CENTER);

                GroupLayout InputMenuLayout = new GroupLayout(InputMenu);
                InputMenu.setLayout(InputMenuLayout);
                InputMenuLayout.setHorizontalGroup(
                    InputMenuLayout.createParallelGroup()
                        .addGroup(InputMenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelAppName, GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, InputMenuLayout.createSequentialGroup()
                            .addContainerGap(88, Short.MAX_VALUE)
                            .addComponent(panelInside, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67))
                );
                InputMenuLayout.setVerticalGroup(
                    InputMenuLayout.createParallelGroup()
                        .addGroup(InputMenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelAppName, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelInside, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(120, Short.MAX_VALUE))
                );
            }
            card_container.add(InputMenu, "card1");

            //======== OutputSteps ========
            {
                OutputSteps.setBackground(new Color(17, 99, 65));

                //---- btnGenerateFile ----
                btnGenerateFile.setText("Generate File");
                btnGenerateFile.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnGenerateFile.setBackground(Color.white);
                btnGenerateFile.addActionListener(e -> button3ActionPerformed(e));

                //---- btnBacktoMenu ----
                btnBacktoMenu.setText("Back to Menu");
                btnBacktoMenu.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnBacktoMenu.setBackground(Color.white);
                btnBacktoMenu.addActionListener(e -> button3ActionPerformed(e));

                //---- btnNextStep ----
                btnNextStep.setText("Next Step");
                btnNextStep.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnNextStep.setBackground(Color.white);
                btnNextStep.addActionListener(e -> button4ActionPerformed(e));

                GroupLayout OutputStepsLayout = new GroupLayout(OutputSteps);
                OutputSteps.setLayout(OutputStepsLayout);
                OutputStepsLayout.setHorizontalGroup(
                    OutputStepsLayout.createParallelGroup()
                        .addGroup(OutputStepsLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(OutputStepsLayout.createParallelGroup()
                                .addGroup(OutputStepsLayout.createSequentialGroup()
                                    .addComponent(btnGenerateFile, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBacktoMenu, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                    .addComponent(btnNextStep, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
                                .addComponent(textareaOutput, GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
                            .addContainerGap())
                );
                OutputStepsLayout.setVerticalGroup(
                    OutputStepsLayout.createParallelGroup()
                        .addGroup(OutputStepsLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(textareaOutput, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(OutputStepsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGenerateFile, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBacktoMenu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNextStep, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addGap(93, 93, 93))
                );
            }
            card_container.add(OutputSteps, "card2");

            //======== OutputAll ========
            {
                OutputAll.setBackground(new Color(17, 99, 65));

                //---- btnGenerateFile2 ----
                btnGenerateFile2.setText("Generate File");
                btnGenerateFile2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnGenerateFile2.setBackground(Color.white);
                btnGenerateFile2.addActionListener(e -> button3ActionPerformed(e));

                //---- btnBacktoMenu2 ----
                btnBacktoMenu2.setText("Back to Menu");
                btnBacktoMenu2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnBacktoMenu2.setBackground(Color.white);
                btnBacktoMenu2.addActionListener(e -> button3ActionPerformed(e));

                GroupLayout OutputAllLayout = new GroupLayout(OutputAll);
                OutputAll.setLayout(OutputAllLayout);
                OutputAllLayout.setHorizontalGroup(
                    OutputAllLayout.createParallelGroup()
                        .addGroup(OutputAllLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(OutputAllLayout.createParallelGroup()
                                .addGroup(OutputAllLayout.createSequentialGroup()
                                    .addComponent(btnGenerateFile2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBacktoMenu2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 284, Short.MAX_VALUE))
                                .addComponent(textareaOutput2, GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
                            .addContainerGap())
                );
                OutputAllLayout.setVerticalGroup(
                    OutputAllLayout.createParallelGroup()
                        .addGroup(OutputAllLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(textareaOutput2, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(OutputAllLayout.createParallelGroup()
                                .addComponent(btnBacktoMenu2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGenerateFile2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(93, Short.MAX_VALUE))
                );
            }
            card_container.add(OutputAll, "card3");
        }
        contentPane.add(card_container, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());

        //---- btngroup ----
        btngroup.add(radiobtnSteps);
        btngroup.add(radiobtnAll);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Johann Gonzales
    public JPanel card_container;
    public JPanel InputMenu;
    public JPanel panelInside;
    public JTextField inputDividend;
    private JLabel labelDividend;
    public JButton btnEnter;
    private JLabel labelGroupNames;
    public JTextField inputDivisor;
    private JLabel labelDivisor;
    public JRadioButton radiobtnSteps;
    public JRadioButton radiobtnAll;
    private JLabel labelAppName;
    public JPanel OutputSteps;
    public JButton btnGenerateFile;
    public JButton btnBacktoMenu;
    public JScrollPane textareaOutput;
    public JButton btnNextStep;
    public JPanel OutputAll;
    public JButton btnGenerateFile2;
    public JButton btnBacktoMenu2;
    public JScrollPane textareaOutput2;
    public ButtonGroup btngroup;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}



