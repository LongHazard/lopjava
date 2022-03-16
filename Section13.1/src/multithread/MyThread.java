package multithread;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Dos();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void Dos() throws IOException { // URL url = new
											// URL("http://qldt.utt.edu.vn/CMCSoft.IU.Web.info/login.aspx");
		URL url = new URL("https://www.24h.com.vn/");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		for (int i = 0; i < urlCon.getHeaderFields().size(); i++) {
			System.out.println(urlCon.getHeaderFieldKey(i) + "=" + urlCon.getHeaderField(i));
		}
	}

}
