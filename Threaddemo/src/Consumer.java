
public class Consumer implements Runnable{
	private Movie movie = null;
	
	
	public Consumer(Movie movie) {
		super();
		this.movie = movie;
	}


	public void run() {
		// 循环显示50次电影信息
		for (int i = 0; i < 50; i++) {
			
			this.movie.get();
		}
		
	}

}
