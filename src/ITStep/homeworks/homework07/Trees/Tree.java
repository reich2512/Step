package ITStep.homeworks.homework07.Trees;

/**
 * Created by roman on 08.10.2016.
 * Created by student on 28.09.2016.
 * сделать программу с двумя классами:
 * 1. программа
 * 2. дерево
 * В классе Дерево есть:
 * 2 несттических поля - название и высота.
 * статическая переменная - счетчик - количество созданных деревьев.
 * статическая константа высота по умолчанию - 5
 * статическая константа название дерева - Росток
 * *  2 конструктора - полный и неполный (только название)
 * В классе программе есть:
 * main, в main нужно создать массив деревьев на 10 шт
 * первые 5 элементов массива мы инициализируем вручную, остальные в цикле и задаем название типа Росток1 и т. д.
 * в maine с помощью foreach вывести название и рост всех деревьев.
 * сделать в классе Tree метод info для вывода информации о деревьях (имя, высота) и в майне выводить информацию им.
 */

public class Tree {

    static int treeCounter;
    static final int TREE_HIGHT = 5;
    static final String DEFAULTNAME = "Росток";
    String name;
    int higth;

    public Tree(String name, int higth) {
        this.name = name;
        this.higth = higth;
        treeCounter++;
    }

    public Tree(String name) {
        this(name, TREE_HIGHT);
    }

    public static void info(Tree tree) {

        System.out.println("Tree name is " + tree.name + " , Tree hight is " + tree.higth);
    }
}
