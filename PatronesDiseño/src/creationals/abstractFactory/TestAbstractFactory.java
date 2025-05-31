package creationals.abstractFactory;

import creationals.abstractFactory.armor.Armor;
import creationals.abstractFactory.factory.EnemyAbstractFactory;
import creationals.abstractFactory.factory.MageFactory;
import creationals.abstractFactory.factory.WarriorFactory;
import creationals.abstractFactory.weapon.Weapon;
import creationals.factoryMethod.Enemy;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();
        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon staff = factory.createWeapon();
        mage.attack();
        robe.protect();
        staff.damage();
    }
}
