package com.demo.qa.until;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DBUtilsCSV {
   public static Object[][]getTestData(String fileName)throws IOException{
	   List<Object[]> records = new ArrayList<Object[]>();
	   String record;
	   BufferedReader file = new BufferedReader(new InputStreamReader(DBUtilsCSV.class.getClassLoader().getResourceAsStream(fileName),"UTF-8"));
	   file.readLine();
	   while ((record=file.readLine())!=null){
	   String fields[]=record.split(",");
	   records.add(fields);
	   }
	   file.close();
	   Object[][] results = new Object[records.size()][];
	   for(int i = 0; i < records.size(); i++ ){
		   results[i] = records.get(i);
	   }
	   return results;
   }
  
   
}
