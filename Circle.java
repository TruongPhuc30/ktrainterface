/**
 * Lớp Circle đại diện cho hình tròn trong không gian 2D.
 * Cài đặt giao diện GeometricObject để cung cấp thông tin về diện tích và chu vi.
 */
public class Circle implements GeometricObject {
    /** Hằng số pi dùng để tính diện tích và chu vi. */
    private static final double pi = 3.14;

    /** Tâm của hình tròn. */
    private Point center;

    /** Bán kính của hình tròn. */
    private double radius;

    /**
     * Khởi tạo một hình tròn với tâm và bán kính cho trước.
     *
     * @param center Tâm của hình tròn
     * @param radius Bán kính của hình tròn
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Trả về tâm của hình tròn.
     *
     * @return Đối tượng Point đại diện cho tâm
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Trả về bán kính của hình tròn.
     *
     * @return Giá trị double của bán kính
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Tính diện tích của hình tròn.
     *
     * @return Diện tích hình tròn
     */
    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    /**
     * Tính chu vi của hình tròn.
     *
     * @return Chu vi hình tròn
     */
    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    /**
     * Trả về thông tin mô tả hình tròn dưới dạng chuỗi.
     * Định dạng: Circle[(x,y),r=radius], trong đó các số được làm gọn.
     *
     * @return Chuỗi mô tả hình tròn
     */
    @Override
    public String getInfo() {
        return String.format("Circle[(%s,%s),r=%s]",
                formatNumber(center.getX()),
                formatNumber(center.getY()),
                formatNumber(radius));
    }

    /**
     * Định dạng số: loại bỏ phần thập phân nếu không cần thiết.
     *
     * @param value Giá trị số cần định dạng
     * @return Chuỗi biểu diễn số đã làm gọn
     */
    private String formatNumber(double value) {
        if (value == (long) value) {
            return String.format("%d", (long) value); // Nếu là số nguyên, không hiển thị phần thập phân
        } else {
            return String.format("%s", value); // Giữ số thập phân nhưng không ép định dạng
        }
    }
}
