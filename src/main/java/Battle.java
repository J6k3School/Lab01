
public class Battle {
    String Name1;
    float Att1;
    float Def1;
    float HP1;
    float Dam1;

    String Name2;
    float Att2;
    float Def2;
    float HP2;
    float Dam2;

    int round_Num = 1;


    //taking the variables from Lab01.java for use in this project
    //Constructor
    public Battle(String chName, float chAt, float chDef, float chHP, String zarName, float zarAt, float zarDef, float zarHP){
        this.Name1 = chName;
        this.Att1 = chAt;
        this.Def1 = chDef;
        this.HP1 = chHP;
        this.Name2 = zarName;
        this.Att2 = zarAt;
        this.Def2 = zarDef;
        this.HP2 = zarHP;
    }


    //setting the getters
    String getMonster1Name(){
        return Name1;
    }
    float getMonster1Attack(){
        return Att1;
    }
    float getMonster1Defence(){
        return Def1;
    }
    float getMonster1HP(){
        return HP1;
    }

    String getMonster2Name(){
        return Name2;
    }
    float getMonster2Attack(){
        return Att2;
    }
    float getMonster2Defence(){
        return Def2;
    }
    float getMonster2HP(){
        return HP2;
    }



//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



    // this boolean will see if it is Chikapu who is dead and if it is will return true if not false
    public boolean isMonster1Dead(){
        if (HP1 <= 0) {
            return true;
        }else{
            return false;
        }
    }



//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



    // this boolean will see if it is Zarichard who is dead and if it is will return true if not false
    public boolean isMonster2Dead(){
        if (HP2 <= 0) {
            return true;
        }else{
            return false;
        }
    }



//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // simulates round
    public void simulateRound(){
        System.out.println("Round " + round_Num);

        Dam1 = (Att1 - Def2);
        Dam2 = (Att2 - Def1);



        HP1 -= Dam2;
        HP2 -= Dam1;



        System.out.println(Name1 + " does " + Dam2 + " points of damage to " + Name2);
        System.out.println(Name2 + " does " + Dam1 + " points of damage to " + Name1);
        System.out.println(Name1 + ": " + HP1);
        System.out.println(Name2 + ": " + HP2);
        round_Num++;
    }
}
