public class TaskSix {
    public static void main(String[] args) {
	int i = 1;
	while (i <= 10) { 
		if (i % 4 == 0) {
			int multiple = i;
			for (int j = 0; j < 5; j++) {
				System.out.printf("%d ", multiple); 
				multiple = multiple * i; 
			}
		}
		i++;
	}
    }
}