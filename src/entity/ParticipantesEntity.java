package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PARTICIPANTES")
public class ParticipantesEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO")
    private int codigo;
	
	@Column(name = "NOME", length = 60)
    private String nome;
	
	@Column(name = "USUARIO", length = 60)
    private String usuario;
	
	@Column(name = "SENHA", length = 60)
    private String senha;
	
	@Column(name = "ISUSUARIO", length = 1)
    private String isUsuario;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getIsUsuario() {
		return isUsuario;
	}

	public void setIsUsuario(String isUsuario) {
		this.isUsuario = isUsuario;
	}
	
}
