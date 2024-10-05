package Hotel;

public class Hotel extends Kamar{
    public int age;
    public String name;
    public String phone;

    public Hotel(int age, String name, String phone){
    super(phone, age, age);
    this.age = age;
    this.name = name;
    this.phone = phone;
    }

    @Override
    public void getData() {

        System.out.println("Nama: " + name);
        System.out.println("umur: " + age);
        System.out.println("no hp: " + phone);
    }
}
