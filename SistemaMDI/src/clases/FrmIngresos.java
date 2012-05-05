package clases;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import util.Fecha;

public class FrmIngresos extends JInternalFrame {

	JLabel lblFec, lblTitulo, lblCliDep,lblCliente,lblMoneda,lblBanco,lblConcepto,lblMonto;
	
	JTextField txtFec, txtCliDep, txtMoneda,txtCliente,txtMonto;

	//JRE7: JComboBox<String> cboBanco,cboMoneda,cboConcepto;
	//JR6
	JComboBox cboBanco,cboMoneda,cboConcepto;
	JButton btnGrabar, btnCancelar;
	
	public FrmIngresos() {

		getContentPane().setLayout(null);

		lblTitulo = new JLabel("Ingresos: ");
		lblTitulo.setBounds(300, 15, 70, 20);
		// lblTitulo.setSize(150,200);
		// lblTitulo.setFont(Font.PLAIN);
		lblTitulo.setVisible(true);
		getContentPane().add(lblTitulo);

		lblFec = new JLabel("Fecha: ");
		lblFec.setBounds(20, 50, 100, 30);
		lblFec.setVisible(true);
		getContentPane().add(lblFec);

		txtFec = new JTextField();
		txtFec.setBounds(70, 50, 100, 30);
		txtFec.setVisible(true);
		getContentPane().add(txtFec);
		
		lblCliente  = new JLabel("Cliente: ");
		lblCliente.setBounds(20, 95, 100, 30);
		lblCliente.setVisible(true);
		getContentPane().add(lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(70, 95, 100, 30);
		txtCliente.setVisible(true);
		getContentPane().add(txtCliente);
		
		lblMoneda= new JLabel("Moneda: ");
		lblMoneda.setBounds(250, 50, 100, 30);
		lblMoneda.setVisible(true);
		getContentPane().add(lblMoneda);
		
		cboMoneda = new JComboBox();
		cboMoneda.setBounds(300, 50, 100, 30);
		cboMoneda.setVisible(true);
		getContentPane().add(cboMoneda);	
		
		lblBanco= new JLabel("Banco: ");
		lblBanco.setBounds(250, 95, 100, 30);
		lblBanco.setVisible(true);
		getContentPane().add(lblBanco);
		
		cboBanco = new JComboBox();
		cboBanco.setBounds(300, 95, 100, 30);
		cboBanco.setVisible(true);
		getContentPane().add(cboBanco);	
		
		cboBanco = new JComboBox();
		cboBanco.setBounds(300, 95, 100, 30);
		cboBanco.setVisible(true);
		getContentPane().add(cboBanco);	
		
		lblConcepto = new JLabel("Concepto: ");
		lblConcepto.setBounds(450, 50, 100, 30);
		lblConcepto.setVisible(true);
		getContentPane().add(lblConcepto);
		
		cboConcepto = new JComboBox();
		cboConcepto.setBounds(520, 50, 100, 30);
		cboConcepto.setVisible(true);
		getContentPane().add(cboConcepto);	
		
		lblMonto = new  JLabel("Monto: ");
		lblMonto.setBounds(70, 140, 100, 30);
		lblMonto.setVisible(true);
		getContentPane().add(lblMonto);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(120, 140, 100, 30);
		txtMonto.setVisible(true);
		getContentPane().add(txtMonto);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.setBounds(20, 185, 100, 30);
		getContentPane().add(btnGrabar);
		
		btnCancelar= new JButton("Cancelar");
		btnCancelar.setBounds(140, 185, 100, 30);
		getContentPane().add(btnCancelar);
		
		/*final JLabel label = new JLabel();
		label.setText("Choose Date by selecting below.");

		final JXDatePicker datePicker = new JXDatePicker(System.currentTimeMillis());
		datePicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(datePicker.getDate().toString());
			}
		});

		frame.getContentPane().add(label, BorderLayout.NORTH);
		frame.getContentPane().add(datePicker, BorderLayout.CENTER);
		  */
		
		txtFec.setText(Fecha.fechaActual());
		
		
		setTitle("Ingresos");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setSize(700,300);
		//setResizable(true);
		
		/*scrollPane.getViewport().add(textArea);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(scrollPane, BorderLayout.CENTER);*/

	}

}
