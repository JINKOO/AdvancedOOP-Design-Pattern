package example_code_adapter_pattern;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * ���Ϸ� ���� data ������ �о�ͼ� 
 * dataó��. �� �� MovieMediaManager Class�� �����Ѵ�.
 * 
 * �Ŀ� Target Adapter�� �ȴ�. 
 */
public class MovieMediaManagerFile implements MovieMediaManager {
    
	private BufferedReader reader;
    private MovieMedia movieMedia;
    private String fileName;
    private int numOfElements;
    private boolean loaded;

    public MovieMediaManagerFile() {
        numOfElements = 0;
        loaded = false;
    }

    public MovieMediaManagerFile(String fileName) {
        movieMedia = new MovieMedia();
        this.fileName = fileName;
    }

    private void openFile() {
        try {
            reader = new BufferedReader(new FileReader(fileName));
        }
        catch (FileNotFoundException e) {
            System.out.println(fileName + " doesn't exist in this folder");
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Error: marking the beginning of the media file");
            e.printStackTrace();
        }
    }


    private void closeFile() {
        try {
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error: closing the media file");
            e.printStackTrace();
        }
    }

    @Override
    public void load() {
        openFile();
        try {
            String s = reader.readLine();
            numOfElements = Integer.parseInt(s); // ���� �о����
        }
        catch (IOException e) {
            System.out.println("Error: reading the media file");
            e.printStackTrace();
        }
        closeFile();
        loaded = true;
    }

    @Override
    public boolean isLoaded() {
        return loaded;
    }

    @Override
    public void print(int index) {
        try {
            openFile();
            String s = reader.readLine();
            int nums = Integer.parseInt(s); // ���� �о����
            if (index < 0 || index >= nums) {
                System.out.println("�߸��� �����͸� ����Ϸ��� �մϴ�");
            }
            else {
                for (int i = 0; i <= index; i++) {
                    readMediaDatum(movieMedia);
                }
                System.out.println(movieMedia);
            }
            closeFile();
        }
        catch (IOException e) {
            System.out.println("Error: resetting the media file");
            e.printStackTrace();
        }
    }

    @Override
    public void printAll() {
        try {
            openFile();
            String s = reader.readLine();
            int nums = Integer.parseInt(s); // ���� �о����
            for (int i = 0; i < nums; i++) {
                readMediaDatum(movieMedia);
                System.out.println(movieMedia);
            }
            closeFile();
        }
        catch (IOException e) {
            System.out.println("Error: reading the media file");
            e.printStackTrace();
        }
    }

    @Override
    public int find(String str) {
        try {
            openFile();
            String s = reader.readLine();
            int nums = Integer.parseInt(s); // ���� �о����
            for (int i = 0; i < nums; i++) {
                readMediaDatum(movieMedia);
                if (movieMedia.find(str)) {
                    return i;
                }
            }
            closeFile();
        }
        catch (IOException e) {
            System.out.println("Error: reading the media file");
            e.printStackTrace();
        }
        return -1;
    }

    private void readMediaDatum(MovieMedia mm) {
        try {
            mm.setType(reader.readLine());
            mm.setTitle(reader.readLine());
            mm.setKoreanTitle(reader.readLine());
            mm.setDirector(reader.readLine());
            mm.setActors(reader.readLine());
            String s = reader.readLine();
            mm.setYear(Integer.parseInt(s));
            mm.setSubtitle(reader.readLine());
            mm.setFileName(reader.readLine());
            mm.setResolution(reader.readLine());
        }
        catch (IOException e) {
            System.out.println("Error: reading the media file");
            e.printStackTrace();
        }
    }
}
