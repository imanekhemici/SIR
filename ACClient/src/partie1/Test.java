package partie1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.awt.List;
public class Test {
	
	public static boolean recherche(String name, ArrayList<String>[] tab){
		boolean exist = false; 
		int longueur= tab.length;
		tab.
		
		for(int i=0; i<longueur;i++){
			if(tab[i].equals(name)){
				exist = true;
			}
		}
		
		return exist;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
			InputStream ips=new FileInputStream("Log-clients-themes.txt"); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String line;
			ArrayList<String> tableThemes = new ArrayList<String>();
			String[] table = null;
			FileWriter themes = new FileWriter (new File("themes.txt"));
			//FileWriter usagers = new FileWriter (new File("usagers.txt"));

			
			 while ((line=br.readLine())!= null){
				 System.out.println(line);
				 table =line.split(";");
				 System.out.println(table[2]);

				
				if(!recherche(table[2],tableThemes)){
					System.out.println(recherche(table[2],tableThemes));
					tableThemes.
					themes.write(table[2]);
					themes.write("\n");
					
				}
								
				
				//System.out.println(table[1]);
				//usagers.write(table[1]);
				//usagers.write("\n");
			}
			br.close(); 
			themes.close();
			//usagers.close();
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}


	}

}
