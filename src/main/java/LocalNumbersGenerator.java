import javax.ejb.Local;

@Local
public interface LocalNumbersGenerator {

    int getRandomInt(int upperBound);


}
