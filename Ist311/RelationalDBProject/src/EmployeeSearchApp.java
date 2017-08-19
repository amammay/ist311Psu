/**
 * 
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;

import javax.swing.JOptionPane;
import java.util.List;

/**
 * @author Alex Mammay
 * @Date
 * @Purpose
 * @Title
 */
@SuppressWarnings("serial")
public class EmployeeSearchApp extends JFrame
{

	private JPanel contentPane;
	private JTextField lastNameTextField;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable table;
	private EmployeeDAO employeeDAO;
	
	//Launch the application
	public static void main (String[] args)
	{
		EventQueue.invokeLater(new Runnable(){
			public void run()
			{
				try 
				{
					EmployeeSearchApp frame = new EmployeeSearchApp();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
				
				
			}
		});
	}
	
	//Create the frame
	public EmployeeSearchApp()
	{
		//create the DAO
		try
		{
			employeeDAO = new EmployeeDAO();
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		setTitle("Employee Search App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
	
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblEnterLastName = new JLabel("Enter last name");
		panel.add(lblEnterLastName);
		
		lastNameTextField = new JTextField();
		panel.add(lastNameTextField);
		lastNameTextField.setColumns(10);
		
		btnSearch = new JButton();
		btnSearch.setText("search");
		btnSearch.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String lastName = lastNameTextField.getText();
					
					List<Employees> employees = null;
					
					if(lastName != null && lastName.trim().length() > 0)
					{
						employees = employeeDAO.searchEmployees(lastName);
					}
					else
					{
						employees = employeeDAO.getAllEmployees();
					}
					//create the model and update the table
					EmployeesTableModel model = new EmployeesTableModel(employees);
					
					table.setModel(model);
					
				}
				catch (Exception ex) {
					JOptionPane.showMessageDialog(EmployeeSearchApp.this, "Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		panel.add(btnSearch);
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
	}
	
}
