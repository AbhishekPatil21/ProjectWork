import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class SessionIdentification1 {

	
	public static void main(String[] args) throws IOException, ParseException{
		
		
		 File rs=new File("files.txt");
		   // BufferedWriter writer=new BufferedWriter(new FileWriter(new File("web_log.txt")));
		    SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy:HH:mm:ss");
		    	FileInputStream fr =new FileInputStream("files.txt");
		    String line;
		    ArrayList UserList=new ArrayList();
		    while ((line=rs.getName())){
		    	
		    	boolean commonAgent = false;
		    	String IPList;
				if(!IPList.contains(((Object) rs).getString("IP")))
				{
		    		IPList.add(rs.getString("IP"));
		    		int UserID;
					 User = new User(rs,++UserID);
					UserList.add(User);
		    	}
				else{
					for(int i=0;i<UserList.size();i++){
						if(writer.getString("ip").equals(UserList.get(i).getLog().getUserAgent()){
							if(rs.getString("uri").equals(UserList.get(i).getLog())){
								commonAgent=true;
								break;
							}
						}
					}
					int UserID;
					if(!commonAgent){
						User=new User(rs,++UserID);
						UserList.add(User);
					}
					else if(rs.getString("refer").equals("-")){
					DateFormat df;
					long t1=df.parse(rs.getString("time")).getTime();
					long t2=0;
					for(int i=UserList.size()-1;i>0;i--)
					{
						t2=df.parse(UserList.get(i).getLog().getTime()).getTime();
						
						if(!rs.getString("uri").equals(UserList.get(i).getLog()))
						{
							User=new User(rs,++UserID);
							UserList.add(User);
							break;
						}
						else
						{
							if(rs.getString("uri").equals(UserList.get(i).getLog().getCs_uri_stem()) && t1-t2>TIME)
							{
								User =new User (rs,++UserID);
								UserList.add(User);
								break;
							}
							else
								if(rs.getString("url").equals(UserList.get(i).getLog().getCs_uri_stem())&& (t1-t2<=TIME))
									break;
							
						}
					}
						
						
						
					}
				}
				//return UseList;
		    }
	}

}
