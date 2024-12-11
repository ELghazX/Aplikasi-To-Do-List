public class ToDoList {
    // Menentukan view
    // view show
    // view add
    // view delete
    public static String[] model = new String[10];

    public static void main(String[] args) {
        testGetToDo();
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

    public static void testGetToDo() {
        model[0] = "item 1";
        model[1] = "item 2";
        getToDo();
    }

    // add data
    public static void addToDo(String todo) {
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }

    }

    public static void viewAddToDo() {

    }

    public static void viewDelToDo() {

    }
}
