import java.util.List;

/**
 * Lớp tiện ích ShapeUtil cung cấp các phương thức hỗ trợ xử lý danh sách các hình học.
 */
public class ShapeUtil {

    /**
     * In thông tin của các hình trong danh sách, phân loại theo kiểu hình học.
     * Hiện tại hỗ trợ hai loại: Circle và Triangle.
     *
     * @param shapes Danh sách các đối tượng hình học (GeometricObject)
     * @return Chuỗi chứa thông tin của các hình đã phân loại
     */
    public static String printInfo(List<GeometricObject> shapes) {
        StringBuilder sb = new StringBuilder();

        sb.append("Circle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                sb.append(shape.getInfo()).append("\n");
            }
        }

        sb.append("Triangle:\n");
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                sb.append(shape.getInfo()).append("\n");
            }
        }

        return sb.toString();
    }
}
