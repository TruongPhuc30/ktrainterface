/**
 * Lớp Circle đại diện cho hình tròn trong không gian 2D.
 * Cài đặt giao diện GeometricObject để cung cấp thông tin về diện tích và chu vi.
 */
public class Circle implements GeometricObject {
    /** Hằng số pi dùng để tính diện tích và chu vi. */
    public static final double pi = 3.14;

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
     * nhap vao tâm của hình tròn.
     *
     */
    public void setCenter(Point center) {
        this.center = center;
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
     * nhap vao bán kính của hình tròn.
     *
     */
    public void setRadius(double radius) {
        this.radius = radius;
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
        return String.format("Circle[(%.2f,%.2f),r=%.2f]",
                center.getX(), center.getY(), radius);
    }
}
