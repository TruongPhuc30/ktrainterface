/**
 * Giao diện GeometricObject định nghĩa các hành vi chung cho các hình học 2D.
 * Các lớp như Circle, Triangle, Rectangle... nên cài đặt giao diện này.
 */
public interface GeometricObject {

    /**
     * Tính diện tích của hình học.
     *
     * @return Diện tích (double)
     */
    public double getArea();

    /**
     * Tính chu vi của hình học.
     *
     * @return Chu vi (double)
     */
    public double getPerimeter();

    /**
     * Trả về thông tin mô tả hình học dưới dạng chuỗi.
     *
     * @return Chuỗi mô tả hình
     */
    public String getInfo();
}
