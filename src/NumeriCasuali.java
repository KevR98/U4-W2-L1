import java.util.Arrays;
import java.util.Random;

public class NumeriCasuali {

    // LISTA ATTRIBUTI
    private int[] array;

    // LISTA COSTRUTTUTTORI
    public NumeriCasuali() {
        array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    // LISTA METODI
    public void stampaArray() {
        System.out.println(Arrays.toString(array));
    }

    public int[] getArray() {
        return array;
    }
}