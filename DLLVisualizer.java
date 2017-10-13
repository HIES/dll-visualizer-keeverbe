import bridges.connect.Bridges;
import bridges.connect.Bridges;
import bridges.base.DLelement;
/**
 * A class that utilizes the BRIDGES library to visualize a doubly-linked list.
 *
 * @author (Ben Keever)
 */
public class DLLVisualizer
{
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{

        // TO DO: Define credentials
        final String API_KEY = "1040813283922";
        final String USER_ID = "keeverbe";
        
        // No need to modify Bridges constructor
        Bridges bridge = new Bridges(1, API_KEY, USER_ID);

        // TO DO: Build the objects to be added to your DLL
        Track track1 = new Track ("Bohemian Rapsody", "Queen");
        Track track2 = new Track ("Another One Bites the Dust", "Queen");
        Track track3 = new Track ("Killer Queen", "Queen");
        Track track4 = new Track ("Don't Stop Me Now", "Queen");
        Track track5 = new Track ("We are the Champions", "Queen");
        
        // TO DO: Build the head 
        DLelement<Track> head = new DLelement<Track>(track1.toString(), track1);
       
        
        // TO DO: Create the rest of the Nodes/DLelements and link them to form a DLL
        DLelement<Track> song2 = new DLelement<Track>(track2.toString(), track2);
        DLelement<Track> song3 = new DLelement<Track>(track3.toString(), track3);
        DLelement<Track> song4 = new DLelement<Track>(track4.toString(), track4);
        DLelement<Track> song5 = new DLelement<Track>(track5.toString(), track5);
        
        head.setNext(song2);
        head.setPrev(song5);
        
        song2.setNext(song3);
        song2.setPrev(head);
        
        song3.setNext(song4);
        song3.setPrev(song2);
        
        song4.setNext(song5);
        song4.setPrev(song3);
        
        song5.setNext(head);
        song5.setPrev(song4);
        
        
        //Prepare for visualization
        bridge.setDataStructure(head);
        bridge.setTitle("A Doubly-Linked List");
        bridge.visualize();

    }
}
