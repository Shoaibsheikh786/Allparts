package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileLoad {
	
	FileReader browserInfoFile;
	
	public final Properties PropBrFile = new Properties();
	
	public Properties loadFile() throws IOException
	{ 
		browserInfoFile = new FileReader(
				System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
		PropBrFile.load(browserInfoFile);
		
		return PropBrFile;
		
	}

}
