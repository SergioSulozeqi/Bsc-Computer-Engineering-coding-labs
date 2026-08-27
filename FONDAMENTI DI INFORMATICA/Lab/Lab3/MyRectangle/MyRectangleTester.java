public class MyRectangleTester{
	public static void main(String[] args){

		MyRectangle rett = new MyRectangle(1,1,1,1);
		System.out.println(rett.getX());
		System.out.println(rett.getY());
		System.out.println(rett.getWidth());
		System.out.println(rett.getHeight());
		rett.resize(2);
		rett.translate(1,1);
		System.out.println(rett.toString());

	}
}