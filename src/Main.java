public class Main {
    public static void main(String[] args) {

    }

    public static String ageAndTemperature(String name, int age, int temperature) {
        ageAndTemperature("John", 54, 23);
        String Stay = "stay at home";
        System.out.println("Выживший" + Stay+ ".");

        if (age > 15 && age < 45 && temperature > -10 && temperature < 30) ;
        {
            if (age > 15 && age < 45 && temperature < 5) {
                System.out.println("go walking");
            }
            if (age > 45 && temperature >= -7 && temperature <= 10) {
                System.out.println("go walking");
            }
            if (age < 15 && temperature > -10 || temperature <= 25) {
                System.out.println("go walking");
            }
            if ((age > 45) && (temperature >= -10) && (temperature <= 16)) {
                System.out.println("stay at home");

            }return Stay;
        }

    }

}