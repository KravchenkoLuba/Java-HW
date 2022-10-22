public class HanoiTower {
    public static void movingDisks(int numberdisks, char diskname1, char diskname2, char diskname3){
        if (numberdisks == 1){
            System.out.println("Disk1 from "+ diskname1 + " to "+ diskname3);
        }
        else{
            movingDisks(numberdisks - 1, diskname1, diskname3, diskname2);
            System.out.println("Disk"+ numberdisks + " from "+ diskname1 + " to " + diskname3);
            movingDisks(numberdisks - 1, diskname2, diskname1, diskname3);
        }
    }

    public static void main(String[] args){
        int numberdisks = 3;
        movingDisks(numberdisks,'A', 'B', 'C');
    }
}

