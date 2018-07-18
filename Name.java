import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Name{
public static void main(String[] args){
Pattern compile=Pattern.compile("[0-9]{2}[a-zA-Z]{2}[0-9][a-zA-Z][0-9]{4}");
Matcher matcher=compile.matcher("17EM5A0503");
while(matcher.find())
{
System.out.println(matcher.group());
}
}
}
