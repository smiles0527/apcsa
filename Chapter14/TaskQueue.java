import java.util.ArrayList;

public class TaskQueue {
    private ArrayList<Task> queue;

    public TaskQueue() {
        queue = new ArrayList<Task>();
    }

    public void addTask(Task t) {
        queue.add(t);
    }

    public int findInsertPosition(String newDesc) {
        for (int i = 0; i < queue.size(); i++) {
            String currentDesc = queue.get(i).getDescription();

            if (newDesc.length() < currentDesc.length()) {
                return i;
            }

            if (newDesc.length() == currentDesc.length() &&
                newDesc.compareTo(currentDesc) < 0) {
                return i;
            }
        }
        return queue.size();
    }

    public Task replaceLowPriority(int threshold, Task newTask) {
        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i).getPriority() < threshold) {
                return queue.set(i, newTask);
            }
        }
        return null;
    }

    public void printSummary() {
        System.out.println("Index Description          Priority");
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(i + "     " +
                               queue.get(i).getDescription() + "          " +
                               queue.get(i).getPriority());
        }
    }
}
