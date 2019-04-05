import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MACmapper {

	public static String mapMACtoIP(String MAC) {
		  String ip = null;
	    try {  
	      String line;  
	      Process p = Runtime.getRuntime().exec("arp -a");  
	      BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));  
	      
	      while ((line = input.readLine()) != null) {
	    	if (line.contains(MAC)) {
	    		ip = line.split(" ")[2];
	    		break;
	    	}
	      }  
	      input.close();
	      
	    }  
	    catch (Exception err) {  
	      err.printStackTrace();  
	    }
	    
	    return ip;
	  }  
}
