public boolean sleepIn(boolean weekday, boolean vacation) {
  return !weekday || vacation;
}
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return ((aSmile && bSmile) || (!aSmile && !bSmile));
}
public int sumDouble(int a, int b) {
  return a == b? 2 * (a+b) : a+b;
}
public int diff21(int n) {
  return n > 21 ? 2 * Math.abs(n - 21) : Math.abs(n-21);
}
public boolean parrotTrouble(boolean talking, int hour) {
  return talking && (hour < 7 || hour > 20);
}
public boolean makes10(int a, int b) {
  return a + b == 10 || a == 10 || b == 10;
}
public boolean nearHundred(int n) {
  return Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10;
}
public boolean posNeg(int a, int b, boolean negative) {
  return negative ? (a < 0 && b < 0) : (a < 0 && b > 0) || (a > 0 && b < 0);
}
public String notString(String str) {
  return str.length() >= 3 && str.substring(0, 3).equals("not") ? str : "not " + str;
}
public String missingChar(String str, int n) {
  return str.substring(0, n) + str.substring(n+1, str.length());
}
public String frontBack(String str) {
 return str.length()<=1 ? str : str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0);
}
public String front3(String str) {
  return str.length()<3 ? str+str+str: str.substring(0, 3)+str.substring(0, 3)+str.substring(0, 3);
}
public String backAround(String str) {
  return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
}
public boolean or35(int n) {
  return n%3==0 || n%5==0;
}
public String front22(String str) {
  return str.length()<2? str.substring(0,str.length())+str+str.substring(0,str.length()) :str.substring(0,2) + str + str.substring(0,2);
}
public boolean startHi(String str) {
  return str.startsWith("hi");
}
public boolean icyHot(int temp1, int temp2) {
  return (temp1<0&&temp2>100) || (temp2<0&&temp1>100);
}
public boolean in1020(int a, int b) {
  return 10<=a&&a<=20 || 10<=b&&b<=20;
}
public boolean hasTeen(int a, int b, int c) {
    return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
}
public boolean loneTeen(int a, int b) {
    return (a > 12 && a < 20) ^ (b > 12 && b < 20);
}
public String delDel(String str) {
  return str.length() >= 4 && str.substring(1,4).equals("del")
         ? str.substring(0,1) + str.substring(4)
         : str;
}
public boolean mixStart(String str) {
  return str.contains("ix");
}
public String startOz(String str) {
  return (str.length()>0 && str.charAt(0)=='o' ? "o" : "") +
         (str.length()>1 && str.charAt(1)=='z' ? "z" : "");
}
public int intMax(int a, int b, int c) {
  return Math.max(a, Math.max(b,c));
}
public int close10(int a, int b) {
  return Math.abs(a-10)==Math.abs(b-10) ?0: (Math.abs(a-10)<Math.abs(b-10)?a:b);
}
public boolean in3050(int a, int b) {
  return 40<=a&&a<=50&&40<=b&&b<=50||30<=a&&a<=40&&30<=b&&b<=40;
}
public int max1020(int a, int b) {
  return (a>=10&&a<=20&&b>=10&&b<=20) ? Math.max(a,b) :
         (a>=10&&a<=20) ? a :
         (b>=10&&b<=20) ? b : 0;
}
public boolean stringE(String str) {
  int count = 0;
  for(int i=0;i<str.length();i++) if(str.charAt(i)=='e') count++;
  return 1 <= count && count <= 3;
}
public boolean lastDigit(int a, int b) {
  return a%10 == b%10;
}
public String endUp(String str) {
  return str.length() <= 3 ? str.toUpperCase() :
         str.substring(0, str.length()-3) +
         str.substring(str.length()-3).toUpperCase();
}
public String everyNth(String str, int n) {
  String ans = "";
  for(int i=0;i<str.length();i+=n){
    ans+=str.charAt(i);
  }
  return ans;
}
