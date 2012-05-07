package clases;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.UIManager; 

import com.birosoft.liquid.LiquidLookAndFeel;

public class Prueba extends JFrame{
	  private MDIDesktopPane desktop = new MDIDesktopPane();

	  private JMenuBar menuBar = new JMenuBar();

	  private JMenu mnuContab = new JMenu("Contabilidad");

	  private JMenuItem frmIngresos = new JMenuItem("Ingresos");
	  private JMenuItem frmMantMoneda = new JMenuItem("Mantenimiento Moneda");
	  
	  
	  private JScrollPane scrollPane = new JScrollPane();

	  public Prueba() {
		  
		  
		

		  
	    menuBar.add(mnuContab);
	    menuBar.add(new WindowMenu(desktop));
	    mnuContab.add(frmIngresos);
	    mnuContab.add(frmMantMoneda);
	    setJMenuBar(menuBar);
	    setTitle("Contabilidad");
	    scrollPane.getViewport().add(desktop);
	    getContentPane().setLayout(new BorderLayout());
	    getContentPane().add(scrollPane, BorderLayout.CENTER);
	    

	    addWindowListener(new WindowAdapter() {
	      public void windowClosing(WindowEvent e) {
	    	  
	        System.exit(0);
	        
	        
	      }
	    });
	    frmIngresos.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent ae) {
	    	  
	        desktop.add(new FrmIngresos());
	        
	        
	        
	        
	      }
	    });
	    
	    frmMantMoneda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				desktop.add(new FrmMantMoneda());
				
			}
		});

	  }

	  public static void main(String[] args) {
		  try { 
			  javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel" ) ; 
			  LiquidLookAndFeel.setLiquidDecorations(true, "mac" ) ; 
			  } 
		  
		catch (Exception e) {} 
		  
		  Prueba gestion = new Prueba();
	    gestion.setSize(1086,845);
	    gestion.setVisible(true);
	  }

	}
