package com.maventossm.vip.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String formatDate(Date date,String format){
		String result="";
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		if(date!=null){
			result=sdf.format(date);
		}
		return result;
	}
	
	
	public static Timestamp getCurrentTimestamp(){
		Timestamp creTime = Timestamp.valueOf(new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss").format(new Date()));
		return creTime;
	}
}
