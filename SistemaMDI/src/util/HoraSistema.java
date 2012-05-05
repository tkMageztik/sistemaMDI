package util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;

public class HoraSistema extends Thread{
	JLabel lblReloj;
	
	public HoraSistema(JLabel lblReloj){
		this.lblReloj  =lblReloj;
	}
	
	public void run(){
		while(true){
			Date hoy = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			lblReloj.setText(sdf.format(hoy));
			
			try{
				Thread.sleep(1000);
			}catch (Exception ex) {
				// TODO: handle exception
			}
			
		}
	}

}
