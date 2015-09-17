package partie1;
import java.io.*;

public class Analyse {
	
	public void readFile(String nameFile){
		
		try{
			InputStream ips=new FileInputStream(nameFile); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String line;
			String[] table;
			FileWriter themes = new FileWriter (new File("themes.txt"));
			FileWriter usagers = new FileWriter (new File("usagers.txt"));

			 while ((line=br.readLine())!=null){
				table =line.split(";");
				themes.write(table[2]);
				themes.write("\n");
				
				usagers.write(table[1]);
				usagers.write("\n");
			}
			br.close(); 
			themes.close();
			usagers.close();
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
	}
	
	public void main(String[] args){
		
		readFile("Log-clients-themes.txt");
	}

}
