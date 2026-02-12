public class Time{
  private int hours; 
  private int mins;

  public Time(int h, int m){
    if(h < 0 || h > 23|| || m < 0 || m > 59){
      throw new IllegalArugumentException("Invalid time: " + h + ":" + m);
    }
    hours = h;
    mins = m;
  }

  private int toMins(){
    return hours * 60 + mins;
  }

  private boolean lessThan(Time t){
    return this.toMins() < t.toMins();
  }

  public int elapsedSince(Time t){
    if(this.toMins() > t.toMins()) return this.toMins() - t.toMins();
    return (24 * 60 - t.toMins()) + this.toMins();
  }

  public String toString(){
    String hh = (hours < 10) ? "0" + hours : "" + hours;
    String mm = (mins < 10) ? "0" + mins : "" + mins;
    return hh + ":" + mm;
  }
}
