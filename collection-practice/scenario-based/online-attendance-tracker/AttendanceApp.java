public class AttendanceApp {
    public static void main(String[] args) {

        AttendanceTracker manager = new AttendanceTracker();

        try {
            manager.markAttendance("S1", "STU101");
            manager.markAttendance("S1", "STU102");
            manager.markAttendance("S2", "STU103");

            // Duplicate entry
            manager.markAttendance("S1", "STU101");

        } catch (DuplicateAttendanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        manager.removeAttendance("S1", "STU102");

        manager.displayAttendance();
    }
}
