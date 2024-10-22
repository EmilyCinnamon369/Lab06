import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class POFframe extends JFrame {

    public POFframe() {

        setTitle("Pizza Order Form");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Font font1 = new Font("Times New Roman", Font.BOLD, 56);
        Font font2 = new Font("Times New Roman", Font.PLAIN, 18);
        Font font3 = new Font("Times New Roman", Font.PLAIN, 14);

        JLabel jabel = new JLabel("Your Order", JLabel.LEFT);
        jabel.setBounds(50, 50, 600, 100);
        jabel.setFont(font1);

        JTextArea jerria = new JTextArea();
        jerria.setFont(font3);

        JScrollPane jane = new JScrollPane(jerria);
        jane.setBounds(40, 200, 600, 100);

        // Radio Buttons for Crust
        JRadioButton thinCrust = new JRadioButton("Thin Crust");
        thinCrust.setBounds(40, 325, 200, 25);
        thinCrust.setFont(font2);

        JRadioButton regCrust = new JRadioButton("Regular Crust");
        regCrust.setBounds(40, 350, 200, 25);
        regCrust.setFont(font2);

        JRadioButton deepCrust = new JRadioButton("Deep-Dish Crust");
        deepCrust.setBounds(40, 375, 200, 25);
        deepCrust.setFont(font2);

        // Radio Button options
        ButtonGroup bg = new ButtonGroup();
        bg.add(thinCrust);
        bg.add(regCrust);
        bg.add(deepCrust);

        // Combobox button and options
        String sizes[] = {"Small", "Medium", "Large", "Super"};
        JComboBox cbox = new JComboBox(sizes);
        cbox.setBounds(250, 325, 100, 25);
        cbox.setFont(font2);

        // Checkbox Options
        JCheckBox chPep = new JCheckBox("Pepperoni");
        chPep.setBounds(400, 325, 200, 25);
        chPep.setFont(font2);

        JCheckBox chMush = new JCheckBox("Mushrooms");
        chMush.setBounds(400, 350, 200, 25);
        chMush.setFont(font2);

        JCheckBox chOlive = new JCheckBox("Olives");
        chOlive.setBounds(400, 375, 200, 25);
        chOlive.setFont(font2);

        JCheckBox chBell = new JCheckBox("Bell Pepper");
        chBell.setBounds(400, 400, 200, 25);
        chBell.setFont(font2);

        JCheckBox chOnion = new JCheckBox("Onion");
        chOnion.setBounds(400, 425, 200, 25);
        chOnion.setFont(font2);

        JCheckBox chSpinach = new JCheckBox("Spinach");
        chSpinach.setBounds(400, 450, 200, 25);
        chSpinach.setFont(font2);

        //order button
        JButton order = new JButton("Order");
        order.setBounds(435, 515, 200, 25);
        order.setFont(font2);
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int total = 0;
                jerria.setText("");

                // size listeners
                if (cbox.getSelectedItem() == "Small"){
                    jerria.append("Size:   Small - $8.00\n");
                    total+=8;}
                if (cbox.getSelectedItem() == "Medium"){
                    jerria.append("Size:   Medium - $12.00\n");
                    total+=12;}
                if (cbox.getSelectedItem() == "Large"){
                    jerria.append("Size:   Large - $16.00\n");
                    total+=16;}
                if (cbox.getSelectedItem() == "Super"){
                    jerria.append("Size:   Super - $20.00\n");
                    total+=20;}

                // Crust Listeners
                if (thinCrust.isSelected()){
                    jerria.append("Crust:   Thin Crust\n");}
                if (regCrust.isSelected()){
                    jerria.append("Crust:   Regular Crust\n");}
                if (deepCrust.isSelected()){
                    jerria.append("Crust:   Deep-Dish Crust\n");}

                // Topping listeners
                if (chPep.isSelected()){
                    jerria.append("Pepperoni - $1.00\n");
                    total+=1;}
                if (chMush.isSelected()){
                    jerria.append("Mushrooms - $1.00\n");
                    total+=1;}
                if (chOlive.isSelected()){
                    jerria.append("Olives - $1.00\n");
                    total+=1;}
                if (chOnion.isSelected()){
                    jerria.append("Onion - $1.00\n");
                    total+=1;}
                if (chBell.isSelected()){
                    jerria.append("Bell Peppers - $1.00\n");
                    total+=1;}
                if (chSpinach.isSelected()){
                    jerria.append("Spinach - $1.00\n");
                    total+=1;}

                double t = total;
                double tax = t*0.07;
                jerria.append("\nSubtotal: $"+t+"\nTax: $"+tax+"\n\nTotal: $"+(t+tax));

            }
        });

        //quit button
        JButton quit_butt = new JButton("Quit");
        quit_butt.setBounds(40, 515, 200, 25);
        quit_butt.setFont(font2);
        quit_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(jabel);
        add(jane);
        add(thinCrust);
        add(regCrust);
        add(deepCrust);
        add(cbox);
        add(chPep);
        add(chMush);
        add(chOlive);
        add(chBell);
        add(chOnion);
        add(chSpinach);
        add(quit_butt);
        add(order);

        setVisible(true);

    }}
