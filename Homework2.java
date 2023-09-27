import java.util.Scanner;
class Student {
    int studentNum, phoneNum;
    String name, major;
    int getStudentNum() {
        return studentNum;
    }
    void setStudentNum(int sn) {
        studentNum = sn;
    }
    String getPhoneNum() {
        String strPhoneNum = "0" + Integer.toString(phoneNum);
        strPhoneNum = strPhoneNum.replaceFirst("(\\d{3})(\\d{4})(\\d+)", "$1-$2-$3");
        return strPhoneNum;
    }
    void setPhoneNum(int pn) {
        phoneNum = pn;
    }
    String getMajor() {
        return major;
    }
    void setMajor(String mj) {
        major = mj;
    }
    String getName() {
        return name;
    }
    void setName(String nm) {
        name = nm;
    }
}
public class Homework2 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        student1.setStudentNum(num1);
        String str1 = sc1.next();
        student1.setName(str1);
        String str2 = sc1.next();
        student1.setMajor(str2);
        int num2 = sc1.nextInt();
        student1.setPhoneNum(num2);

        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Scanner sc2 = new Scanner(System.in);
        int num1_2 = sc2.nextInt();
        student2.setStudentNum(num1_2);
        String str1_2 = sc2.next();
        student2.setName(str1_2);
        String str2_2 = sc2.next();
        student2.setMajor(str2_2);
        int num2_2 = sc2.nextInt();
        student2.setPhoneNum(num2_2);

        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        Scanner sc3 = new Scanner(System.in);
        int num1_3 = sc3.nextInt();
        student3.setStudentNum(num1_3);
        String str1_3 = sc3.next();
        student3.setName(str1_3);
        String str2_3 = sc3.next();
        student3.setMajor(str2_3);
        int num2_3 = sc3.nextInt();
        student3.setPhoneNum(num2_3);

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        System.out.printf("첫번째 학생: %d %s %s %s\n", student1.getStudentNum(), student1.getName(), student1.getMajor(), student1.getPhoneNum());
        System.out.printf("두번째 학생: %d %s %s %s\n", student2.getStudentNum(), student2.getName(), student2.getMajor(), student2.getPhoneNum());
        System.out.printf("세번째 학생: %d %s %s %s\n", student3.getStudentNum(), student3.getName(), student3.getMajor(), student3.getPhoneNum());

    }
}

