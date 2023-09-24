public class RandomClass {

    public static void main(String[] args) {
        
        Random random = new Random();

        
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Random Number: " + randomNumber);

        
        double randomDouble = random.nextDouble();
        System.out.println("Random Double: " + randomDouble);

        
        boolean randomBoolean = random.nextBoolean();
        System.out.println("Random Boolean: " + randomBoolean);

        
        long randomLong = random.nextLong();
        System.out.println("Random Long: " + randomLong);

        
        int[] randomArray = new int[5];
        for (int i = 0; i < 5; i++) {
            randomArray[i] = random.nextInt(10); 
        }
        System.out.print("Random Array: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }
}