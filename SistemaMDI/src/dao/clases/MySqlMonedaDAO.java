package dao.clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.MysqlConnection;
import bean.BancoDTO;
import bean.MonedaDTO;

public class MySqlMonedaDAO {
	


	public MySqlMonedaDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public List<MonedaDTO> listarPorDescripcion(String des_moneda) {
		List<MonedaDTO> monedas = new ArrayList<MonedaDTO>();
		
		try {

			Connection cn = MysqlConnection.obtenerConexion();
			String sql = "select cod_moneda,des_moneda where des_moneda like ? ";
			
			PreparedStatement pst = cn.prepareStatement(sql);
			
			pst.setString(1, des_moneda);
			/*pst.setString(1, (new StringBuilder("%")).append(nombre)
					.append("%").toString());*/
			
			MonedaDTO objMone;
			for (ResultSet rs = pst.executeQuery(); rs.next(); 
			monedas.add(objMone)) {
				objMone= new MonedaDTO();
				objMone.setCod_moneda(rs.getString(1));
				objMone.setDes_moneda(rs.getString(2));
			}

			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return monedas;
	}

	public boolean registrarMoneda(MonedaDTO moneda) {
		
		try {
			Connection cn = MysqlConnection.obtenerConexion();
			
			String sql = "insert into tb_moneda values (?,?)";
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, moneda.getCod_moneda());
			pst.setString(2, moneda.getDes_moneda());
		

			pst.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public int actualizarCliente(BancoDTO cliente) {
		return 0;
	}
	
	public String getCorrelativo(String tipoCorre){
		String correlativo ="";
		System.out.println(tipoCorre);

		Connection cn = MysqlConnection.obtenerConexion();

		try {

			// definimos la sentencia
			String sql = "select tipo_correlativo,cod_correlativo from tb_correlativo where" +
					" tipo_correlativo='" + tipoCorre + "'";

			// preparamos la sentencia
				PreparedStatement pst = cn.prepareStatement(sql);

			// ejecutamos la sentencia preparada
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				correlativo= rs.getString("cod_correlativo");
			}
			
			
			cn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}


		return correlativo;
		
	}

	/*@Override*/
	/*public int eliminarCliente(BancoDTO cliente) {

		Connection con = MysqlConnection.obtenerConexion();

		try {

			String sql = "delete from tbcliente where usuario=?";

			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, cliente.getUsuario());

			pst.executeUpdate();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}*/

	/*public int modificarCliente(BancoDTO cliente) {

		Connection cn = MysqlConnection.obtenerConexion();

		try {
			String sql = "update tbcliente set clave=?,nombre=?,direccion=?,fecnac=?,sueldo=?,sexo=? where usuario=?";

			PreparedStatement pst = cn.prepareStatement(sql);

			pst.setString(1, cliente.getClave());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getDireccion());
			Date lafechabd = new Date(cliente.getFecnac().getTime());
			pst.setDate(4, lafechabd);
			pst.setDouble(5, cliente.getSueldo());
			pst.setString(6, cliente.getSexo());
			pst.setString(7, cliente.getUsuario());

			pst.executeUpdate();
			cn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}*/


}
