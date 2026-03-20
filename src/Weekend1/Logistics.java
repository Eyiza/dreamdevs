package Weekend1;

public class Logistics {
    static final int BASE_PAY = 5000;

    public static int calculateDailyWage(int successfulDelivery){
        int amountPerParcel = 0;

        if (successfulDelivery < 0) {System.out.printf("%d is invalid%n", successfulDelivery); return 0;}
        else if (successfulDelivery < 50) amountPerParcel = 160;
        else if (successfulDelivery < 59) amountPerParcel = 200;
        else if (successfulDelivery < 69) amountPerParcel = 250;
        else if (successfulDelivery <= 100) amountPerParcel = 500;
        else {System.out.printf("%d is invalid%n", successfulDelivery); return 0;}

        return (successfulDelivery * amountPerParcel) + BASE_PAY;
    }
}
