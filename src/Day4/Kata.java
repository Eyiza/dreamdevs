package Day4;

public class Kata {
    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) sum += number;
        return sum;
    }

    public enum FoodSchedule {
        MONDAY("Rice and Stew", "Eba and Egusi"),
        TUESDAY, WEDNESDAY, THURSDAY,  FRIDAY, SATURDAY, SUNDAY;

        private String[] food;

        FoodSchedule(String... foods) {
            System.out.println("I am creating "+ this.name());
            food = foods;
        }

        public String[] getFood() {
            return food;
        }

        public void setFood(String[] food) {
            this.food = food;
        }
    }
}
