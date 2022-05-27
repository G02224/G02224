package Houset.domain;

public class Houses {
    private int id;
    private String name;
    private String phone;
    private String addr;
    private String salar;
    private String texr;

    public Houses(int id, String name, String phone, String addr, String salar, String texr) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.addr = addr;
        this.salar = salar;
        this.texr = texr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSalar() {
        return salar;
    }

    public void setSalar(String salar) {
        this.salar = salar;
    }

    public String getTexr() {
        return texr;
    }

    public void setTexr(String texr) {
        this.texr = texr;
    }

    @Override
    public String toString() {
        return
                id +
                "\t\t" + name +
                "\t" + phone +
                "\t" + addr +
                "\t" + salar +
                "\t" + texr + "\t";
    }
}
