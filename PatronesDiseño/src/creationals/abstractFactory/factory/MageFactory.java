package creationals.abstractFactory.factory;

import creationals.abstractFactory.armor.Armor;
import creationals.abstractFactory.armor.Robe;
import creationals.abstractFactory.weapon.Staff;
import creationals.abstractFactory.weapon.Weapon;
import creationals.factoryMethod.Enemy;
import creationals.factoryMethod.Mage;

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
