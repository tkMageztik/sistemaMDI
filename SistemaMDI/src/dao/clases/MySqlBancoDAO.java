package dao.clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.BancoDTO;

/*import aprendamos.java.bean.ClienteDTO;*/
import util.MysqlConnection;

public class MySqlBancoDAO {

	public MySqlBancoDAO() {
		// TODO Auto-generated constructor stub
	}
	
	/*public List<BancoDTO> listarPorNombre(String nombre) {
		List clientes = new ArrayList();
		Connection cn = MysqlConnection.obtenerConexion();
		try {
			String sql = "select usuario,clave,nombre,direccion,fecnac, sueldo from tbcliente where nombre like ? ";
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, (new StringBuilder("%")).append(nombre)
					.append("%").toString());
			BancoDTO objCli;
			for (ResultSet rs = pst.executeQuery(); rs.next(); clientes
					.add(objCli)) {
				objCli = new BancoDTO();
				objCli.setUsuario(rs.getString(1));
				objCli.setClave(rs.getString(2));
				objCli.setUsuario(rs.getString(1));
				objCli.setNombre(rs.getString(3));
				objCli.setDireccion(rs.getString(4));
				objCli.setFecnac(rs.getDate(5));
				objCli.setSueldo(rs.getDouble(6));
			}

			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}

	public int registrarCliente(BancoDTO banco) {
		Connection cn = MysqlConnection.obtenerConexion();
		try {
			String sql = "insert into tbcliente values (?,?,?,?,?,?,?)";
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, banco.getUsuario());
			pst.setString(2, banco.getClave());
			pst.setString(3, banco.getNombre());
			pst.setString(4, banco.getDireccion());
			Date lafechabd = new Date(banco.getFecnac().getTime());
			pst.setDate(5, lafechabd);
			pst.setDouble(6, banco.getSueldo());
			pst.setString(7, banco.getSexo());
			pst.executeUpdate();
			cn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int actualizarCliente(BancoDTO cliente) {
		return 0;
	}

	@Override
	public int eliminarCliente(BancoDTO cliente) {

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
	}

	public int modificarCliente(BancoDTO cliente) {

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
