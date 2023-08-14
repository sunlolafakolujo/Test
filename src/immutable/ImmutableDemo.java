package immutable;

import java.util.HashMap;
import java.util.Map;

final public class ImmutableDemo {
    private final int id;
    private final String name;
    private final Map<String,String> addressMap;


    public ImmutableDemo(int id, String name,Map<String,String> addressMap) {
        this.id = id;
        this.name=name;

        Map<String,String> address=new HashMap<>();
        for (Map.Entry<String,String> me:addressMap.entrySet()) {
            address.put(me.getKey(),me.getValue());
        }

        this.addressMap=address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getAddress() {

        Map<String, String> metadata=new HashMap<>();

        for(Map.Entry<String, String> entry: addressMap.entrySet()) {
            metadata.put(entry.getKey(), entry.getValue());
        }
        return metadata;
    }

    @Override
    public String toString() {
        return "ImmutableDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + addressMap +
                '}';
    }

    public static void main(String[] args) {
        Map<String, String> address = new HashMap<String, String>();
        address.put("101A","Oko Awo Close, Victoria Island");
        ImmutableDemo immutableDemo=new ImmutableDemo(100,"Sun",address);

        System.out.println("ID: "+immutableDemo.getId()+", "+"Student name: "+immutableDemo.getName()+", "+
                "Address: "+immutableDemo.getAddress());
        address.put("103","Ozumba Mbadiwe Avenue, Victoria Island");
        System.out.println(immutableDemo.getAddress());
        immutableDemo.getAddress().put("105","Bishop Oluwole Street, Victoria Island");
        System.out.println(immutableDemo.getAddress());


    }
}
