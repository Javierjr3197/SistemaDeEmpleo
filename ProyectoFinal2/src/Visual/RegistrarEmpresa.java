package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtName;
	private JTextField txtRnc;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtServicio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarEmpresa dialog = new RegistrarEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarEmpresa() {
		setTitle("Registro de empresa");
		setBounds(100, 100, 452, 375);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 293);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 11, 54, 14);
		contentPanel.add(lblNombre);
		
		txtName = new JTextField();
		txtName.setBounds(10, 36, 148, 20);
		contentPanel.add(txtName);
		txtName.setColumns(10);
		
		Label label = new Label("RNC:");
		label.setBounds(229, 10, 62, 22);
		contentPanel.add(label);
		
		txtRnc = new JTextField();
		txtRnc.setBounds(229, 36, 148, 20);
		contentPanel.add(txtRnc);
		txtRnc.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(10, 141, 67, 14);
		contentPanel.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(10, 175, 367, 20);
		contentPanel.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 68, 54, 14);
		contentPanel.add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(10, 93, 148, 20);
		contentPanel.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtServicio = new JTextField();
		txtServicio.setBounds(229, 93, 148, 20);
		contentPanel.add(txtServicio);
		txtServicio.setColumns(10);
		
		JLabel lblServicio = new JLabel("Servicio:");
		lblServicio.setBounds(229, 67, 62, 14);
		contentPanel.add(lblServicio);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 304, 434, 33);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Salir");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
