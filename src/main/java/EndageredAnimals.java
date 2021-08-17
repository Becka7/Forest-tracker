
public class EndageredAnimals implements DatabaseManagement{
    private int id;
    private String name;
    private String age;
    private String health;


    public EndageredAnimals(int id,String name,String health,String age){
        this.id=id;
        this.name=name;
        this.health=health;
        this.age=age;
    }


    @Override
    public void save() {

    }
}
