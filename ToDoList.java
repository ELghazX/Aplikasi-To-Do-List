public class ToDoList {
    // Menentukan view
    // view show
    // view add
    // view delete
    public static String[] model = new String[10];

    public static void main(String[] args) {

    }

    // menampilkan data
    public static void getToDo() {
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + " " + todo);
            }

        }
    }

    // add data
    public static void addToDo() {

    }

    // del data
    public static void delToDo() {

    }

    // view
    public static void viewGetToDo() {

    }

    public static void viewAddToDo() {

    }

    public static void viewDelToDo() {

    }
}
