package chap13.generic_type_inherit;

public class ChildProduct<K, M, C> extends Product<K, M> {
	private C company;	// 객체

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
