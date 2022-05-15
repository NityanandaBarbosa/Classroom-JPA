package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadLob {

	public byte[] getFoto(String path) throws IOException {
		File file = new File(path);
		byte [] foto = new byte[(int) file.length()];
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(file);
			fileInputStream.read(foto);
			fileInputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return foto;
	}

}
