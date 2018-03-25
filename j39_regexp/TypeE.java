package j39_regexp;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TypeE {
    public static void main(String [] args){
        String str = "12323";
        String regex = "\\d+";
        Pattern pt = Pattern.compile(regex); //编译
        Matcher mat = pt.matcher(str);
        System.out.println(mat.matches());
    }
}
