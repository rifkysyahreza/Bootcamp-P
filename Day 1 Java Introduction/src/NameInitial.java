public class NameInitial {
    public static void  execute(String name){
        String regex = "[\\s]";

        String[] myArray = name.split(regex);

        for (int i=0; i < myArray.length; i++) {
            System.out.print(myArray[i].charAt(0));
        }
    }
}
