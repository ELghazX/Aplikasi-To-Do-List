public class ToDoList {

  // Menentukan view
  // view show
  // view add
  // view delete

  /**
   * deklarasi variable
   */

  public static String[] model = new String[10];
  public static java.util.Scanner scanner = new java.util.Scanner(System.in);

  public static void main(String[] args) {
    testViewAddToDo();
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
    System.out.println("To do list: ");
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

  /**
   * view page
   */

  public static void viewGetToDo() {
    while (true) {
      getToDo();

      String menu = "Menu Todolist: \n"
          + "1. Tambah Kegiatan\n"
          + "2. Hapus Kegiatan\n"
          + "0. Keluar\n";
      System.out.println(menu);
      var input = input("pilihan");
      if (input.equals("1")) {
        viewAddToDo();
      } else if (input.equals("2")) {
        viewDelToDo();
      } else if (input.equals("0")) {
        break;
      } else {
        System.out.println("invalid input\n");
      }
    }
  }

  public static void testViewGetToDo() {
    addToDo("item 1");
    addToDo("item 2");
    addToDo("item 3");
    addToDo("item 4");
    viewGetToDo();

  }

  public static void viewAddToDo() {
    System.out.println("Menambah daftar kegiatan");
    var todo = input("todo (ketikkan 0 untuk membatalkan)");

    if (todo.equals("0")) {
      // batal balik ke viewGetToDo
    } else {
      addToDo(todo);
    }

  }

  public static void testViewAddToDo() {
    addToDo("item 1");
    addToDo("item 2");
    addToDo("item 3");
    addToDo("item 4");
    viewAddToDo();
    getToDo();
  }

  public static void viewDelToDo() {
    System.out.println("Menghapus daftar kegiatan");
    var number = input("Nomor kegiatan yang ingin dihapus (0 untuk batal)");
    if (number.equals("0")) {
      // batal
    } else {
      boolean success = delToDo(Integer.valueOf(number));
      if (!success) {
        System.out.println("Gagal Menghapus: " + number);
      }
    }

  }
}
