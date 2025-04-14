public class VidMain {
    public static void main(String[] args) {
        YouTubeVideoTest(args);
    }
    public static void YouTubeVideoTest(String[] args) {
        Vid[] videos = {
            new Vid("Learning Java in 10 Minutes (Impossible Challenge!)", "CodeCrafted", 11),
            new Vid("Python vs. Java: The Ultimate Showdown!", "Pixel Phantom", 30),
            new Vid("A Day in My Life as a College Student", "Glitch Hunters", 20),
            new Vid("I Let an AI Control My Life for 24 Hours", "GameOverload", 29),
            new Vid("Testing the WEIRDEST Gadgets on the Internet", "The Daily Vibe", 22)
        };
        for (int x=0; x<videos.length; x++) {
            videos[x].like();
            videos[x].dislike();
            videos[x].addComment("This video is so cool.");
            videos[x].addComment("This video is super lame.");
            System.out.println(videos[x]);
        }
    }
}
