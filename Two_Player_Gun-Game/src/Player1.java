class Player1 {
    //Properties:
    private String name;
    private String weapon;
    private int health;
    //Constructors:
    public Player1 (String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        //this.health = health;
        if(health<0 || health>100) {
            this.health = 100;
        }
        else{
            this.health = health;
        }
    }
    //Getters & Setters:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    //Behaviours/Methods:
    //Damage by Gun1(AKM):
    public void DamageByAKM() {
        this.health = this.health - 30; //Health will be reduced by 30 on each shot.
        if(this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by AKM. Health reduced by 30%. New Health is: "+this.health +"%");
        if(this.health == 0) {
            System.out.println(getName() +" is Dead due to low health");
        }
    }
    //Damage by Gun2(M416):
    public void DamageByM416() {
        this.health = this.health - 50; //Health will be reduced by 30 on each shot.
        if(this.health <= 0) {
            this.health = 0;
        }
        System.out.println("Got hit by M416. Health reduced by 50%. New Health is: "+this.health +"%");
        if(this.health == 0) {
            System.out.println(getName() +" is Dead due to low health");
        }
    }
    //Healing:
    public void Heal() {
        if(this.health<=0) {
            System.out.println("The Player is Dead. Healling is not Possible now");
        }
        else {
            this.health = 100;
            System.out.println("Healed. Health recovered to: "+this.health);
        }
    }
}