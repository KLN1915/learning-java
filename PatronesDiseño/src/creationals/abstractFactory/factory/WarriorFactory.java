package creationals.abstractFactory.factory;

import creationals.abstractFactory.armor.Armor;
import creationals.abstractFactory.armor.HeavyArmor;
import creationals.abstractFactory.weapon.Axe;
import creationals.abstractFactory.weapon.Weapon;
import creationals.factoryMethod.Enemy;
import creationals.factoryMethod.Warrior;

public class WarriorFactory extends EnemyAbstractFactory{

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
