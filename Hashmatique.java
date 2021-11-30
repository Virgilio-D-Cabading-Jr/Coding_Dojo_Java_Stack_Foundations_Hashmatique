import java.util.HashMap;

//  ///////////////////////////////////////////////////////////////
//  HASHMATIQUE APP
//  By: Virgilio D> Cabading Jr.    Created at: November 29, 2021 2315
//  ///////////////////////////////////////////////////////////////

public class Hashmatique {
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("HASHMATIQUE APP\n");

        HashMap<String, String> trackList = new HashMap<String, String>();      // Create an instance of tracklist
        
        System.out.println("*****************************************************");
        System.out.println("Add to trackList, 4 songs\n");
        trackList.put("Row, row, row, your boat", "Row, row, row your boat\nGently down the stream\nMerrily merrily, merrily, merrily\nLife is but a dream");
        trackList.put("Twinkle Twinkle", "Twinkle, twinkle, little star\nHow I wonder what you are\nUp above the world so high\nLike a diamond in the sky\nTwinkle, twinkle little star\nHow I wonder what you are");
        trackList.put("Itsy Bitsy Spider", "The itsy bitsy spider crawled up the water spout.\nDown came the rain, and washed the spider out.\nOut came the sun, and dried up all the rain,\nand the itsy bitsy spider went up the spout again");
        trackList.put("I'm a little tea pot", "I'm a little teapot,\nShort and stout,\nHere is my handle\nHere is my spout\nWhen I get all steamed up,\nHear me shout,\nTip me over and pour me out!");

        System.out.println("*****************************************************");
        System.out.println("The Lyrics of Twinkle Twinkle are: " + trackList.get("Twinkle Twinkle"));
        System.out.println("");

        
    }
}