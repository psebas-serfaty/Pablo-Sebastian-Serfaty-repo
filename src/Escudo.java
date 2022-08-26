public class Escudo {

    public float defenseT0(int damage){
        return damage;
    }

    public float defenseT1(int damage){
        return (float) (damage*0.75);
    }
    
    public float defenseT2(int damage){
        return (float) (damage*0.5);
    }

}
