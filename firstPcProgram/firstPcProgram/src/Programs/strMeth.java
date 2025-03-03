package Programs;

public class strMeth {
    public static void main(String[] args) {
        
        
        String name = "Neil Wayne";
        String state1 = "POGI AKO BRO";
        String state2 = "            LUKA GOT TRADED OMG         ";
        String name2 = "";
        // .length()
        System.out.println(name.length());
        // .charAt()
        System.out.println(name.charAt(2));
        //indexOf()
        System.out.println(name.indexOf("a"));
        // name.lastIndexOf()
        System.out.println(name.lastIndexOf("e"));

        System.out.println(name.toUpperCase()); //uppercase the "Neil Wayne"
        System.out.println(state1.toLowerCase()); // lowercase the "POGI AKO BRO";
        System.out.println(state2.trim()); // trim all the whitespaces in "            LUKA GOT TRADED OMG         ";
        // .replace(" "," ")
        System.out.println(name.replace("e", "a")); 
        // .isEmpty()
        System.out.println(name2.isEmpty()); 

        System.out.println(name.equals("neil wayne"));

        System.out.println(name.equalsIgnoreCase("neil wayne"));

    }
}
