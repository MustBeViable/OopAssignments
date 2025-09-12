package Task2;

public class ThreadClass extends Thread {

    private static int index = 1;
    private final String name;

    public ThreadClass() {
        name = "Thread " + index;
        index++;
    }

    @Override
    public void run() {
        System.out.printf("%s trying to add string \"%s\" \n", this.name, this.name);
        boolean done = ListStuff.addElement(this.name);
        if (done) {
            System.out.printf("%s was added successfully.\n", this.name);
        }
        System.out.printf("%s trying to look for string \"%s\" \n", this.name, this.name);
        if (ListStuff.hasString(this.name)) {
            System.out.println("It is in the list");
        } else {
            System.out.println("Not in the list");
        }
        System.out.printf("%s trying to remove string \"%s\" \n", this.name, this.name);
        boolean did = ListStuff.removeElement(this.name);
        if (did) {
            System.out.printf("%s remove string \"%s\" succesfully \n", this.name, this.name);
        }
        System.out.println(this.name + " trying to get size");
        System.out.println("Size: " + ListStuff.listSize());
        System.out.printf("%s trying to look for string after removing it \"%s\" \n", this.name, this.name);
        if (ListStuff.hasString(this.name)) {
            System.out.println(this.name + " is in the list");
        } else {
            System.out.println(this.name + " is not in the list");
        }
    }
}
