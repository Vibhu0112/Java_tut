import java.util.ArrayList;
public class DuplicateCharCountingUsingRecursion {
static ArrayList<Character> ans= new ArrayList<>();
static int index=0;
static int nextIndex=1;
static int count=1;
public static void main(String[] args) {
String string="issssiiipi";
ArrayList<Character> ch1= characters(string);
printCountOfCharacters(ch1);
}
public static ArrayList<Character> characters(String s){
return helper(s,index);
}
public static ArrayList<Character> helper(String s, int index){
if(index==s.length())
{
return ans;
}
if(index==s.length()-1 && index==nextIndex) {
index=0;
return ans;
}
if(nextIndex==s.length()){
nextIndex=0;
return helper(s,++index);
}
if(index==nextIndex) {
++nextIndex;
return helper(s, index);
}
if(s.charAt(index)==s.charAt(nextIndex) && index>nextIndex)
{
nextIndex=0;
return helper(s,++index);
}
else if(s.charAt(index)==s.charAt(nextIndex))
{
ans.add(s.charAt(index));
nextIndex++;
return helper(s,index);
}
else {
++nextIndex;
return helper(s,index);
}
}
public static void printCountOfCharacters(ArrayList<Character> ch1){
if(index<ch1.size()-1) {
if(ch1.get(index) == ch1.get(index + 1)) {
++count;
} else {
System.out.println(ch1.get(index) + " has occurred " + (count+1) );
count = 1;
}
++index;
printCountOfCharacters(ch1);
}
else
{ System.out.println(ch1.get(index) + " has occurred " + (count+1) + " times ");
}
}
}
