package chap13.multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		// 사용할 때는 구체적인 객체를 정의
		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("스마트TV");
		Tv tv = product1.getKind();
		String model = product1.getModel();
		System.out.println(tv + ", 모델=" + model);
		
		// 또 다른 객체를 사용하는 경우
		Product<Car, Integer> product2 = new Product<>();	// Car, Integer는 생략 가능
		product2.setKind(new Car());
		product2.setModel(1);
		Car car = product2.getKind();
		int model2 = product2.getModel();
	}

}
