package guns;

public class Bazooka extends Weapon implements AdditionalActions {

    @Override
    public String displayManufacturer() {
        return "USA";
    }

    @Override
    public int expiration() {
        return 2 * 2;
    }

    public int expiration(int a) {
        return a;
    }

}
