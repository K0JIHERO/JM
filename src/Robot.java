//public class Robot {
//    public static void moveRobot(Robot robot, int toX, int toY) {
//
//        switch (robot.getDirection()) {
//            case UP -> robot.turnRight();
//            case DOWN -> robot.turnLeft();
//            case LEFT -> {
//                robot.turnRight();
//                robot.turnRight();
//            }
//        }
//        if (toX >= robot.getX()) { // 10-0
//            for (int i = robot.getX(); i < toX; i++) { // 0; 0 < 10; +1
//                robot.stepForward();
//            }
//            if (toY >= robot.getY()) {  //10-0
//                robot.turnLeft();
//                for (int i = robot.getY(); i < toY; i++) { //0;0<10;+1
//                    robot.stepForward();
//                }
//            } else if (toY < robot.getY()) {   // 0-10
//                robot.turnRight();
//                for (int i = robot.getY(); i > toY; i--) { //
//                        robot.stepForward();
//                }
//            }
//        }
//        else if(toX <= robot.getX()) {
//            robot.turnLeft();
//            robot.turnLeft();
//            for (int i = robot.getX(); i > toX; i--) {
//                robot.stepForward();
//            }
//            if (toY >= robot.getY()) {
//                robot.turnRight();
//                for (int i = robot.getY(); i < toY; i++) {
//                    robot.stepForward();
//                }
//            } else if (toY < robot.getY()) {
//                robot.turnLeft();
//                for (int i = robot.getY(); i > toY; i--) {
//                    robot.stepForward();
//                }
//            }
//        }
//
//    }
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