package example_code_adapter_pattern;

/*
 * Target interface를 구현해야 한다.
 * 여기서 TargetInterface는 MovieManager
 */
public class MovieMediaListAdapter implements MovieMediaManager {
	
	private ExtendedMovieMediaList movieList;
	private String fileName;
	private boolean loaded = false;
	
	public MovieMediaListAdapter(String fileName) {
		// TODO Auto-generated constructor stub
		this.movieList = new ExtendedMovieMediaList();
		this.fileName = fileName;
		load();
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		movieList.load(fileName);
		loaded = true;
	}

	@Override
	public boolean isLoaded() {
		// TODO Auto-generated method stub
		return loaded;
	}

	
	//Adaptee(MovieMediaList)에 구현이 안되어 있는 함수는 직접 구현 해야 한다.
	@Override
	public void print(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index >= movieList.getSize()) {
			System.out.println("잘못된 데이터를 출력하려고 합니다.");
		}else {
			MovieMedia mm = movieList.get(index);
			System.out.println(mm);
		}
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		movieList.printAll();		
	}

	@Override
	public int find(String str) {
		// TODO Auto-generated method stub
		for(int i = 0; i<movieList.getSize(); i++) {
			MovieMedia mm = movieList.get(i);
			if(mm.find(str))
				return i;
		}
		return -1;
	}
}
