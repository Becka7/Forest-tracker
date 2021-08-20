import org.sql2o.Connection;

import java.util.ArrayList;
import java.util.Objects;

public class Animal implements DatabaseManagement {
    private String name;
    private int id;
    private String age;
    private String health;
    private static ArrayList<Animal> mInstance = new ArrayList<>();

    public Animal(String name,String age,String health) {
        this.name = name;
        this.age = age;
        this.health = health;
        mInstance.add(this);
    }

//    public static ArrayList<Animal> getmInstance() {
//        try (Connection con = DB.sql2o.open()) {
//            String sql = "SELECT * FROM animals";
//            return (ArrayList<Animal>) con.createQuery(sql)
//                    .executeAndFetch(Animal.class);
//        }

//    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    public String getAge() {
        return age;
    }

//    public void setAge(String age) {
//        this.age = age;
//    }

    public String getHealth() {
        return health;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal)) return false;
        Animal animal = (Animal) obj;
        return Objects.equals(getName(), animal.getName());

    }

    @Override
    public void save() {
        try (Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name) VALUES (:name)";
            this.id = (int) con.createQuery(sql, true)
                    .addParameter("name", this.name)
                    .executeUpdate()
                    .getKey();
        }

    }

}