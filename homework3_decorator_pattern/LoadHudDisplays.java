package homework3_decorator_pattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class LoadHudDisplays implements LoadDisplayInterface {

	private File file;
//	private String fileName;
	private ArrayList<String> list;
	
	public LoadHudDisplays(String fileName) {
		this.file = new File(fileName);
		this.list = new ArrayList<>();
	}
	
	@Override
	public ArrayList<String> load() {
		
		try {
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line = "";
			
			while((line = buffer.readLine()) != null) {
				list.add(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
