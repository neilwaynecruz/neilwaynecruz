public class switchCaseStatement {
    public static void main(String[] args) {
        animalSpeakConditional("cow");
        animalSpeakSwitch("pig");
        animalSpeakSwitch("dog");
    }
    
    public static void animalSpeakConditional (String animal){
        if (animal.equals("cow")) {
            System.out.println("Mooo");
        } else if (animal.equals("pig")) {
            System.out.println("Oink");
        } 
        // Add another else-if conditional to check for a dog
        else if (animal.equals("dog")) {
            System.out.println("Woof");
        }
    }
    
    public static void animalSpeakSwitch (String animal) {
        switch (animal) {
            case "cow":
                System.out.println("Mooo");
                break;
            case "pig":
                System.out.println("Oink");
                break;
            // Add another case to check for a dog
            case "dog":
                System.out.println("Woof");
                // Stop the case
                break;
        }
    }

}
