import javax.ejb.Stateless;
import java.util.Random;

@Stateless
public class NumbersGenerator implements LocalNumbersGenerator, RemoteNumberGenerate{

    Random random = new Random();

    @Override
    public int getRandomInt(int upperBound) {
    return random.nextInt(upperBound);

    }
}
