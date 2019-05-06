package prototype.deep;

import java.io.*;
import java.util.List;

public class User implements Cloneable, Serializable {
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

    public Object clone() {
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        try{
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
            User userClone=(User)objectInputStream.readObject();
            return userClone;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
