// Tính đóng gói


class Person {
    private String name; // "private" dùng để định rõ mức độ bảo mật cho một thành phần của lớp

    // "public"   có thể được truy cập từ bất kỳ lớp nào trong chương trình Java
    // "getName" để lấy giá trị của một trường cụ thể trong đối tượng
    public String getName() {
        return name;
    }

    // "setName" để thiết lập giá trị cho một trường  cụ thể của đối tượng
    public void setName(String newName) {
        name = newName;
    }
