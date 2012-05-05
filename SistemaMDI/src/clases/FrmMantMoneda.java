package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import bean.MonedaDTO;

import dao.clases.MySqlMonedaDAO;

import util.Constantes;
import util.Fecha;

public class FrmMantMoneda extends JInternalFrame{
	
	JButton btnGrabar,btnCancelar;
	JTabbedPane interalFichas;
	PnlIngresarMone pnlIngresarMone;
	PnlListarMone pnlListarMone;
	JLabel lblDesMoneda;
	JTextField txtDesMoneda;
	
	
	public FrmMantMoneda(){
		
		pnlIngresarMone = new PnlIngresarMone();
		pnlListarMone = new PnlListarMone();

		interalFichas = new JTabbedPane();
		interalFichas.addTab("Ingresar Monedas",null,pnlIngresarMone);
		interalFichas.addTab("Listar Monedas", null,pnlListarMone);
		
		add(interalFichas);
		
		setTitle("Mantenimiento de Monedas");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setSize(300,235);
		
	}

}
