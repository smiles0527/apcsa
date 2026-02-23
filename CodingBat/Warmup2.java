public String stringTimes(String str, int n) {
  String ans="";
  for(int i=0;i<n;i++) ans+=str; 
  return ans;
}
public String frontTimes(String str, int n) {
  String front = str.substring(0, Math.min(3, str.length()));
  String result = "";
  for (int i = 0; i < n; i++)
    result += front;
  return result;
}
public int countXX(String str) {
  int count=0;
  for(int i=0;i<str.length()-1;i++){
    if(str.substring(i,i+2).equals("xx"))count++;
  }
  return count;
}
public boolean doubleX(String str) {
  int i=str.indexOf("x"); if(i==-1)return false;
  String x = str.substring(i);
  return x.startsWith("xx");
}
public String stringBits(String str) {
  String ans="";
  for(int i=0;i<str.length();i+=2)ans+=str.charAt(i);
  return ans;
}
public String stringSplosion(String str) {
  String ans ="";
  for(int i=0;i<=str.length();i++){
      ans+=str.substring(0,i);
  }
  return ans;
}
public int last2(String str) {
  if(str.length()<2)return 0;
  String s=str.substring(str.length()-2);
  int count=0;
  for(int i=0;i<str.length()-2;i++)
    if(str.substring(i,i+2).equals(s))count++;
  return count;
}
public int arrayCount9(int[] nums) {
  int c=0;
  for(int x:nums)if(x==9)c++;return c;
}
public boolean arrayFront9(int[] nums) {
  int x=Math.min(4,nums.length);
  for(int i=0;i<x;i++)if(nums[i]==9)return true;
  return false;
}
public boolean array123(int[] nums) {
  for(int i=0;i<nums.length-2;i++)if(nums[i]==1&&nums[i+1]==2&&nums[i+2]==3) return true;
  return false;
}
public int stringMatch(String a, String b) {
  int count=0;
  int len=Math.min(a.length(),b.length());
  for(int i=0;i<len-1;i++)if(a.substring(i,i+2).equals(b.substring(i,i+2)))count++;
  return count;
}
public String stringX(String str) {
  if(str.length()<=2)return str;
  String result = str.substring(0,1);
  for(int i=1;i<str.length()-1;i++)if(str.charAt(i)!='x')result+=str.charAt(i);
  result+=str.substring(str.length()-1);return result;
}
public String altPairs(String str) {
  String result="";
  for(int i=0;i<str.length();i+=4)result+=str.substring(i,Math.min(i+2,str.length()));
  return result;
}
public String stringYak(String str) {
  String result="";
  for(int i=0;i<str.length();){
    if(i+2<str.length()&&str.charAt(i)=='y'&&str.charAt(i+2)=='k')i+=3;
    else{result+=str.charAt(i);i++;}
  }
  return result;
}
public int array667(int[] nums) {
  int count=0;
  for(int i=0;i<nums.length-1;i++)if(nums[i]==6&&(nums[i+1]==6||nums[i+1]==7))count++;
  return count;
}
public boolean noTriples(int[] nums) {
  for(int i=0;i<nums.length-2;i++)if(nums[i]==nums[i+1]&&nums[i+1]==nums[i+2])return false;
  return true;
}
public boolean has271(int[] nums) {
  for(int i=0;i<nums.length-2;i++){
    int v=nums[i];
    if(nums[i+1]==v+5&&Math.abs(nums[i+2]-(v-1))<=2) return true;
  }
  return false;
}
