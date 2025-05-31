package creationals.abstractFactory.factory;

import creationals.abstractFactory.armor.Armor;
import creationals.abstractFactory.weapon.Weapon;
import creationals.factoryMethod.Enemy;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
