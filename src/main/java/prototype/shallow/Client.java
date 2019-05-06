package prototype.shallow;

public class Client {
    private UserPrototype userPrototype;

    public Client(UserPrototype userPrototype) {
        this.userPrototype = userPrototype;
    }

    public UserPrototype startClone(UserPrototype user){
      return user.clone();
    }
}
