/**
 * Lớp Triangle đại diện cho tam giác trong không gian 2D.
 * Cài đặt giao diện GeometricObject để cung cấp thông tin về diện tích và chu vi.
 */
public class Triangle implements GeometricObject {
    /** Đỉnh thứ nhất của tam giác. */
    private Point p1;

    /** Đỉnh thứ hai của tam giác. */
    private Point p2;

    /** Đỉnh thứ ba của tam giác. */
    private Point p3;

    /**
     * Kiểm tra xem hai điểm có trùng nhau không.
     *
     * @param a Điểm thứ nhất
     * @param b Điểm thứ hai
     * @return true nếu hai điểm trùng nhau, ngược lại false
     */
    private boolean isDuplicate(Point a, Point b) {
        return a.getX() == b.getX() && a.getY() == b.getY();
    }

    /**
     * Kiểm tra xem ba điểm có thẳng hàng không.
     *
     * @param a Điểm thứ nhất
     * @param b Điểm thứ hai
     * @param c Điểm thứ ba
     * @return true nếu ba điểm thẳng hàng, ngược lại false
     */
    private boolean isCollinear(Point a, Point b, Point c) {
        double area = a.getX() * (b.getY() - c.getY()) +
                b.getX() * (c.getY() - a.getY()) +
                c.getX() * (a.getY() - b.getY());
        return area == 0;
    }

    /**
     * Khởi tạo một tam giác với ba điểm cho trước.
     * Nếu có hai điểm trùng nhau hoặc ba điểm thẳng hàng, sẽ ném ngoại lệ.
     *
     * @param p1 Đỉnh thứ nhất
     * @param p2 Đỉnh thứ hai
     * @param p3 Đỉnh thứ ba
     * @throws RuntimeException nếu dữ liệu không hợp lệ
     */
    public Triangle(Point p1, Point p2, Point p3) {
        if (isDuplicate(p1, p2) || isDuplicate(p2, p3) || isDuplicate(p1, p3)) {
            throw new RuntimeException("Có hai điểm trùng nhau");
        }
        if (isCollinear(p1, p2, p3)) {
            throw new RuntimeException("Ba điểm thẳng hàng");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    /**
     * Trả về đỉnh thứ nhất của tam giác.
     *
     * @return Đối tượng Point
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Trả về đỉnh thứ hai của tam giác.
     *
     * @return Đối tượng Point
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Trả về đỉnh thứ ba của tam giác.
     *
     * @return Đối tượng Point
     */
    public Point getP3() {
        return p3;
    }

    /**
     * Tính diện tích của tam giác bằng công thức Heron.
     *
     * @return Diện tích tam giác
     */
    @Override
    public double getArea() {
        double a = p1.distanceTo(p2);
        double b = p2.distanceTo(p3);
        double c = p3.distanceTo(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Tính chu vi của tam giác.
     *
     * @return Chu vi tam giác
     */
    @Override
    public double getPerimeter() {
        return p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1);
    }

    /**
     * Trả về thông tin mô tả tam giác dưới dạng chuỗi.
     * Định dạng: Triangle[(x1,y1),(x2,y2),(x3,y3)], trong đó các số được làm gọn.
     *
     * @return Chuỗi mô tả tam giác
     */
    @Override
    public String getInfo() {
        return String.format("Triangle[(%s,%s),(%s,%s),(%s,%s)]",
                formatNumber(p1.getX()), formatNumber(p1.getY()),
                formatNumber(p2.getX()), formatNumber(p2.getY()),
                formatNumber(p3.getX()), formatNumber(p3.getY()));
    }

    /**
     * Định dạng số: loại bỏ phần thập phân nếu không cần thiết.
     *
     * @param value Giá trị số cần định dạng
     * @return Chuỗi biểu diễn số đã làm gọn
     */
    private String formatNumber(double value) {
        if (value == (long) value) {
            return String.format("%d", (long) value);
        } else {
            return String.format("%s", value);
        }
    }
}
