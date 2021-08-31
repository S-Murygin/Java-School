package homework_01.task_2;

public abstract class Shape {
    private String shapeType = "Unknown";

    protected void setShapeType(String type) {
        shapeType = type;
    }

    public void printShapeType() {
        System.out.println(shapeType);
    }
}
