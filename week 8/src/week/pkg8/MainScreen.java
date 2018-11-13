package week.pkg8;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class MainScreen extends JFrame implements ActionListener {

    private JLabel lblCarID;
    private JLabel lblCarBrand;
    private JTextField txtCarID;
    private JTextField txtCarBrand;
    private JButton btnAdd;
    private JButton btnRemove;
    private GridBagConstraints constraints;
    private CarPark cp;

    public MainScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        initComponents();
        cp = new CarPark();

        constraints = new GridBagConstraints();

        layoutComponents();
    }

    public void initComponents() {
        lblCarID = new JLabel("Car Plate");
        lblCarBrand = new JLabel("Car Brand:");
        txtCarID = new JTextField();
        txtCarBrand = new JTextField();
        btnAdd = new JButton("Add car");
        btnAdd.addActionListener(this);
        btnRemove = new JButton("Remove car");
        btnRemove.addActionListener(this);
    }

    public void layoutComponents() {
        constraints.gridy = 0;
        constraints.gridx = 0;
//        constraints.gridwidth = 1;
        this.add(lblCarID, constraints);
        constraints.gridy = 1; // New row
        constraints.gridx = 0;
        this.add(lblCarBrand, constraints);
        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtCarID, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 1;
        constraints.gridx = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(txtCarBrand, constraints);
        constraints.fill = GridBagConstraints.NONE;
        constraints.gridy = 2;
        constraints.gridx = 0;
        this.add(btnAdd, constraints);
        constraints.gridy = 2;
        constraints.gridx = 1;
        this.add(btnRemove, constraints);
    }

    public void actionPerformed(ActionEvent ev) {
        if (ev.getSource().equals(btnAdd)) {
            int id = Integer.parseInt(txtCarID.getText());
            String name = txtCarBrand.getText();

            if (cp.addCar(new Car(id, name))) {
                JOptionPane.showMessageDialog(null, "Car has been added");
            } else {
                JOptionPane.showMessageDialog(null, "Car park is full");
            }
        }

    }

}
