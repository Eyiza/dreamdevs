public class TaskSeven {
    public static void main(String[] args) {
	int i = 1;
	while (i <= 10) { 
		if (i % 4 == 0) {
			int multiple = i;
			int pairSum = 0;
			for (int j = 0; j < 5; j++) {
				pairSum = pairSum + multiple;
				multiple = multiple * i; 
			}
			System.out.printf("%d ", pairSum); 
		}
		i++;
	}
    }
}