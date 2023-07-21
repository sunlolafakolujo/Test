package collectionframework.mapinterface;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("db.properties");
        Properties p=new Properties();
        p.load(reader);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
        p.setProperty("password","Akinpelu1234");
        System.out.println(p.getProperty("password"));
        p.store(new FileWriter("db.properties"),"Password upadate");
        p.setProperty("username","sunFak");
        p.store(new FileWriter("db.properties"),"username upadate");
        System.out.println(p);
    }
}
