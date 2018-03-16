
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Date;
/**
 * Block
 */
public class Block {
    private final String previousHash;
    private final String timeStamp;
    private final Object data;
    
    // Timestamp (time the Block was created) , previousHash (hash of a previous block)
    // Constructor for a standard block 
    public Block(String inPrevousHash, Object inData) {
        // Change the Object to fitting class when you figure out what it should be
        this.data         = inData;
        // Date the Block was created
        this.timeStamp    = new StringBuilder().append(new Date().getTime()).toString();
        // String previousHash
        this.previousHash = inPrevousHash;
    }
    // Constructor for a basic block


    // Change block into string of hash
    public String calculateHash() {
        // Create a base to turn into hash
        StringBuilder baseHash = new StringBuilder();
        baseHash.append( this.previousHash );
        baseHash.append( this.timeStamp );
        baseHash.append( this.data.toString() );
        // Create the hash
        MessageDigest hash256 = MessageDigest.getInstance("SHA256");
        byte[] byteHash = hash256.digest(baseHash.toString().getBytes("UTF-8"));
        // Turn byteHash into String with letters
        String newHash = new String(Arrays.toString(byteHash));
        return newHash;
    }


}