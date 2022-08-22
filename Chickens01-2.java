public class Chickens01 {
    public static void main(String[] args) {

        int chickenCount = 3;
        int eggsperChicken = 5;
        int totalEggs = chickenCount*eggsperChicken;
        chickenCount = chickenCount+1;
        totalEggs= totalEggs + (chickenCount*eggsperChicken);
        chickenCount = chickenCount/2;
        totalEggs = totalEggs + (chickenCount*eggsperChicken);
        System.out.println(totalEggs);
        
        int chickenCount2 = 8;
        int eggsperChicken2 = 4;
        int totalEggs2 = chickenCount2*eggsperChicken2;
        chickenCount2 = chickenCount2+1;
        totalEggs2= totalEggs2 + (chickenCount2*eggsperChicken2);
        chickenCount2 = chickenCount%2;
        totalEggs2 = totalEggs2 + (chickenCount2*eggsperChicken2);
        System.out.println(totalEggs2);
        
    }   
}
