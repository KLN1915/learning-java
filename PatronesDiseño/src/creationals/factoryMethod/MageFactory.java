package creationals.factoryMethod;

public class MageFactory extends EnemyFactory{
    @Override
    public Enemy createEnemy() {
        return new Mage();
    }
}
