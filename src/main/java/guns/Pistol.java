package guns;

public class Pistol extends Weapon implements WeaponActions, AdditionalActions {

    private Clip ammo;
    private int shots;

    public Pistol(Clip clip) {
        reloadGun(clip);
    }

    @Override
    public void shootBullet() {
        ammo.bullets.remove(shots);
        shots = shots + 1;
        System.out.println("Fire! " + shots);
    }

    @Override
    public void reload(Clip clip) {
        reloadGun(clip);
    }

    @Override
    public int getClipSize() {
        return ammo.bullets.size();
    }

    private void reloadGun(Clip clip) {
        ammo = clip;
        shots = 0;
    }

    @Override
    public String displayManufacturer() {
        return "Russia";
    }

    @Override
    public int expiration() {
        return 1 + 1;
    }

}