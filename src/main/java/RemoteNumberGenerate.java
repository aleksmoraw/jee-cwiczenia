import javax.ejb.Remote;

@Remote
public interface RemoteNumberGenerate {
    int getRandomInt(int upperBound);
}
