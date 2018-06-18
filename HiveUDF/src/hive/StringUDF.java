package hive;

import java.util.ArrayList;
import org.apache.hadoop.hive.ql.exec.UDF;

public class StringUDF extends UDF{
	public String evaluate(String sep,ArrayList<String> arr) {
		String res = "";
		if(sep==null || arr==null) {
			return null;
		}
		for(int i=0;i<arr.size()-1;i++) {
			res = res+arr.get(i)+sep;
		}
		res = res+arr.get(arr.size()-1);
		return res;
		
	}
}

