import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Choose a theme: Jungle, Snow Day, or Camping");
        String choice = sc.nextLine();

        if (choice.equals("Jungle")) {
            System.out.println("Pick an adjective");
            String word1 = sc.nextLine();

            System.out.println("Pick an adjective");
            String word2 = sc.nextLine();

            System.out.println("Pick an adjective");
            String word3 = sc.nextLine();

            System.out.println("Pick a noun");
            String word4 = sc.nextLine();

            System.out.println("Pick an verb");
            String word5 = sc.nextLine();

            System.out.println("Pick a noun");
            String word6 = sc.nextLine();


            System.out.println("Pick a verb");
            String word7 = sc.nextLine();


            System.out.println("Pick a noun");
            String word8 = sc.nextLine();

            System.out.println("I walk through the color jungle. There's a " +
                    word1 + " parrot  in front of me in the " +
                    word2 + " trees! I gaze at his " + word3 +
                    " A sudden sound awakes me from my daydream! A panther " + word4 + " in front of my head! . I remember I have a packet of " + word5 +
                    " that makes it go into a deep slumber! I " + word6 + " it " + word7 +
                    " away in front of the " + word8 + " and save my life");


        }
        if (choice.equals("Snow Day")) {
            System.out.println("Pick an noun");
            String word1 = sc.nextLine();

            System.out.println("Pick a drink");
            String word2 = sc.nextLine();

            System.out.println("Pick a noun");
            String word3 = sc.nextLine();

            System.out.println("Pick a food");
            String word4 = sc.nextLine();

            System.out.println("Pick an noun");
            String word5 = sc.nextLine();

            System.out.println("Pick a movie");
            String word6 = sc.nextLine();


            System.out.println("Pick a game");
            String word7 = sc.nextLine();


            System.out.println("Pick a adjective");
            String word8 = sc.nextLine();

            System.out.println("Today school was cancled because of too much " + word1 + ". In the morning, we drank " + word2 + ". After that " +
                    " we went outside and played in all of the new " + word3 + ". Then we went inside and ate " + word4 +
                    ". After that, we went back outside and had a " + word5 + ", until everyone got too cold. Then we watched " + word6 +
                    " which made everyone laugh. After that we played " + word7 + " with our family. Overall, it was a " + word8 + " day ");

        }
        if (choice.equals("Camping")) {
            System.out.println("Pick an noun");
            String word1 = sc.nextLine();

            System.out.println("Pick a food");
            String word2 = sc.nextLine();

            System.out.println("Pick a animal");
            String word3 = sc.nextLine();

            System.out.println("Pick the same food as before");
            String word4 = sc.nextLine();

            System.out.println("Pick an name");
            String word5 = sc.nextLine();

            System.out.println("Pick the same animal as before");
            String word6 = sc.nextLine();


            System.out.println("Pick a verb");
            String word7 = sc.nextLine();


            System.out.println("Pick a food");
            String word8 = sc.nextLine();

            System.out.println("This summer I went " + word1 + " with all of my friends. Our first night, we made " +
                    word2 + " over the fire. The next morning, we woke up to an " + word3 + " walking around the campsite!"
                    + " All of us were very surprised. We figured out that it was eating the " + word4 + " from last night. " +
                    word5 + " screamed when they saw the " + word6 + " which luckily scared off the animal.After that," +
                    " we went " + word7 + " in the forest. After we were done, we went back to the tent and began to clean it " +
                    "up but not before one more " + word8 + " of the summer."
            );


        }
    }

}
