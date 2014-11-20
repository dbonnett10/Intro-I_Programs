import java.io.File;
import java.io.IOException;

import org.jfugue.Note;
import org.jfugue.Pattern;
import org.jfugue.PatternTransformer;
import org.jfugue.Player;
import org.jfugue.extras.ReversePatternTransformer;
import java.util.Scanner;

public class FrereJacques
{
    public static void main(String[] args)
    {

        int repeats;


        // "Frere Jacques"
        Pattern pattern1 = new Pattern("C5q D5q E5q C5q");

        // "Dormez-vous?"
        Pattern pattern2 = new Pattern("E5q F5q G5h");

        // "Sonnez les matines"
        Pattern pattern3 = new Pattern("G5i A5i G5i F5i E5q C5q");

        // "Ding ding dong"
        Pattern pattern4 = new Pattern("C5q G4q C5h");

        // Put all of the patters together to form the song
        Scanner scan = new Scanner(System.in);
        Pattern song = new Pattern();
        song.add(pattern1, 2); // Adds 'pattern1' to 'song' twice
        song.add(pattern2, 2); // Adds 'pattern2' to 'song' twice
        song.add(pattern3, 2); // Adds 'pattern3' to 'song' twice
        song.add(pattern4, 2); // Adds 'pattern4' to 'song' twice

        System.out.println("How many times would you like to play the song?");
        repeats = scan.nextInt();

        // Play the song!
        Player player = new Player(); player.play(song);

        //Create a new song
        Pattern song2 = new Pattern();

        for (int count=0; count<=repeats; count++){
        song2.add(pattern1, 2); // Adds 'pattern1' to 'song' twice
        song2.add(pattern2, 2); // Adds 'pattern2' to 'song' twice
        song2.add(pattern3, 2); // Adds 'pattern3' to 'song' twice
        song2.add(pattern4, 2); // Adds 'pattern4' to 'song' twice
        }

        try {
            player.saveMidi(song, new File("frerejacues.mid"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        player.close();
    }

}






