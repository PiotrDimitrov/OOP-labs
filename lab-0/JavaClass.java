public class RandomClass {

    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random integer between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Random Number: " + randomNumber);

        // Generate a random double between 0 and 1
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        // Generate a random boolean
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        // Generate a random long
        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);

        // Generate an array of random integers
        int[] randomArray = new int[5];
        for (int i = 0; i < 5; i++) {
            randomArray[i] = random.nextInt(10); // Generates random integers between 0 and 9
        }
        System.out.print("Random Array: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }
}