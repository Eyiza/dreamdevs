package FireDrill1;

public class TaskEight {
    public static void main(String[] args) {
	int i = 1;
	int totalSum = 0;
	while (i <= 10) { 
		if (i % 4 == 0) {
			int multiple = i;
			int pairSum = 0;
			for (int j = 0; j < 5; j++) {
				pairSum = pairSum + multiple;
				multiple = multiple * i; 
			}
			totalSum = totalSum + pairSum;
		}
		i++;
	}
	System.out.printf("%d ", totalSum); 
    }
}