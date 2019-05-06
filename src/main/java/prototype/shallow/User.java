package prototype.shallow;
import java.util.List;

public class User implements UserPrototype {
    private String name;
    private Integer age;
    private List<UserAddress> addressList ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<UserAddress> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<UserAddress> addressList) {
        this.addressList = addressList;
    }

    public UserPrototype clone() {
        User user=new User();
        user.setAge(this.age);
        user.setName(this.name);
        user.setAddressList(this.addressList);
        return user;
    }
}
