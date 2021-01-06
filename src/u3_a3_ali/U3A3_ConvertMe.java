/*
 * Name: Anjing Li 
 * Date: August 1, 2019.
 * Title: U3A3_ConvertMe
 * Purpose: Use methods to convert between different units
 */

package u3_a3_ali;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class U3A3_ConvertMe extends JFrame implements ActionListener {
    
    // State components necessary
    JLabel lblTitle;
    JLabel lblInchtoCm; 
    JLabel lblFeettoCm;
    JLabel lblYardtoMetre; 
    JLabel lblMiletoKm;      
    JLabel lblCmtoInch;
    JLabel lblCmtoFeet;
    JLabel lblMetretoYard;
    JLabel lblKmtoMile;
    JLabel lblConversionChoice;
    JTextField txtConversionChoice = new JTextField();  // Avoids NullPointerException in ActionListener
    JLabel lblValue;
    JTextField txtValue = new JTextField();  // Avoids NullPointerException in ActionListener
    JButton btnConvert;
    JLabel lblOutput = new JLabel();  // Avoids NullPointerException in ActionListener
    
    // Constructor
    public U3A3_ConvertMe() {

        super("Linear Conversion");
        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);  // Makes background light gray

        // Intitialize all components
        JLabel lblTitle = new JLabel("Linear Conversion");      // Title
        lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        lblTitle.setForeground(Color.BLACK);

        JLabel lblInchtoCm = new JLabel("1. Inches to Centimetres");  // Display conversion choice
        lblInchtoCm.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        JLabel lblFeettoCm = new JLabel("2. Feet to Centimetres");  // Display conversion choice
        lblFeettoCm.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        JLabel lblYardtoMetre = new JLabel("3. Yards to Metres");  // Display conversion choice
        lblYardtoMetre.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        JLabel lblMiletoKm = new JLabel("4. Miles to Kilmetres");  // Display conversion choice
        lblMiletoKm.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        JLabel lblCmtoInch = new JLabel("5. Centimetres to Inches");  // Display conversion choice
        lblCmtoInch.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        JLabel lblCmtoFeet = new JLabel("6. Centimetres to Feet");  // Display conversion choice
        lblCmtoFeet.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        JLabel lblMetretoYard = new JLabel("7. Metres to Yards");  // Display conversion choice
        lblMetretoYard.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        JLabel lblKmtoMile = new JLabel("8. Kilmetres to Miles");  // Display conversion choice
        lblKmtoMile.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
        
        JLabel lblConversionChoice = new JLabel("Enter a conversion choice (1-8):");  // Prompt
        lblConversionChoice.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));

        txtConversionChoice.setText("");              // Input conversion choice
        
        JLabel lblValue = new JLabel("Enter a value to be converted:");  // Prompt
        lblValue.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));

        txtValue.setText("");              // Input value

        JButton btnConvert = new JButton("Convert");        // Convert button
        btnConvert.setFont(new Font("Arial", Font.BOLD, 10));
        btnConvert.setActionCommand("Convert");
        btnConvert.addActionListener(this);

        lblOutput.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));     // Conversion output
        lblOutput.setForeground(Color.RED);  // Set font colour to red
        lblOutput.setText("");

        // Set size and locations
        lblTitle.setSize(400, 50);
        lblTitle.setLocation(80, 20);
        
        lblInchtoCm.setSize(500, 50);
        lblInchtoCm.setLocation(110, 60);
        
        lblFeettoCm.setSize(500, 50);
        lblFeettoCm.setLocation(110, 100);  
        
        lblYardtoMetre.setSize(500, 50);
        lblYardtoMetre.setLocation(110, 140);
        
        lblMiletoKm.setSize(500, 50);
        lblMiletoKm.setLocation(110, 180);
        
        lblCmtoInch.setSize(500, 50);
        lblCmtoInch.setLocation(110, 220);   
        
        lblCmtoFeet.setSize(500, 50);
        lblCmtoFeet.setLocation(110, 260);

        lblMetretoYard.setSize(500, 50);
        lblMetretoYard.setLocation(110, 300); 
        
        lblKmtoMile.setSize(500, 50);
        lblKmtoMile.setLocation(110, 340);
        
        lblConversionChoice.setSize(500, 50);
        lblConversionChoice.setLocation(50, 390);

        txtConversionChoice.setSize(60, 30);
        txtConversionChoice.setLocation(290, 400);
        
        lblValue.setSize(500, 50);
        lblValue.setLocation(50, 430);
        
        txtValue.setSize(60, 30);
        txtValue.setLocation(290, 440);

        btnConvert.setSize(300, 20);
        btnConvert.setLocation(50, 490);

        lblOutput.setSize(500, 50);
        lblOutput.setLocation(72, 515);

        // Add to frame
        add(lblTitle);
        add(lblInchtoCm);
        add (lblFeettoCm);
        add(lblYardtoMetre);
        add(lblMiletoKm); 
        add(lblCmtoInch);
        add(lblCmtoFeet);
        add(lblMetretoYard);
        add(lblKmtoMile);
        add(lblConversionChoice);
        add(txtConversionChoice);
        add(lblValue);
        add(txtValue);
        add(btnConvert);
        add(lblOutput);
        
        // Configure window
        pack();
        setSize (400, 600);
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // Closes when x is pressed
        setLocationRelativeTo (null);
        setResizable(false);   // Not resizable window
    }
    
    // Declare methods 
    // Convert inches to centimetres
    private double inchesToCentimetres (double dblInches){
        double dblCentimetres = dblInches * 2.54;
        return dblCentimetres;
    }
        
    // Convert feet to centimetres
    private double feetToCentimetres (double dblFeet){
        double dblCentimetres = dblFeet * 30;
        return dblCentimetres;
    }
        
    // Convert yards to metres
    private double yardsToMetres (double dblYards){
        double dblMetres = dblYards * 0.91;
        return dblMetres;
    }
        
    // Convert miles to kilometres
    private double milesToKilometres (double dblMiles){
        double dblKilometres = dblMiles * 1.6;
        return dblKilometres;
    }
        
    // Convert centimetres to inches
    private double centimetresToInches (double dblCentimetres){
        double dblInches = dblCentimetres / 2.54;
        return dblInches;
    }
        
    // Convert centimetres to feet
    private double centimetresToFeet (double dblCentimetres){
        double dblFeet = dblCentimetres / 30;
        return dblFeet;
    }
        
    // Convert metres to yards
    private double metresToYards (double dblMetres){
        double dblYards = dblMetres / 0.91;
        return dblYards;
    }
        
    // Convert kilometres to miles
    private double kilometresToMiles (double dblKilometres){
        double dblMiles = dblKilometres / 1.6;
        return dblMiles;
    }
    
    // Action listener
    public void actionPerformed(ActionEvent e) {  
        if(e.getActionCommand().equals("Convert")){
            // Declare variables
            double dblValue, dblConvertedValue;
            int intConversionChoice;
            String strMessageOut;

            // Assign variable to recognize user input
            intConversionChoice = Integer.parseInt(txtConversionChoice.getText());

            // Convert from String to double 
            dblValue = Double.parseDouble(txtValue.getText());

            // Formats numbers into 2 decimal places 
            DecimalFormat x = new DecimalFormat ("#0.00");

            // Switch and break statement enables conversion 
            // Type of conversion is chosen from user's input in textfield
            switch (intConversionChoice)
            {
                case 1: // Input is one, therefore inches to centimeters
                    dblConvertedValue = inchesToCentimetres(dblValue);
                    strMessageOut = (x.format(dblValue) + " inch(es)"+ " = " + x.format(dblConvertedValue) + " centimetres");
                    lblOutput.setText(strMessageOut);
                    break;

                case 2: // Input is two, therefore feet to centimetres
                    dblConvertedValue = feetToCentimetres(dblValue);
                    strMessageOut = (x.format(dblValue) + " feet"+ " = " + x.format(dblConvertedValue) + " centimetre(s)");
                    lblOutput.setText(strMessageOut);
                    break;

                case 3: // Input is three, therefore yards to metres 
                    dblConvertedValue = yardsToMetres(dblValue);
                    strMessageOut = (x.format(dblValue) + " yard(s)"+ " = " + x.format(dblConvertedValue) + " metre(s)");
                    lblOutput.setText(strMessageOut);
                    break;

                case 4: // Input is four, therefore miles to kilometres 
                    dblConvertedValue = milesToKilometres(dblValue);
                    strMessageOut = (x.format(dblValue) + " mile(s)"+ " = " + x.format(dblConvertedValue) + " kilometre(s)");
                    lblOutput.setText(strMessageOut);
                    break;

                case 5: // Input is five, therefore centimetres to inches
                    dblConvertedValue = centimetresToInches(dblValue);
                    strMessageOut = (x.format(dblValue) + " centimetre(s)"+ " = " + x.format(dblConvertedValue) + " inch(es)");
                    lblOutput.setText(strMessageOut); 
                    break;

                case 6: // Input is six, therefore centimetres to feet 
                    dblConvertedValue = centimetresToFeet(dblValue);
                    strMessageOut = (x.format(dblValue) + " centimetre(s)"+ " = " + x.format(dblConvertedValue) + " feet");
                    lblOutput.setText(strMessageOut);
                    break;

                case 7: // Input is seven, therefore metres to yards 
                    dblConvertedValue = metresToYards(dblValue);
                    strMessageOut = (x.format(dblValue) + " metre(s)"+ " = " + x.format(dblConvertedValue) + " yard(s)");
                    lblOutput.setText(strMessageOut);
                    break;

                case 8: // Input is eight, therefore kilometres to miles
                    dblConvertedValue = kilometresToMiles(dblValue);
                    strMessageOut = (x.format(dblValue) + " kilometre(s)"+ " = " + x.format(dblConvertedValue) + " mile(s)");
                    lblOutput.setText(strMessageOut);
                    break;

                default: // Asks user to enter a number between 1-8
                    lblOutput.setText("Please enter a valid conversion type (between 1-8).");
                    break;
            }
        }
    }
     
    // Main method (tester) 
    public static void main( String[] args ) {
       U3A3_ConvertMe myFrame = new U3A3_ConvertMe();        
       myFrame.setVisible(true);
    } 
}


