package Visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setExtendedState(frame.getExtendedState()|JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Gestor de empleos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnTrabajador = new JMenu("Trabajador");
		menuBar.add(mnTrabajador);
		
		JMenuItem mntmRegistrar = new JMenuItem("Registrar");
		mnTrabajador.add(mntmRegistrar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnTrabajador.add(mntmListar);
		
		JMenu mnEmpresa = new JMenu("Empresa");
		mnEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(mnEmpresa);
		
		JMenuItem mntmRegistrar_1 = new JMenuItem("Registrar");
		mntmRegistrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				RegistrarEmpresa regempresa = new RegistrarEmpresa();
			 regempresa.setModal(true);
				regempresa.setVisible(true);
			}
		});
		mnEmpresa.add(mntmRegistrar_1);
		
		JMenuItem mntmListar_1 = new JMenuItem("Listar");
		mntmListar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				ListarEmpresa listarempresa = new ListarEmpresa();
				 listarempresa.setModal(true);
					listarempresa.setVisible(true);
			}
		});
		mnEmpresa.add(mntmListar_1);
		
		JMenu mnSolicitudes = new JMenu("Solicitudes");
		menuBar.add(mnSolicitudes);
		
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarSolicitud regsolicitud= new RegistrarSolicitud();
				 regsolicitud.setModal(true);
					regsolicitud.setVisible(true);
			}
		});
		mnSolicitudes.add(mntmAgregar);
		
		JMenuItem mntmListar_2 = new JMenuItem("Listar");
		mntmListar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarSolicitud listarsolicitud = new ListarSolicitud();
				 listarsolicitud.setModal(true);
					listarsolicitud.setVisible(true);
			}
		});
		mnSolicitudes.add(mntmListar_2);
		
		JMenu mnVacantes = new JMenu("Vacantes");
		menuBar.add(mnVacantes);
		
		JMenuItem mntmAgregar_1 = new JMenuItem("Agregar");
		mnVacantes.add(mntmAgregar_1);
		
		JMenuItem mntmListar_3 = new JMenuItem("Listar");
		mntmListar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListarVacante lisVan = new ListarVacante();
				lisVan.setModal(true);
				lisVan.setVisible(true);
			}
		});
		mnVacantes.add(mntmListar_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
