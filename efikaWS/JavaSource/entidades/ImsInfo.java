package entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="tb_efika_web_ims_config")
public class ImsInfo {
	
	@Id
	@NotEmpty
	@Column(name="id")
	private Integer id;
	
	@NotEmpty
	@Column(name="cidade")
	private String cidade;

	@NotEmpty
	@Column(name="prefixo")
	private String prefixo;

	@NotEmpty
	@Column(name="sigla_cidade")
	private String sigla_cidade;

	@NotEmpty
	@Column(name="call_source")
	private String callSource;

	@NotEmpty
	@Column(name="ifc")
	private String ifc;

	@NotEmpty
	@Column(name="zone_name")
	private String zoneName;

	@NotEmpty
	@Column(name="softxip")
	private String softxIp;

		
	public ImsInfo() {
	
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getPrefixo() {
		return prefixo;
	}


	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}


	public String getSigla_cidade() {
		return sigla_cidade;
	}


	public void setSigla_cidade(String sigla_cidade) {
		this.sigla_cidade = sigla_cidade;
	}


	public String getCallSource() {
		return callSource;
	}


	public void setCallSource(String callSource) {
		this.callSource = callSource;
	}


	public String getIfc() {
		return ifc;
	}


	public void setIfc(String ifc) {
		this.ifc = ifc;
	}


	public String getZoneName() {
		return zoneName;
	}


	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}


	public String getSoftxIp() {
		return softxIp;
	}


	public void setSoftxIp(String softxIp) {
		this.softxIp = softxIp;
	}
}
