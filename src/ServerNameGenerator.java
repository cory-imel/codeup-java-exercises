public class ServerNameGenerator {
    private static String adjectives[] =  {"miscreant",
                                    "imaginary",
                                    "accidental",
                                    "zesty",
                                    "nondescript",
                                    "skillful",
                                    "late",
                                    "complex",
                                    "frightening",
                                    "quiet"};
    private static String nouns[] = {"engine",
                              "van",
                              "basketball",
                              "reward",
                              "mass",
                              "step",
                              "lettuce",
                              "trip",
                              "girls",
                              "sneeze"};

    private static String GetRandomElement(String[] array){
            int index = (int)(Math.random() * ((10 - 1) + 1)) + 1;
            return array[index];
    }

    public static void main(String[] args) {
        System.out.println("Your server name is: ");
        System.out.println(GetRandomElement(adjectives) + "-" + GetRandomElement(nouns));
    }
}
