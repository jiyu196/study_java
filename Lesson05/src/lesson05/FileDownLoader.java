package lesson05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownLoader {
	public static void main(String[] args) throws Exception {
		String img ="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMjRfMzYg%2FMDAxNzQyNzgyMjkxODYy.nmS2GAOA1wJQU6otynSfN4dxLKEb_qGzRVKNSsYbSwUg.njdPDRkv1BIF_JoBXBKFdLzhDfUqyrHfSodTzlttvlAg.PNG%2F110949.png&type=sc960_832";
		URL url = new URL(img);
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("img.png");
		
		int b = 0;
		while( (b = is.read()) != -1) {
			fos.write(b);
			
			
			
		}
		fos.close();
		
	}
}
