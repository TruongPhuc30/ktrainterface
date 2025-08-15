/**
 * Lớp Point đại diện cho một điểm trong không gian 2D với tọa độ (x, y).
 */
public class Point {
    /** Tọa độ x của điểm. */
    private double pointX;

    /** Tọa độ y của điểm. */
    private double pointY;

    /**
     * Khởi tạo một điểm với tọa độ x và y cho trước.
     *
     * @param x Tọa độ x
     * @param y Tọa độ y
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    /**
     * Trả về tọa độ x của điểm.
     *
     * @return Giá trị x
     */
    public double getX() {
        return pointX;
    }

    /**
     * Trả về tọa độ y của điểm.
     *
     * @return Giá trị y
     */
    public double getY() {
        return pointY;
    }

    /**
     * Trả về biểu diễn chuỗi của điểm dưới dạng (x, y).
     *
     * @return Chuỗi mô tả điểm
     */
    @Override
    public String toString() {
        return "(" + pointX + ", " + pointY + ")";
    }

    /**
     * Tính khoảng cách Euclid từ điểm hiện tại đến một điểm khác.
     *
     * @param other Điểm cần tính khoảng cách đến
     * @return Khoảng cách giữa hai điểm
     */
    public double distanceTo(Point other) {
        double dx = this.pointX - other.pointX;
        double dy = this.pointY - other.pointY;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
