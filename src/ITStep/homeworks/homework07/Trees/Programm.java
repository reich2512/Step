package ITStep.homeworks.homework07.Trees;

import static ITStep.homeworks.homework07.Trees.Tree.*;

/**
 * Created by roman on 08.10.2016.
 * 4. Доделать задачу про деревья и прислать ее.
 */
public class Programm {

    public static void main(String[] args) {

        Tree [] trees = new Tree[10];

        System.out.println(treeCounter);

        trees [0] = new Tree("tree_1", 1);
        trees [1] = new Tree("tree_2", 2);
        trees [2] = new Tree("tree_3", 3);
        trees [3] = new Tree("tree_4", 4);
        trees [4] = new Tree("tree_5", 5);

        System.out.println(treeCounter);

        for (int i = treeCounter ; i < trees.length ; i++){
            trees[i] = new Tree(DEFAULTNAME + "_" + (i + 1));
        }

        System.out.println(treeCounter);

        for (int i = 0; i < trees.length; i++) {
            info(trees [i]);
        }
    }
}
