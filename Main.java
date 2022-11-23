

public class Main{
    public static void main(String[] args) {

        Tree myTree = new Tree();
        myTree.createTree("Olga", "Valya", "Ivan");
        myTree.createTree("Oleg", "Valya", "Alex");
        myTree.createTree("Anna", "Olga", "Oleg");
        myTree.createTree("Luba", "Olga", "Oleg");
        myTree.createTree("Gleb", "Luba", "Kostya");
        myTree.createTree("Ylya", "Luba", "Kostya");

        // public void printTree(ArrayList<Human> myTree){
        //     for(int i = 0; i< myTree.size(); i++){
        //         System.out.printf( "%s", i);
        //     }
        // }
        Tree.myTree.forEach(p->{
            System.out.println(p);
        });   

        Tree children = myTree.addChildren("Olga", "Oleg");

        Tree.children.forEach(p->{
            System.out.println(p);
        });   
        
    }
}
