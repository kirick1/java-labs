package сommon;

import java.util.ArrayList;
import java.util.Objects;

public class EntityList<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public EntityList(ArrayList<T> elements) {
        this.elements = elements;
    }

    public EntityList() {};

    public T get(int index) {
        return elements.get(index);
    }

    public ArrayList<T> remove(int index) {
        return (ArrayList<T>) elements.remove(index);
    }

    public ArrayList<T> getElements() {
        return elements;
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void addByIndex(int index, T element) {
        this.elements.add(index, element);
    }

    @Override
    public String toString() {
        return "EntityList{" +
                "elements=" + this.elements +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EntityList<?> that = (EntityList<?>) object;
        return Objects.equals(this.elements, that.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.elements);
    }
}

