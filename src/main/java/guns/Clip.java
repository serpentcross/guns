package guns;

import java.util.ArrayList;
import java.util.List;

public class Clip {

    List<Bullet> bullets;

    public Clip(int clipSize) {
        bullets = new ArrayList<>();
        for (int i = 0; i < clipSize; i++) {
            bullets.add(new Bullet());
        }
    }

}