package streamPlayground.launch;

public class NamePhone {

    private String name;
    private String phonenum;

    public NamePhone(String name) {
        this.name = name;
        this.phonenum = phonenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "NamePhone{" +
                "name='" + name + '\'' +
                ", phonenum='" + phonenum + '\'' +
                '}';
    }
}
