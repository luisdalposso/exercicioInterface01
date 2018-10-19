package entities;

import java.util.Date;

public class Acessos {

	private String login;
	private Date dataAcesso;

	public Acessos(String login, Date dataAcesso) {
		this.login = login;
		this.dataAcesso = dataAcesso;
	}

	public String getLogin() {
		return login;
	}

	public Date getDataAcesso() {
		return dataAcesso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acessos other = (Acessos) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

}
