package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartPanel;

import graficos.BarData;
import graficos.ChartFactoryCreator;

import Logical.Bolsa;
import Logical.Obrero;
import Logical.Tecnico;
import Logical.Universitario;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import org.edisoncor.gui.varios.ClockFace;
import org.edisoncor.gui.panel.PanelCurves;
import java.awt.Toolkit;


public class Principal extends JFrame {

	
	private static Bolsa bolsa = Bolsa.getIntance();
	private JPanel contentPane;
	private Dimension dim;
	public static JPanel panel_bar;
	public static JPanel panel_pie;
	public static boolean Validacion=true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		
		
		//look and feel
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		
		
		/*PrincipalLogin p=new PrincipalLogin();
		p.setModal(true);
		p.setLocationRelativeTo(null);
		p.setVisible(true);
		*/
		
		
		
		Login L= new Login();
		L.setModal(true);
		L.setLocationRelativeTo(null);
		L.setVisible(true);
		
		if(Validacion==false)
			System.exit(0);
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		//look and feel
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bolsa.init();
					Principal frame = new Principal();
					frame.setVisible(true);
					if(Bolsa.archivoCreadoEmpresa())
						Bolsa.CargarEmpresa();
					if(Bolsa.archivoCreadoSolicitante())
						Bolsa.Cargarsolicitante();
					if(Bolsa.archivoCreadoSolic())
						Bolsa.CargarSolic();
					cargarPIE();
					cargarBarra();
					
					frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					
					
