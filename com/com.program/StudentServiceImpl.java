public class StudentServiceImpl {
    String getStudentName(String studentId) {
        if (studentId == "101")
            return "harika";
        else
            return "Invalid student Id";
    }
}
    class PolymorphismDemo {
     public static void main(String args[]) {
         StudentServiceImpl studentServiceimpl = new StudentServiceImpl();
         String studentId = null;
         String s = "108";
         String s1 = "108";
         System.out.println(studentServiceimpl.getStudentName(studentId));
     }
 }