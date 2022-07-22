package chap13.generic_type_inherit;

public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("스마트TV");
		product.setCompany("LG");
		
		Storage<Tv> storage = new StorageImpl<Tv>(10);
		storage.add(new Tv(), 0);
		Tv tv = storage.get(0);
	}

}
