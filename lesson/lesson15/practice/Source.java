package lesson.lesson15.practice;

/**
 *
 * @param <S> source type
 */
public class Source<S> {
    private S quantity;

    public Source(S quantity) {
        this.quantity = quantity;
    }

    public S getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Source{" +
                "quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        Source<Double> water = new Source<>(1000.5d);
        Source<Float> electric = new Source<>(245.4f);
    }
}
