/*ObserverPattern , cho phép một đối tượng (gọi là Subject) 
 duyệt qua danh sách các đối tượng quan sát (gọi là Observers) 
 và thông báo cho chúng về sự thay đổi trong trạng thái của nó */



import java.util.ArrayList;
import java.util.List;


class Subject { // đại diện cho đối tượng mà bạn muốn theo dõi
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) { // để thêm một đối tượng quan sát vào danh sách
        observers.add(observer);
    }
     
    public void notifyAllObservers() { 
        /*duyệt qua danh sách đối tượng quan sát và gọi phương thức update() 
        trên mỗi đối tượng quan sát để thông báo về sự thay đổi trong trạng thái. */
        
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Quan sát (Observer)
abstract class Observer { //một lớp trừu tượng chứa phương thức update().
    protected Subject subject;

    public abstract void update();
    /*Lớp con của Observer sẽ triển khai phương thức update() 
    để định nghĩa cách xử lý thông báo khi trạng thái của chủ đề (Subject) thay đổi. */
}

// Quan sát nhị phân
class BinaryObserver extends Observer {//là các lớp cụ thể triển khai Observer.
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        /*Trong constructor của mỗi lớp, chúng kết nối với Subject 
        và thêm chính chúng vào danh sách quan sát bằng cách gọi subject.attach(this) */
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
        /*Phương thức update() của mỗi lớp in ra thông tin về trạng thái của Subject ở định dạng nhị phân */
    }
}

// Quan sát thập lục phân (tương tự như dạng nhị phân)
class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}


/*phần chương trình chính
  thể hiện của Subject (một đối tượng mà chúng ta muốn quan sát) và
   hai đối tượng quan sát (BinaryObserver và HexObserver).
 */
public class ObserverPatternExample { 
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
