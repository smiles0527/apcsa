public class StepTracker{
  private int minSteps;
  private int totalSteps;
  private int numDays;
  private int activeDays;

  public StepTracker(int minSteps){
    this.minSteps = minSteps;
    totalSteps = 0;
    numDays = 0;
    activeDays = 0;
  }

  public void addDailySteps(int steps){
    totalSteps += steps;
    numDays++;
    if(steps >= minSteps) activeDays++;
  }
  
  public int activeDays(){
    return activeDays;
  }

  public double averageSteps(){
    if(numDays == 0){
      return 0.0;
    }
    return (double) totalSteps / numDays;
  }

}
