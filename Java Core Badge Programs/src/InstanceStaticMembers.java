class CloneGenerator
{
    //the total number of clones that we create with this class
    private static int numberOfClones;    

    //each clone will have a name
    private String cloneName;

       //constructor
       public CloneGenerator(String s)
       {
        cloneName = s;
        numberOfClones ++;
        return;
       }

       // return this clones name
       public String getName()
       {
         return cloneName;
       }

       //count Clones
       public static int countClones()
       {
         return numberOfClones;
       }

}

public class InstanceStaticMembers
{
    public static void main(String args[])
    {
        //Instantiate our class and create a clone
        CloneGenerator c1 = new CloneGenerator("Bob");
        CloneGenerator c2 = new CloneGenerator("Jon");
        CloneGenerator c3 = new CloneGenerator("Jim");

        //this string will contain the name Bob
        String clone1 = c1.getName();
        
        //this string will contain the name Jon
        String clone2 = c2.getName();

        //this string will contain the name Jim
        String clone3 = c3.getName();

        //Call the Static function
        //iCloneCount will hold the value of 3 after this assignment
        int iCloneCount = CloneGenerator.countClones();        
    }
}