/* để đảm bảo rằng một lớp chỉ có một thể hiện và cung cấp 
    một điểm truy cập toàn cục tới thể hiện đó */ 

public class Singleton {
    private static Singleton instance;

    // khai báo một private conastructor để ngăn việc tạo thể hiện từ bên ngoài
    private Singleton() {
      // Khởi tạo các thuộc tính và tài nguyên của Singleton ở đây


    }
     // Phương thức public để truy cập thể hiện duy nhất của Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
    // Các phương thức và thuộc tính khác của Singleton nằm ở đây.
}