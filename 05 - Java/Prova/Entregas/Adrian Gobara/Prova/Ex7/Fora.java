public class Fora<T> extends List<T> {

    private T[] array;

    public Fora(int size) {
        array = (T[]) (new Object[size]);
    }

    public Fora() {
        array = (T[]) (new Object[10]);
    }

    @Override
    public void add(T value) {
        if (getSize() == array.length) {
            T[] copy = (T[]) (new Object[array.length * 2]);

            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }
            array = copy;
        }
        array[getSize()] = (T) (value);
        setSize(getSize() + 1);
    }

    @Override
    public T get(int index) {

        return array[index];

    }

    @Override
    public void set(int index, T value) {

        array[index] = (T) (value);

    }

}
