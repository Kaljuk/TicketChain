/**
 * BlockData
 * 
 */
public class BlockData {
    private Pilet[] piletid;

    public BlockData(Pilet inPilet) {
        this.piletid = new Pilet[]{pilet};
    }

    public void addTicket(Pilet inPilet) {
        int newLength = this.piletid.length+1;
        Pilet[] newArray = new Pilet[ newLength ];
        newArray = this.piletid;
        newArray[newArray.length-1] = inPilet;
    };

    public String toString() {

        return "";
    }
}