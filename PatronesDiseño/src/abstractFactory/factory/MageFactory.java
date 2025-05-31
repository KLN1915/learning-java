package abstractFactory.factory;

import abstractFactory.armor.Armor;
import abstractFactory.armor.Robe;
import abstractFactory.weapon.Staff;
import abstractFactory.weapon.Weapon;
import factoryMethod.Enemy;
import factoryMethod.Mage;

public class MageFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Mage();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new Staff();
    }
}
