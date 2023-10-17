//đề cập đến việc chung để các lớp con triển khai 

public interface Drawable { // việc chung là vẽ 
    void draw();
}

public class Circle imlements Drawable { // các lớp com sẽ triển khai như vẽ hình tròn
    public void draw() {

    }
}

public class Square imlements Drawable { // các lớp con vẽ hình vuông
    public void draw () {

    }
}