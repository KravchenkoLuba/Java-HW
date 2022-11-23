

import java.util.ArrayList;
import java.util.List;

public class Tree {
    static List<Human> myTree = new ArrayList<Human>();
    static List<Human> children = new ArrayList<Human>();

    public void createTree(String name, String mom, String dad) {
        Human union = new Human(name, mom, dad);
        myTree.add(union);
    }

    public ArrayList<Human> addChildren(String mom, String dad){
        for(int i = 0; i< myTree.size(); i++){
            if((array[i]).getParent1 == mom && (array[i]).getParent2 == dad){
                children.add(array[i]);
            }
            return children;

        }
       
        
    }
}
