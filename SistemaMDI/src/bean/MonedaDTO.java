package bean;

public class MonedaDTO {

	private String cod_moneda,des_moneda;

	public MonedaDTO() {

	}

	public MonedaDTO(String cod_moneda, String des_moneda) {
		this.cod_moneda = cod_moneda;
		this.des_moneda = des_moneda;
	}

	public String getCod_moneda() {
		return cod_moneda;
	}

	public void setCod_moneda(String cod_moneda) {
		this.cod_moneda = cod_moneda;
	}

	public String getDes_moneda() {
		return des_moneda;
	}

	public void setDes_moneda(String des_moneda) {
		this.des_moneda = des_moneda;
	}

}
