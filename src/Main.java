import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> queue = new LinkedList<>();

        queue.addAll(firstClients);

        while (!queue.isEmpty()) {

            if (Math.random() < 0.5) { // проверка условия, которое срабатывает с 50% вероятностью
                System.out.println(queue.peek() + " сделала маникюр");
                queue.add("frends of " + queue.peek());
                System.out.println(queue.poll() + " порекомендовала друга");
            } else {
                System.out.println(queue.poll() + " сделала маникюр");
            }

        }
    }
}