package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bean.MonedaDTO;

import util.Constantes;

import dao.clases.MySqlMonedaDAO;

public class PnlIngresarMone extends JPanel implements ActionListener{
	
	JLabel lblDesMoneda;
	JTextField txtDesMoneda;
	JButton btnGrabar,btnCancelar;
	MySqlMonedaDAO mysqlMonedaDao;
	
	public PnlIngresarMone(){
		setLayout(null);
		
		mysqlMonedaDao = new MySqlMonedaDAO();
		
		lblDesMoneda = new JLabel("Moneda: ");
		lblDesMoneda.setBounds(28,35, 100, 30);
		add(lblDesMoneda);
		
		txtDesMoneda = new JTextField();
		txtDesMoneda.setBounds(22, 70, 100, 30);
		add(txtDesMoneda);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(20, 120, 100, 30);
		add(btnGrabar);
		btnGrabar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String correlativo = mysqlMonedaDao.getCorrelativo(Constantes.CORRE_MONEDA);
				System.out.println(Constantes.CORRE_MONEDA);
				MonedaDTO moneda= new MonedaDTO();
				moneda.setCod_moneda(correlativo);
				moneda.setDes_moneda(txtDesMoneda.getText());
				if(mysqlMonedaDao.registrarMoneda(moneda)){
					JOptionPane.showMessageDialog(null,"MONEDA INGRESADA");
					return;
				}
				JOptionPane.showMessageDialog(null,"CAGAO");	
					
			}
		});
		
		btnCancelar= new JButton("Cancelar");
		btnCancelar.setBounds(140, 120, 100, 30);
		add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("HOLA");
		
	}
}
