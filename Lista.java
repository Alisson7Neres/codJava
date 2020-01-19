package teste.Teste;

public class Lista {
	private String lista1;
	
	public void setLista1(String lista1) {
		this.lista1 = lista1;
	}
	public String getLista1() {
		return lista1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lista1 == null) ? 0 : lista1.hashCode());
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
		Lista other = (Lista) obj;
		if (lista1 == null) {
			if (other.lista1 != null)
				return false;
		} else if (!lista1.equals(other.lista1))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Lista [lista1=" + lista1 + "]";
	}
	
	

}
