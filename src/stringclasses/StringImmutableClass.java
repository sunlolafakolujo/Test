package stringclasses;

import java.util.HashMap;
import java.util.Map;

final public class StringImmutableClass {
    private int id;
    private String name;
    private Map<String, String> address;

    public StringImmutableClass() {
    }

    public StringImmutableClass(int id, String name, Map<String, String> address) {
        this.id = id;
        this.name = name;
        this.address = address;
        Map<String, String> addressEntry = new HashMap<>();
        for (Map.Entry<String, String> entry : address.entrySet()) {
            addressEntry.put(entry.getKey(), entry.getValue());
        }
        this.address = addressEntry;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAddress() {
        Map<String, String> addressEntrySet = new HashMap<>();

        for (Map.Entry<String, String> entry : address.entrySet()) {
            addressEntrySet.put(entry.getKey(), entry.getValue());
        }
        return addressEntrySet;
    }

    @Override
    public String toString() {
        return "StringImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Map<String, String> address = new HashMap<>();
        address.put("2A", "Adeola Street Ketu");
        StringImmutableClass stringImmutableClass = new StringImmutableClass(101,"Kuble",address);
        System.out.println(stringImmutableClass);
    }
}
