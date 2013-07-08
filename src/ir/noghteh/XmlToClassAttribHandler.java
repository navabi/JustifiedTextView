package ir.noghteh;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

public class XmlToClassAttribHandler {
	
	public static String GetAttributeStringValue(Context context, AttributeSet attrs, String namespace, String name, String defaultValue)   
    {  
        //Get a reference to the Resources  
        Resources res = context.getResources();  
        //Obtain a  String from the attribute  
        String stringValue = attrs.getAttributeValue(namespace, name);  
        //If the String is null   
        if(stringValue == null)  
        {  
            //set the return String to the default value, passed as a parameter  
            stringValue = defaultValue;  
        }  
        //The String isn't null, so check if it starts with '@' and contains '@string/'  
        else if( stringValue.length() >=1 &&   
                 stringValue.charAt(0) == '@' &&   
                 stringValue.contains("@string/") ||
                 stringValue.contains("@color/") ||
                 stringValue.contains("@dimen/") )   
        {  
            //Get the integer identifier to the String resource  
            final int id = res.getIdentifier(context.getPackageName() + ":" + stringValue.substring(1), null, null);  
            //Decode the string from the obtained resource ID  
            stringValue = res.getString(id);  
        }   
        //Return the string value  
        return stringValue;  
    }  

}
