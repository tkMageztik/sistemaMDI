package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import com.birosoft.liquid.LiquidLookAndFeel;

public class MenuPrincipal extends JFrame {
	JTextField prueba2;
	MenuBar menuBar;
	Menu menuCajaChica;

	public MenuPrincipal() {

	
		  
		menuBar = new MenuBar();
		menuBar.setFont(new Font("", Font.ITALIC, 12));
		
		
		menuCajaChica = new Menu("Situación de Bancos");
		menuCajaChica.add(new MenuItem("Ingresos"));
		menuCajaChica.add(new MenuItem("Egresos"));
		menuCajaChica.add(new MenuItem("Conciliación"));
		menuCajaChica.add(new MenuItem("Reportes"));
		Menu configLvl2 = new Menu("Configuración");
		configLvl2.add(new MenuItem("Cambiar periodo Vigente"));
		
		menuCajaChica.add(configLvl2);
		
		menuCajaChica.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(arg0.getActionCommand().equals("Ingresos")){

				}
					
			
			}
		});
		
		menuBar.add(menuCajaChica);
		setMenuBar(menuBar);
		
		getContentPane().setLayout(null);
		setTitle("Sistema Caja Chica");
		setSize(800, 600);
		setBackground(Color.blue);
		setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MenuPrincipal();

	}

}
