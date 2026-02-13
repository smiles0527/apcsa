public class SignedText{
  public String firstName;
  private String lastName

  public SignedText(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }

  
  public String getSignature(){
    if(firstName.equals("")){
      return lastName;
    } else {
      return firstName.substring(0, 1) + "-" + lastName;
    }
  }

  public String addSignature(String str){
    String sig = getSignature();

    if(str.indexOf(sig) == -1){
      return str + sig;
    } else if (str.endsWith(sig)){
      return sr;
    } else if (str.startsWith(sig)){
      return str.substring(sig.length()) + sig;
    } else{
      return str;
    }
  }
}
