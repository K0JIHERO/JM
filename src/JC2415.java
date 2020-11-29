public class JC2415 {
    public static void main(String[] args) {
        JC2415 group = new JC2415();
        System.out.println(group.determineGroup(1));
    }
    //1 - 7-13,    2 - 14-17,   3 - 18-65

    public int determineGroup(int age) {
        int group = 0;
        if (age >= 7 && age <= 13) {
            group = 1;
        } else if (age >= 14 && age <= 17) {
            group = 2;
        } else if (age >= 18 && age <= 65) {
            group = 3;
        } else {
            group = -1;
        }
        return group;
    }
}
