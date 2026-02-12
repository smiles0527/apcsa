public ArrayList<String> getHighRangeVehicles(int target){
  ArrayList<string> result = new ArrayList<String>();
  for(ElectricVehicle ev : vehicleList)
    if(ev.getRange() > target && !result.contains(ev.getModelName())) result.add(ev.getModelName());
  retur result;
}

public double avgTeenAccounts(){
  int cnt = 0; double total = 0;
  for(GameAccount x : allPlayers)
    if(13 < x.getAge() < 19){ cnt++; total += x.getAge();}
  
  return total / cnt;
}

public String playerWithClosestScore(int targetScore){
  String bestVal = null; int bestDiff = Integer.MAX_VALUE;
  for(Map.Entry<String, integer> entry : playerList.entrySet()){
    if((Math.abs(entry.getValue() - targetScore) < bestDiff){
      bestDiff = diff; bestVal = entry.getKey();
    }
  }
  return bestVal;
}

public int getLongestHomeWinStreak(){
  int best = 0, cur = 0;
  for(Game g : allGames){
    if(g.getGameScore() > g.getAwayScore()){cur++; if(cur>best) best = cur;}
    else cur = 0;
  }
  return best; 
}
