package advanced.collections.arraylist;
import java.util.Objects;

class Pair<K, V> {
    public K key;
    public V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString(){
        return "Pair { key = " +Objects.toString(key) + ", value = " + Objects.toString(value, "no value") + "}";
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Pair)){
            return false;
        }
        Pair<?,?> p = (Pair<?, ?>) o;
        return Objects.equals(p.key, key) && Objects.equals(p.value, value);
    }

}


