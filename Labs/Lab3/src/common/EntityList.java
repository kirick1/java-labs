package сommon;

import java.util.ArrayList;
import java.util.Objects;

public class EntityList<T> {
    private ArrayList<T> elements = new ArrayList<>();

    public EntityList(ArrayList<T> elements) {
        this.elements = elements;
    }

    public EntityList() {};

    public T get(int index) { return elements.get(index); }

    public ArrayList<T> remove(int index) {
        return (ArrayList<T>) elements.remove(index);
    }

    public ArrayList<T> getElements() {return elements;}

    public void add(T element) {
        elements.add(element);
    }

    public void addByIndex(int index, T element) {
        elements.add(index, element);
    }

    @Override
    public String toString() {
        return "EntityList{" +
                "elements=" + elements +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityList<?> that = (EntityList<?>) o;
        return Objects.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}

