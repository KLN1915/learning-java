package abstractFactory.factory;

import abstractFactory.armor.Armor;
import abstractFactory.weapon.Weapon;
import factoryMethod.Enemy;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
