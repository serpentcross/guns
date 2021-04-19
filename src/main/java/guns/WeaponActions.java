package guns;

public interface WeaponActions {

    void shootBullet();

    void reload(Clip clip);

    int getClipSize();

}