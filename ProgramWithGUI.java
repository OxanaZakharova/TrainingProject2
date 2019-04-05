import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProgramWithGUI {

	public static void main(String[] args) {
		
		
		JFrame window = new JFrame();
		window.setTitle("Cach memory - 2^n");
		window.setSize(new Dimension(600,300) );
		window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		window.setLocationRelativeTo(null);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setPreferredSize(new Dimension(600,100) );
		final JTextField input1 = new JTextField("0");
		input1.setPreferredSize(new Dimension(150,40));
		inputPanel.add(input1, BorderLayout.EAST);
		
		JPanel outputPanel = new JPanel();
		outputPanel.setPreferredSize(new Dimension(400, 150));
		final JLabel output = new JLabel("Result:");
		output.setPreferredSize(new Dimension(300, 50));
		outputPanel.add(output, BorderLayout.EAST);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(600, 50));
		JButton computeButton = new JButton("Compute 2^n");
		computeButton.setPreferredSize(new Dimension(130, 40));
		JButton clearButton = new JButton("Clear memory");
		clearButton.setPreferredSize(new Dimension(130, 40));
		JButton quiteButton = new JButton("Quite");
		quiteButton.setPreferredSize(new Dimension(130, 40));
		
		buttonPanel.add(computeButton, BorderLayout.EAST);
		buttonPanel.add(clearButton, BorderLayout.CENTER);
		buttonPanel.add(quiteButton,BorderLayout.WEST);
		
		window.add(inputPanel, BorderLayout.NORTH );
		window.add(outputPanel, BorderLayout.CENTER);
		window.add(buttonPanel, BorderLayout.SOUTH);
		
		Model cashMinne = new Model();
			    		
		computeButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				try {
					output.setText("Result: " + cashMinne.compute2Power(Integer.valueOf(input1.getText())));
				} catch (IllegalArgumentException e) {
					output.setText("Input a positive number please!");
				}
			}
		});
		
		
	    clearButton.addActionListener(new ActionListener() {
		
		    public void actionPerformed(ActionEvent event) {
				output.setText("Memory cleard");
		        cashMinne.clearMemory();
			}
	    });
	    
	    
	    quiteButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				cashMinne.clearMemory() ;
				System.exit(0);
			}
		});
		
		window.setVisible(true);
		window.setResizable(false);
		
	
	}

}
