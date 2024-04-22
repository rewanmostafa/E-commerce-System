package project1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JLabel customerIdLabel, nameLabel, addressLabel, productsLabel, totalPriceLabel;
    private JTextField customerIdField, nameField, addressField;
    private JComboBox<String> productsComboBox;
    private JButton addProductButton, calculatePriceButton, printOrderButton;
    private String[] selectedProducts = new String[3]; // Assuming a maximum of 3 products can be selected
    private double totalPrice = 0;

    public GUI() {
        setTitle("E-Commerce System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        customerIdLabel = new JLabel("Customer ID:");
        add(customerIdLabel);
        customerIdField = new JTextField();
        add(customerIdField);

        nameLabel = new JLabel("Name:");
        add(nameLabel);
        nameField = new JTextField();
        add(nameField);

        addressLabel = new JLabel("Address:");
        add(addressLabel);
        addressField = new JTextField();
        add(addressField);

        productsLabel = new JLabel("Select Product:");
        add(productsLabel);
        String[] products = {"T-shirt - $19.99", "Smartphone - $599.9", "OOP Book - $39.99"};
        productsComboBox = new JComboBox<>(products);
        add(productsComboBox);

        addProductButton = new JButton("Add Product");
        add(addProductButton);

        totalPriceLabel = new JLabel("Total Price: $0.0");
        add(totalPriceLabel);

        calculatePriceButton = new JButton("Calculate Total Price");
        add(calculatePriceButton);

        printOrderButton = new JButton("Print Order Info");
        add(printOrderButton);

        addProductButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < selectedProducts.length; i++) {
                    if (selectedProducts[i] == null) {
                        selectedProducts[i] = (String) productsComboBox.getSelectedItem();
                        JOptionPane.showMessageDialog(null, "Product added successfully!");
                        break;
                    }
                }
            }
        });

        calculatePriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalPrice = 0;
                for (String product : selectedProducts) {
                    if (product != null) {
                        if (product.contains("T-shirt")) {
                            totalPrice += 19.99;
                        } else if (product.contains("Smartphone")) {
                            totalPrice += 599.9;
                        } else if (product.contains("OOP Book")) {
                            totalPrice += 39.99;
                        }
                    }
                }
                totalPriceLabel.setText("Total Price: $" + totalPrice);
            }
        });

        printOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder orderInfo = new StringBuilder();
                orderInfo.append("Customer ID: ").append(customerIdField.getText()).append("\n");
                orderInfo.append("Name: ").append(nameField.getText()).append("\n");
                orderInfo.append("Address: ").append(addressField.getText()).append("\n");
                orderInfo.append("Selected Products:\n");
                for (String product : selectedProducts) {
                    if (product != null) {
                        orderInfo.append("- ").append(product).append("\n");
                    }
                }
                orderInfo.append("Total Price: $").append(totalPrice);
                JOptionPane.showMessageDialog(null, orderInfo.toString(), "Order Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI());
    }
}