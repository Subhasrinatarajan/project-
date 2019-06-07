# project
package filewritingreading;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateJSONFile {

 public static void main(String[] args) throws JSONException 
	{
	
	    JSONObject obj=new JSONObject();
		obj.put("Student Name", "subha");
		obj.put("Email", "subhasri@gmail.com");
		obj.put("Institute Name", "KOM school");
		try {
			obj.put("Total _Mark", "1015");
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		obj.put("cut_off", "85%");
		
		JSONArray list= new JSONArray();
		list.put("Nehru street");
		list.put("kavilipalayam(po)");
		list.put("kavilipalayam");
		obj.put("Address",list);
		FileWriter fw=null;
		try
		{
			fw=new FileWriter("myJSON.json");
			fw.write(obj.toString());
			fw.flush();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(obj);
	}
}

