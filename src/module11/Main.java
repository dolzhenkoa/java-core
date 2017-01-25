package module11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
		
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String, String>();
		map.put("path", "src/module11/test.txt");
	
		System.out.println(replacer(map));
		fileContentReplacer(map);
		fileContentMerger(map);
		System.out.println(checkWord(replacer(map)));
	}
	
	public static String replacer(Map<String, String> map) {
		String result="";
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream(new File((String) map.get("path")));
			int i=0;
			byte[] b = new byte[256];
            while((i=fis.read(b))!=-1){
            	result=result+new String(b);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result.replaceAll("dolor", "DOLOR");
	}

	public static File fileContentReplacer(Map<String, String> map) {
		FileOutputStream fos=null;
		File file=null;
		
		String data=replacer(map);
		
		try {
			file=new File((String) map.get("path"));
			fos=new FileOutputStream(file,false);
			fos.write(data.getBytes("UTF-8"));
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return file;
	}
	
	public static File fileContentMerger(Map<String, String> map) {
		FileOutputStream fos=null;
		File file=null;
		
		String data=replacer(map);
		
		try {
			file=new File((String) map.get("path"));
			fos=new FileOutputStream(file, true);
			fos.write("\n".getBytes());
			fos.write("\n".getBytes());
			fos.write(data.getBytes("UTF-8"));
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return file;
	}
	
	public static int checkWord(String word) {
		return (word.length() - word.replaceAll("amet","").length())/4;
	}
}
