
public class Persona {

    private String name;
    private char gender;
    private String address;
    private int age;

    //Constructor vacío
    public Persona() {
    }

    //Constructor con un atributo
    public Persona(String name) {
        this.name = name;
    }

    //Constructor completo
    public Persona(String name, char gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Persona{" + "name=" + name + ", gender=" + gender + ", address=" + address + ", age=" + age + '}';
    }

}
