package abstractFactory.factory;

import abstractFactory.armor.Armor;
import abstractFactory.armor.HeavyArmor;
import abstractFactory.weapon.Axe;
import abstractFactory.weapon.Weapon;
import factoryMethod.Enemy;
import factoryMethod.Warrior;

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
