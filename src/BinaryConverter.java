import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	JTextField field;
	JLabel label;
	JPanel panel;
	JFrame frame;
	
	public static void main(String[] args) {
		new BinaryConverter().createGUI();;
	}
	
	void createGUI() {
		
		frame = new JFrame("8 bits of binary to ASCII");
		panel = new JPanel();
		label = new JLabel();
		field = new JTextField(20);
		JButton button = new JButton("Convert");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.add(field);
		panel.add(button);
		

		frame.pack();
		
		button.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		String result = convert(field.getText());
		
		System.out.println(result);
		
		label.setText(result);
		
		panel.add(label);
		
		frame.pack();
		
		
	}
	
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
	
}
