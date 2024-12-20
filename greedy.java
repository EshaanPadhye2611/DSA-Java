import java.util.*;

class Task {
    int cost;
    int time;

    public Task(int cost, int time) {
        this.cost = cost;
        this.time = time;
    }
}

public class greedy {

    // Function to find the minimum cost using a greedy approach
    public static int minimizeCost(List<Task> tasks, int deadline) {
        // Sort tasks based on the ratio of cost to time (cost per unit time)
        tasks.sort((t1, t2) -> (t1.cost * t2.time) - (t2.cost * t1.time));

        int totalTime = 0;
        int totalCost = 0;

        for (Task task : tasks) {
            // Check if the task can be completed within the remaining deadline
            if (totalTime + task.time <= deadline) {
                totalTime += task.time;
                totalCost += task.cost;
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of tasks
        System.out.print("Enter the number of tasks: ");
        int numTasks = sc.nextInt();

        // Create a list of tasks
        List<Task> tasks = new ArrayList<>();

        // Get task details (cost, time) from the user
        for (int i = 0; i < numTasks; i++) {
            System.out.print("Enter cost for task " + (i + 1) + ": ");
            int cost = sc.nextInt();
            System.out.print("Enter time for task " + (i + 1) + ": ");
            int time = sc.nextInt();
            tasks.add(new Task(cost, time));
        }

        // Input deadline
        System.out.print("Enter the deadline (maximum time to complete tasks): ");
        int deadline = sc.nextInt();

        // Find the minimum cost to complete the project within the deadline
        int minCost = minimizeCost(tasks, deadline);

        System.out.println("Minimum cost to complete the project: " + minCost);
    }
}
