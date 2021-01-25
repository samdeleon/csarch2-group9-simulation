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

    private void button3ActionPerformed(ActionEvent e) {
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Samantha de Leon
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
        OutputAll = new JPanel();
        btnGenerateFile2 = new JButton();
        btnBacktoMenu2 = new JButton();
        textareaOutput2 = new JScrollPane();

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
            card_container.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,card_container. getBorder( )) ); card_container. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            card_container.setLayout(new CardLayout());

            //======== InputMenu ========
            {
                InputMenu.setForeground(Color.white);
                InputMenu.setBackground(new Color(17, 99, 65));

                //======== panelInside ========
                {
                    panelInside.setBackground(new Color(0, 0, 0, 175));
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
                    btnEnter.addActionListener(e -> button3ActionPerformed(e));

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

                    //---- radiobtnAll ----
                    radiobtnAll.setText("Show All");
                    radiobtnAll.setForeground(Color.white);

                    GroupLayout panelInsideLayout = new GroupLayout(panelInside);
                    panelInside.setLayout(panelInsideLayout);
                    panelInsideLayout.setHorizontalGroup(
                        panelInsideLayout.createParallelGroup()
                            .addGroup(panelInsideLayout.createSequentialGroup()
                                .addGroup(panelInsideLayout.createParallelGroup()
                                    .addGroup(panelInsideLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(panelInsideLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelDividend, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelDivisor, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelInsideLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(inputDividend)
                                            .addComponent(inputDivisor, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panelInsideLayout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addGroup(panelInsideLayout.createParallelGroup()
                                            .addComponent(radiobtnAll)
                                            .addComponent(radiobtnSteps))))
                                .addContainerGap(18, Short.MAX_VALUE))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelInsideLayout.createSequentialGroup()
                                .addGap(0, 157, Short.MAX_VALUE)
                                .addComponent(btnEnter, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156))
                            .addGroup(GroupLayout.Alignment.TRAILING, panelInsideLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelGroupNames, GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    panelInsideLayout.setVerticalGroup(
                        panelInsideLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, panelInsideLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(panelInsideLayout.createParallelGroup()
                                    .addComponent(labelDividend, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputDividend))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelInsideLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDivisor, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputDivisor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
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
                labelAppName.setText("Restorative Unsigned Division Simulator");
                labelAppName.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
                labelAppName.setForeground(Color.white);
                labelAppName.setHorizontalAlignment(SwingConstants.CENTER);

                GroupLayout InputMenuLayout = new GroupLayout(InputMenu);
                InputMenu.setLayout(InputMenuLayout);
                InputMenuLayout.setHorizontalGroup(
                    InputMenuLayout.createParallelGroup()
                        .addGroup(InputMenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelAppName, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                            .addContainerGap())
                        .addGroup(InputMenuLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(panelInside, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(28, Short.MAX_VALUE))
                );
                InputMenuLayout.setVerticalGroup(
                    InputMenuLayout.createParallelGroup()
                        .addGroup(InputMenuLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(labelAppName, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelInside, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }
            card_container.add(InputMenu, "card1");

            //======== OutputSteps ========
            {
                OutputSteps.setBackground(new Color(17, 99, 65));

                //---- btnGenerateFile ----
                btnGenerateFile.setText("Generate File");
                btnGenerateFile.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnGenerateFile.setBackground(new Color(17, 99, 65));
                btnGenerateFile.addActionListener(e -> button3ActionPerformed(e));

                //---- btnBacktoMenu ----
                btnBacktoMenu.setText("Back to Menu");
                btnBacktoMenu.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnBacktoMenu.setBackground(new Color(17, 99, 65));
                btnBacktoMenu.addActionListener(e -> button3ActionPerformed(e));

                GroupLayout OutputStepsLayout = new GroupLayout(OutputSteps);
                OutputSteps.setLayout(OutputStepsLayout);
                OutputStepsLayout.setHorizontalGroup(
                    OutputStepsLayout.createParallelGroup()
                        .addGroup(OutputStepsLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(textareaOutput, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(18, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, OutputStepsLayout.createSequentialGroup()
                            .addContainerGap(102, Short.MAX_VALUE)
                            .addComponent(btnGenerateFile, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(btnBacktoMenu, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90))
                );
                OutputStepsLayout.setVerticalGroup(
                    OutputStepsLayout.createParallelGroup()
                        .addGroup(OutputStepsLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(textareaOutput, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(OutputStepsLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGenerateFile, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBacktoMenu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(14, Short.MAX_VALUE))
                );
            }
            card_container.add(OutputSteps, "card2");

            //======== OutputAll ========
            {
                OutputAll.setBackground(new Color(17, 99, 65));

                //---- btnGenerateFile2 ----
                btnGenerateFile2.setText("Generate File");
                btnGenerateFile2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnGenerateFile2.setBackground(new Color(17, 99, 65));
                btnGenerateFile2.addActionListener(e -> button3ActionPerformed(e));

                //---- btnBacktoMenu2 ----
                btnBacktoMenu2.setText("Back to Menu");
                btnBacktoMenu2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 13));
                btnBacktoMenu2.setBackground(new Color(17, 99, 65));
                btnBacktoMenu2.addActionListener(e -> button3ActionPerformed(e));

                GroupLayout OutputAllLayout = new GroupLayout(OutputAll);
                OutputAll.setLayout(OutputAllLayout);
                OutputAllLayout.setHorizontalGroup(
                    OutputAllLayout.createParallelGroup()
                        .addGroup(OutputAllLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(textareaOutput2, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(18, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, OutputAllLayout.createSequentialGroup()
                            .addContainerGap(102, Short.MAX_VALUE)
                            .addComponent(btnGenerateFile2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(btnBacktoMenu2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90))
                );
                OutputAllLayout.setVerticalGroup(
                    OutputAllLayout.createParallelGroup()
                        .addGroup(OutputAllLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(textareaOutput2, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(OutputAllLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGenerateFile2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBacktoMenu2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(14, Short.MAX_VALUE))
                );
            }
            card_container.add(OutputAll, "card3");
        }
        contentPane.add(card_container, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Samantha de Leon
    private JPanel card_container;
    private JPanel InputMenu;
    private JPanel panelInside;
    public JTextField inputDividend;
    private JLabel labelDividend;
    public JButton btnEnter;
    private JLabel labelGroupNames;
    public JTextField inputDivisor;
    private JLabel labelDivisor;
    private JRadioButton radiobtnSteps;
    private JRadioButton radiobtnAll;
    private JLabel labelAppName;
    private JPanel OutputSteps;
    private JButton btnGenerateFile;
    private JButton btnBacktoMenu;
    private JScrollPane textareaOutput;
    private JPanel OutputAll;
    private JButton btnGenerateFile2;
    private JButton btnBacktoMenu2;
    private JScrollPane textareaOutput2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}



