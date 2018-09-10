
public class Test {
	public static void main(String[] args) {
		Movie movie = new Movie();
		Thread producer = new Thread(new Producter(movie));
		Thread consumer = new Thread(new Consumer(movie));
		producer.start();
		consumer.start();
	}
}
