public void addPackages(String[] ids, double[] weights, boolean[] priorities) {
    for (int k = 0; k < ids.length; k++) {
        Package p = new Package(ids[k], weights[k], priorities[k]);
        if (priorities[k]) {
            packageList.add(0, p);
        } else {
            packageList.add(p);
        }
    }
}

public ArrayList<Package> purgeHeavyPackages(double maxWeight) {
    ArrayList<Package> removed = new ArrayList<Package>();

    int k = 0;
    while (k < packageList.size()) {
        if (packageList.get(k).getWeight() > maxWeight) {
            removed.add(packageList.remove(k));
        } else {
            k++;
        }
    }

    return removed;
}

