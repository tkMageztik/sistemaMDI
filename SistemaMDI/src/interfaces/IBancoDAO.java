package interfaces;

import java.util.List;

import bean.BancoDTO;

public interface IBancoDAO {

	 public abstract List<BancoDTO> listarPorNombre(String s);

	    public abstract int registrarCliente(BancoDTO clientedto);

	    public abstract int actualizarCliente(BancoDTO clientedto);
	    
	    public int eliminarCliente(BancoDTO codigo);
	    
	    public int modificarCliente(BancoDTO cliente);
}