					frame.addWindowListener( new WindowAdapter() {
					@Override
					public void  windowClosing(WindowEvent we){
						JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios.", "Informacion", JOptionPane.INFORMATION_MESSAGE);
						
						try {
							Bolsa.GuardarEmpresa();
							Bolsa.GuardarSolicitante();
							Bolsa.GuardarSolic();
						} catch (IOException e) {
							 //TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						System.exit(0);
					}
				});
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/periodico (2).png")));
		//bolsa.LeerBolsa();
		setTitle("Bolsa laboral V1.0");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1096);
		dim = super.getToolkit().getScreenSize();
		super.setSize(dim.width, (dim.height-50));
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 102));
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setBounds(0, 0, 1914, 31);
		contentPane.add(menuBar);
		menuBar.setBackground(Color.WHITE);
		menuBar.setForeground(Color.WHITE);
		 ///
		JMenu mnNewMenu = new JMenu("Ingresar datos");
		mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/usuario.png")));
		mnNewMenu.setBackground(Color.WHITE);
		mnNewMenu.setForeground(new Color(0, 0, 0));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Solicitantes         ");
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/lista-de-control-en-un-papel-con-un-lapiz.png")));
		mntmNewMenuItem.setBackground(Color.WHITE);
		mntmNewMenuItem.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitantesVisual md = new SolicitantesVisual();
				md.setModal(true);
				md.setLocationRelativeTo(null);
				md.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Empresas");
		mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/fabrica.png")));
		mntmNewMenuItem_1.setBackground(Color.WHITE);
		mntmNewMenuItem_1.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RegistrarEmpresaVisual ev = new RegistrarEmpresaVisual();
				ev.setModal(true);
				ev.setLocationRelativeTo(null);
				ev.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Solicitudes");
		mnNewMenu_2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/archivo (1).png")));
		mnNewMenu_2.setForeground(new Color(0, 0, 0));
		mnNewMenu_2.setBackground(Color.WHITE);
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Nueva solicitud");
		mntmNewMenuItem_2.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/archivo (2).png")));
		mntmNewMenuItem_2.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarPlaza rp = new RegistrarPlaza();
				rp.setModal(true);
				rp.setLocationRelativeTo(null);
				rp.setVisible(true);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Matching");
		mntmNewMenuItem_3.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/archivo (3).png")));
		mntmNewMenuItem_3.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Macheo A = new Macheo();
				A.setModal(true);
				A.setLocationRelativeTo(null);
				A.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenu mnModificar = new JMenu("Modificar Datos");
		mnModificar.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/barajar.png")));
		mnModificar.setForeground(new Color(0, 0, 0));
		mnModificar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		mnModificar.setBackground(Color.WHITE);
		menuBar.add(mnModificar);
		
		JMenuItem menuItem = new JMenuItem("Solicitantes         ");
		menuItem.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/equipo.png")));
		menuItem.setForeground(new Color(0, 0, 0));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarSolicitantes m=new ModificarSolicitantes();
				m.setModal(true);
				m.setLocationRelativeTo(null);
				m.setVisible(true);
				
			}
		});
		menuItem.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnModificar.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Empresas");
		menuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/fabricante (2).png")));
		menuItem_1.setForeground(new Color(0, 0, 0));
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarEmpresa emp=new ModificarEmpresa();
				emp.setModal(true);
				emp.setLocationRelativeTo(null);
				emp.setVisible(true);
				
				
				
				
			}
		});
		menuItem_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnModificar.add(menuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Reportes");
		mnNewMenu_1.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/periodico (2).png")));
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		mnNewMenu_1.setBackground(Color.WHITE);
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Empleados contratados");
		mntmNewMenuItem_4.setBackground(new Color(255, 255, 255));
		mntmNewMenuItem_4.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/hombre-de-negocios (1).png")));
		mntmNewMenuItem_4.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SolicitantesContratados p=new SolicitantesContratados();
				p.setModal(true);
				p.setLocationRelativeTo(null);
				p.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Estado Solicitudes");
		mntmNewMenuItem_5.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/lista-de-usuarios.png")));
		mntmNewMenuItem_5.setForeground(new Color(0, 0, 0));
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReporteEstadoSolicitudes x=new ReporteEstadoSolicitudes();
				x.setModal(true);
				x.setLocationRelativeTo(null);
				x.setVisible(true);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		panel_pie = new JPanel();
		panel_pie.setBounds(15, 69, 482, 388);
		contentPane.add(panel_pie);
		
		panel_bar = new JPanel();
		panel_bar.setBounds(512, 69, 526, 388);
		contentPane.add(panel_bar);
		
		ClockFace clockFace = new ClockFace();
		clockFace.setBounds(1060, 69, 280, 297);
		contentPane.add(clockFace);
		clockFace.setBackground(new Color(255, 255, 255));
	}
	public static void cargarBarra(){
		panel_bar.removeAll();
        ArrayList<BarData> valoresBar = new ArrayList<>();
        for(int i=0;i<bolsa.getMiEmpresa().size();i++){
        	double uni =0;
        	double tec =0;
        	double obre=0;
        	for(int a=0;a<bolsa.getMiEmpresa().get(i).getMiSolicitudes().size();a++){
        		for(int b=0;b<bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().size();b++){
        			for(int c=0;c<bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b).getMiSolicitud().size();c++){
		        		if(bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b).getMiSolicitud().get(c) instanceof Universitario)
		        			uni++;
		        		if(bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b).getMiSolicitud().get(c) instanceof Tecnico)
		        			tec++;
		        		if(bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b).getMiSolicitud().get(c) instanceof Obrero)
		        			obre++;
        			}
        		}
        	}
        	
        	valoresBar.add(new BarData(obre,"Obreros", bolsa.getMiEmpresa().get(i).getNombreEmpresa()));
            valoresBar.add(new BarData(tec,"Tecnicos", bolsa.getMiEmpresa().get(i).getNombreEmpresa()));
            valoresBar.add(new BarData(uni,"Universitario", bolsa.getMiEmpresa().get(i).getNombreEmpresa()));
        }
         
        ChartPanel chartPanelBar = ChartFactoryCreator.createBarChartPanel("Cantidad Empleados por empresa","Empresas","Cantidad",valoresBar,panel_bar.getWidth(),panel_bar.getHeight());
        panel_bar.add(chartPanelBar,BorderLayout.CENTER);
        panel_bar.validate();
	}
	
	public static void cargarPIE(){
		panel_pie.removeAll();
		HashMap<String, Double> valoresPie = new HashMap<>();
		double uni =0;
     	double tec =0;
     	double obre=0;
		 for(int i=0;i<bolsa.getMiEmpresa().size();i++){
	        for(int a=0;a<bolsa.getMiEmpresa().get(i).getMiSolicitudes().size();a++){
	        	for(int b=0;b<bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().size();b++){
	        		for(int c=0;c<bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b).getMiSolicitud().size();c++){
			        	if(bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b).getMiSolicitud().get(c) instanceof Universitario)
			        		uni++;
			        	if(bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b).getMiSolicitud().get(c) instanceof Tecnico)
			        		tec++;
			        	if(bolsa.getMiEmpresa().get(i).getMiSolicitudes().get(a).getMiSolicitantes().get(b).getMiSolicitud().get(c) instanceof Obrero)
			        		obre++;
	        		}
	        	}
	       	}
		 }
		 
	     valoresPie.put("Obreros", obre );
	     valoresPie.put("Universitarios", uni);
	     valoresPie.put("Tecnicos", tec);
	        
	     ChartPanel chartPanelPie = ChartFactoryCreator.createPieChartPanel("Profesion vs Cantidad", valoresPie,panel_pie.getWidth(),panel_pie.getHeight());
	     panel_pie.add(chartPanelPie,BorderLayout.CENTER);
	     panel_pie.validate();
	}	
}
