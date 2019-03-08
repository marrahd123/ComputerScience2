package binarysearchtree;

public class BSTLearn
{
  public static void main(String[] args)
  {
    //Create the empty tree
    BinSrchTree tree = new BinSrchTree();


    //Create 10 people to insert into the tree.
    Person a = new Person("Sue", 48);
    Person b = new Person("Tim", 44);
    Person c = new Person ("Rachel", 22);
    Person d = new Person ("Jim", 18);
    Person e = new Person ("Sid", 18);
    Person f = new Person("Sue", 48);
    Person g = new Person("Tim", 44);
    Person h = new Person ("Rachel", 22);
    Person i = new Person ("Jim", 18);
    Person j = new Person ("Sid", 18);
    Person k = new Person ("Sid", 18);
    Person l = new Person ("Sid", 18);
    Person m = new Person ("Sid", 18);
    Person n = new Person ("Sid", 18);
    Person o = new Person ("Sid", 18);
    Person p = new Person ("Sid", 18);


    //Insert the persons in the tree and display the depth as it changes
    tree.insert("L", l);
    System.out.println("The depth is: "+tree.depth());
    tree.print();
    tree.insert("B", b);
    System.out.println("The depth is: "+tree.depth());
    tree.print();
    tree.insert("P", p);
    System.out.println("The depth is: "+tree.depth());
    tree.print();
    tree.insert("E", e);
    System.out.println("The depth is: "+tree.depth());
    tree.print();
    tree.insert("I", i);
    System.out.println("The depth is: "+tree.depth());
    tree.print();
    tree.insert("K", k);
    System.out.println("The depth is: "+tree.depth());
    tree.print();

    //Display the contents of the tree
    tree.printTree();
    tree.print();
    //How tall is the tree now?
    System.out.println(tree.depth());
  }

}
