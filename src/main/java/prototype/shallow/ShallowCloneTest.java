package prototype.shallow;

import java.util.ArrayList;
import java.util.List;
public class ShallowCloneTest {
    public static void main(String[] args) {
        User user=new User();
        user.setName("kk");
        user.setAge(28);
        UserAddress userAddress=new UserAddress();
        userAddress.setLocation("福建省厦门市湖里区岐山路388号");
        userAddress.setPhone("18605053320");
        List<UserAddress> addressList=new ArrayList<UserAddress>();
        addressList.add(userAddress);
        user.setAddressList(addressList);
        Client client=new Client(user);
        User  clone =(User)client.startClone(user);
        System.out.println(user);
        System.out.println(clone);
        System.out.println(user.getAddressList()==clone.getAddressList());
    }
}
