//public class Robot {
//    public static void moveRobot(Robot robot, int toX, int toY) {
//        while (robot.getDirection() != Direction.RIGHT) {
//            robot.turnRight();
//        }
//        if (toX >= robot.getX()) { // 10-0
//            while (toX != robot.getX()) {
//                robot.stepForward();
//            }
//            if (toY >= robot.getY()) {  //10-0
//                robot.turnLeft();
//            } else {   // 0-10
//                robot.turnRight();
//            }
//        } else {
//            robot.turnLeft();
//            robot.turnLeft();
//            while (toX != robot.getX()) {
//                robot.stepForward();
//            }
//            if (toY >= robot.getY()) {  //10-0
//                robot.turnRight();
//            } else {   // 0-10
//                robot.turnLeft();
//            }
//        }
//        while (toY != robot.getY()) {
//            robot.stepForward();
//        }
//    }
//
//
//    public Direction getDirection() {
//
//        // текущее направление взгляда
//    }
//
//    public int getX() {
//        // текущая координата X
//    }
//
//    public int getY() {
//        // текущая координата Y
//    }
//
//    public void turnLeft() {
//        // повернуться на 90 градусов против часовой стрелки
//    }
//
//    public void turnRight() {
//        // повернуться на 90 градусов по часовой стрелке
//    }
//
//    public void stepForward() {
//        // шаг в направлении взгляда
//        // за один шаг робот изменяет одну свою координату на единицу
//    }
//}