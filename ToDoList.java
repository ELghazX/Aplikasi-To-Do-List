public class ToDoList {

  // Menentukan view
  // view show
  // view add
  // view delete
  public static String[] model = new String[10];
  public static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    testInput();
  }

  public static String input(String info) {
    System.out.print(info + " : ");
    String data = scanner.nextLine();
    return data;
  }

  public static void testInput() {
    var name = input("nama");
    var nim = input("nim");
    System.out.println("hi " + name);
    System.out.println("NIM kamu: " + nim);
  }

  // menampilkan data
  public static void getToDo() {
    for (var i = 0; i < model.length; i++) {
      var todo = model[i];
      var no = i + 1;

      if (todo != null) {
        System.out.println(no + ". " + todo);
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
    var isFull = true;
    for (var i = 0; i < model.length; i++) {
      if (model[i] == null) {
        isFull = false;
        break;
      }

    }
    // jika data penuh di array, kalikan 2 yang baru
    if (isFull) {
      var temp = model;
      model = new String[model.length * 2];
      for (var i = 0; i < temp.length; i++) {
        model[i] = temp[i];
      }
    }
  }

  public static void testAddToDo() {
    for (var i = 0; i < 25; i++) {
      addToDo("todo ke - " + i);
    }
    getToDo();

  }

  public static boolean delToDo(Integer number) {
    if ((number - 1) >= model.length) {
      return false;
    } else if ((model[number - 1]) == null) {

      return false;
    } else {
      model[number - 1] = null;
      return true;
    }
  }

  public static void viewAddToDo() {

  }

  public static void viewDelToDo() {

  }
}
