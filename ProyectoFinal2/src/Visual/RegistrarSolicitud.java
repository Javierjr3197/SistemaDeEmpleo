package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarSolicitud extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtSueldo;
	JRadioButton rdbtnObrero;
	JRadioButton rdbtnTecnico;
	JRadioButton rdbtnGraduado;
	JPanel panelObrero;
	JPanel panelTecnico;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarSolicitud dialog = new RegistrarSolicitud();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarSolicitud() {
		setTitle("Registar Solicitud");
		setBounds(100, 100, 450, 528);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Solicitud", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JComboBox cbxPerfil = new JComboBox();
			cbxPerfil.setBounds(10, 50, 90, 20);
			cbxPerfil.setModel(new DefaultComboBoxModel(new String[] {"Obrero", "Tecnico", "Graduado"}));
			panel.add(cbxPerfil);
			
			JLabel lblPerfil = new JLabel("Perfil:");
			lblPerfil.setBounds(10, 25, 46, 14);
			panel.add(lblPerfil);
			
			JLabel lblDisponibilidad = new JLabel("Disponibilidad:");
			lblDisponibilidad.setBounds(152, 25, 77, 14);
			panel.add(lblDisponibilidad);
			
			JComboBox cbxDisponibilidad = new JComboBox();
			cbxDisponibilidad.setBounds(152, 50, 129, 20);
			cbxDisponibilidad.setModel(new DefaultComboBoxModel(new String[] {"Tiempo medio", "Tiempo completo", "Free lancer"}));
			panel.add(cbxDisponibilidad);
			
			JLabel lblsueldoAQue = new JLabel("\u00BFSueldo a que aspira?");
			lblsueldoAQue.setBounds(10, 85, 129, 14);
			panel.add(lblsueldoAQue);
			
			txtSueldo = new JTextField();
			txtSueldo.setBounds(10, 112, 90, 20);
			panel.add(txtSueldo);
			txtSueldo.setColumns(10);
			
			JLabel lblIdiomas = new JLabel("Idiomas:");
			lblIdiomas.setBounds(10, 150, 55, 14);
			panel.add(lblIdiomas);
			
			JCheckBoxMenuItem chckbxmntmIngles = new JCheckBoxMenuItem("Ingles");
			chckbxmntmIngles.setBounds(10, 178, 129, 22);
			panel.add(chckbxmntmIngles);
			
			JCheckBoxMenuItem chckbxmntmEspaol = new JCheckBoxMenuItem("Espa\u00F1ol");
			chckbxmntmEspaol.setBounds(10, 210, 129, 22);
			panel.add(chckbxmntmEspaol);
			
			JCheckBoxMenuItem chckbxmntmFrances = new JCheckBoxMenuItem("Frances");
			chckbxmntmFrances.setBounds(10, 237, 129, 22);
			panel.add(chckbxmntmFrances);
			
			JCheckBoxMenuItem chckbxmntmMandarin = new JCheckBoxMenuItem("Mandarin");
			chckbxmntmMandarin.setBounds(10, 265, 129, 22);
			panel.add(chckbxmntmMandarin);
			
			JCheckBoxMenuItem chckbxmntmItaliano = new JCheckBoxMenuItem("Italiano");
			chckbxmntmItaliano.setBounds(10, 292, 129, 22);
			panel.add(chckbxmntmItaliano);
			
			JCheckBoxMenuItem chckbxmntmTieneLicenciaDe = new JCheckBoxMenuItem("Tiene licencia de conducir");
			chckbxmntmTieneLicenciaDe.setBounds(152, 178, 181, 22);
			panel.add(chckbxmntmTieneLicenciaDe);
			
			JCheckBoxMenuItem chckbxmntmDispuestoAMudarse = new JCheckBoxMenuItem("Dispuesto a mudarse");
			chckbxmntmDispuestoAMudarse.setBounds(152, 210, 151, 22);
			panel.add(chckbxmntmDispuestoAMudarse);
			
			JCheckBoxMenuItem chckbxmntmActualmenteEstaTrabjando = new JCheckBoxMenuItem("Actualmente esta trabajando");
			chckbxmntmActualmenteEstaTrabjando.setBounds(152, 237, 191, 22);
			panel.add(chckbxmntmActualmenteEstaTrabjando);
			
			JLabel lblCaracteristicas = new JLabel("Caracteristicas");
			lblCaracteristicas.setBounds(152, 150, 90, 14);
			panel.add(lblCaracteristicas);
			
			JLabel lblHabilidad = new JLabel("Habilidad");
			lblHabilidad.setBounds(152, 85, 46, 14);
			panel.add(lblHabilidad);
			
			rdbtnObrero = new JRadioButton("Obrero");
			rdbtnObrero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				rdbtnObrero.setSelected(true);
				rdbtnGraduado.setSelected(false);
				rdbtnTecnico.setSelected(false);
				panelObrero.setVisible(true);
				panelTecnico.setVisible(false);
							
				}
			});
			rdbtnObrero.setBounds(152, 111, 65, 23);
			panel.add(rdbtnObrero);
			
			rdbtnTecnico = new JRadioButton("Tecnico");
			rdbtnTecnico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				rdbtnTecnico.setSelected(true);
				rdbtnObrero.setSelected(false);
				rdbtnGraduado.setSelected(false);
				panelTecnico.setVisible(true);				
				}
			});
			rdbtnTecnico.setBounds(219, 111, 65, 23);
			panel.add(rdbtnTecnico);
			
			rdbtnGraduado = new JRadioButton("Graduado");
			rdbtnGraduado.setBounds(299, 111, 97, 23);
			panel.add(rdbtnGraduado);
			
			panelObrero = new JPanel();
			panelObrero.setBounds(10, 325, 404, 84);
			panelObrero.setBorder(new TitledBorder(null, "Datos para obrero", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.add(panelObrero);
			panelObrero.setLayout(null);
			panelObrero.setVisible(false);
			
			JComboBox comboBox_2 = new JComboBox();
			comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Aqui van las habilidades"}));
			comboBox_2.setBounds(10, 53, 162, 20);
			panelObrero.add(comboBox_2);
			
			JLabel lblHabilidades = new JLabel("Habilidades");
			lblHabilidades.setBounds(10, 28, 70, 14);
			panelObrero.add(lblHabilidades);
			
			panelTecnico = new JPanel();
			panelTecnico.setBorder(new TitledBorder(null, "Datos para tecnico", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelTecnico.setBounds(10, 325, 404, 84);
			panel.add(panelTecnico);
			panelTecnico.setLayout(null);
			panelTecnico.setVisible(false);
			JComboBox cbxAreadetrabajoTecnico = new JComboBox();
			cbxAreadetrabajoTecnico.setModel(new DefaultComboBoxModel(new String[] {"Area de trabajo"}));
			cbxAreadetrabajoTecnico.setBounds(10, 53, 164, 20);
			panelTecnico.add(cbxAreadetrabajoTecnico);
			
			JLabel lblAreaDeTrabajo = new JLabel("Area de trabajo");
			lblAreaDeTrabajo.setBounds(10, 28, 83, 14);
			panelTecnico.add(lblAreaDeTrabajo);
			
			JLabel lblAosDeTrabajo = new JLabel("A\u00F1os de trabajo");
			lblAosDeTrabajo.setBounds(200, 28, 97, 14);
			panelTecnico.add(lblAosDeTrabajo);
			
			textField = new JTextField();
			textField.setBounds(200, 53, 90, 20);
			panelTecnico.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
