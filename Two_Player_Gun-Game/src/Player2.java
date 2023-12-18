class Player2 extends Player1 {
    //Properties:
    private int health;
    private boolean armour;
    //Constructors:
    public Player2 (String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }
    //Methods/Behaviours:
    @Override
    public void DamageByAKM() {
        if(armour) {
            this.health = this.health - 20;
            if(this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Got hit by AKM. Health reduced by 20%. Damaged saved by Armour. New Health is: "+this.health +"%");
        }
        if(!armour) {
            this.health = this.health - 30;
            if(this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Got hit by AKM. Health reduced by 30%. Damaged saved by Armour. New Health is: "+this.health +"%");
        }
        if(this.health == 0) {
                System.out.println(getName() +" Player Dead due to low Health");
        }
    }
    @Override
    public void DamageByM416() {
        if(armour) {
            this.health = this.health - 30;
            if(this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Got hit by AKM. Health reduced by 30%. Damaged saved by Armour. New Health is: "+this.health +"%");
        }
        if(!armour) {
            this.health = this.health - 40;
            if(this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Got hit by AKM. Health reduced by 40%. Damaged saved by Armour. New Health is: "+this.health +"%");
        }
        if(this.health == 0) {
                System.out.println(getName() +" Player Dead due to low Health");
        }
    }
    @Override
    public void Heal() {
        if(this.health<=0) {
            System.out.println("Healing is not possible, Player is Dead");
        }
        else {
            this.health = 100;
            System.out.println("Healing Completed. Healing is at 100% now");
        }
    }
}