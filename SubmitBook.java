import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubmitBook extends JFrame {
	private final JLabel lblNewLabel = new JLabel("New label");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public SubmitBook(String str) {
		super(str);
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(new Color(255, 255, 240));
		
	    setDefaultCloseOperation(3);
	    setBounds(100, 100, 506, 416);
	    setLocationRelativeTo(this);
	    
	    JLabel lblNewLabel_1 = new JLabel("Book Id");
	    lblNewLabel_1.setForeground(Color.BLACK);
	    lblNewLabel_1.setBackground(Color.WHITE);
	    
	    JLabel lblName = new JLabel("Name");
	    lblName.setForeground(Color.BLACK);
	    lblName.setBackground(Color.WHITE);
	    
	    JLabel lblOntact = new JLabel("Contact");
	    lblOntact.setForeground(Color.BLACK);
	    
	    JLabel lblEmail = new JLabel("Email");
	    lblEmail.setForeground(Color.BLACK);
	    
	    JLabel lblUsertype = new JLabel("UserType");
	    lblUsertype.setForeground(Color.BLACK);
	    
	    textField = new JTextField();
	    textField.setForeground(Color.WHITE);
	    textField.setBackground(Color.WHITE);
	    textField.setColumns(10);
	    
	    textField_1 = new JTextField();
	    textField_1.setForeground(Color.WHITE);
	    textField_1.setBackground(Color.WHITE);
	    textField_1.setColumns(10);
	    
	    textField_2 = new JTextField();
	    textField_2.setForeground(Color.WHITE);
	    textField_2.setBackground(Color.WHITE);
	    textField_2.setColumns(10);
	    
	    textField_3 = new JTextField();
	    textField_3.setForeground(Color.WHITE);
	    textField_3.setBackground(Color.WHITE);
	    textField_3.setColumns(10);
	    
	    textField_4 = new JTextField();
	    textField_4.setForeground(Color.WHITE);
	    textField_4.setBackground(Color.WHITE);
	    textField_4.setColumns(10);
	    
	    JButton btnNewButton = new JButton("ISSUE");
	    btnNewButton.setForeground(Color.BLACK);
	    btnNewButton.setBackground(Color.WHITE);
	    
	    JButton btnUpdate = new JButton("RESET");
	    btnUpdate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		textField.setText(null);
	    		 textField_1.setText(null);
	    		 textField_2.setText(null);
	    		 textField_3.setText(null);
	    		 textField_4.setText(null);
	    	}
	    });
	    btnUpdate.setForeground(Color.BLACK);
	    btnUpdate.setBackground(Color.WHITE);
	    
	    JButton btnBack = new JButton("BACK");
	    btnBack.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		AdminSection a = new AdminSection("Admin Section");
	             a.setVisible(true);
	           SubmitBook.this.dispose();
	    	}
	    });
	    btnBack.setForeground(Color.BLACK);
	    btnBack.setBackground(Color.WHITE);
	    GroupLayout groupLayout = new GroupLayout(getContentPane());
	    groupLayout.setHorizontalGroup(
	    	groupLayout.createParallelGroup(Alignment.LEADING)
	    		.addGroup(groupLayout.createSequentialGroup()
	    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	    				.addGroup(groupLayout.createSequentialGroup()
	    					.addContainerGap()
	    					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE))
	    				.addGroup(groupLayout.createSequentialGroup()
	    					.addGap(83)
	    					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	    						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblOntact, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(lblUsertype, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
	    						.addComponent(btnNewButton))
	    					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	    						.addGroup(groupLayout.createSequentialGroup()
	    							.addGap(42)
	    							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
	    								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
	    								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)))
	    						.addGroup(groupLayout.createSequentialGroup()
	    							.addGap(17)
	    							.addComponent(btnUpdate)
	    							.addGap(44)
	    							.addComponent(btnBack)))))
	    			.addContainerGap(58, Short.MAX_VALUE))
	    );
	    groupLayout.setVerticalGroup(
	    	groupLayout.createParallelGroup(Alignment.LEADING)
	    		.addGroup(groupLayout.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
	    			.addGap(63)
	    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblOntact, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addGap(18)
	    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(lblUsertype, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
	    				.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	    			.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
	    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
	    				.addComponent(btnNewButton)
	    				.addComponent(btnUpdate)
	    				.addComponent(btnBack))
	    			.addGap(32))
	    );
	    getContentPane().setLayout(groupLayout);
	    //setResizable(false);
	}

	public static void main(String[] args) {
		SubmitBook i = new SubmitBook("Submit Book");
		i.setVisible(true);
	}

}
