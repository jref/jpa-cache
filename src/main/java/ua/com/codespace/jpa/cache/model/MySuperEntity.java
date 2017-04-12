package ua.com.codespace.jpa.cache.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
//@Cacheable
public class MySuperEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String value;
    @ElementCollection
//    @Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
    private List<String> arr;

    public MySuperEntity() {
    }

    public MySuperEntity(String value, List<String> arr) {
        this.value = value;
        this.arr = arr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "MySuperEntity{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", arr=" + arr +
                '}';
    }
}
