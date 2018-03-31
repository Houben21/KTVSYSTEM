package cn.edu.sysu.Entity;

public class VIP {

    private String cname;
    private String phone;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "VIP{" +
                "cname='" + cname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
