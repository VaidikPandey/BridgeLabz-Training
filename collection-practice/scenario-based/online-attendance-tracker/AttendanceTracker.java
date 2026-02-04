import java.util.*;

public class AttendanceTracker {

    private Map<String, Set<String>> sessionAttendance;

    public AttendanceTracker() {
        sessionAttendance = new HashMap<>();
    }

    // Marking the attendance
    public void markAttendance(String sessionId, String studentId) throws DuplicateAttendanceException {
        sessionAttendance.putIfAbsent(sessionId, new HashSet<>());

        Set<String> students = sessionAttendance.get(sessionId);

        if (!students.add(studentId)) {
            throw new DuplicateAttendanceException(
                "Student " + studentId + " already marked for session " + sessionId
            );
        }
    }

    // Removing the attendance
    public void removeAttendance(String sessionId, String studentId) {
        if (sessionAttendance.containsKey(sessionId)) {
            sessionAttendance.get(sessionId).remove(studentId);
        }
    }

    // Displaying attendance
    public void displayAttendance() {
        for (Map.Entry<String, Set<String>> entry : sessionAttendance.entrySet()) {
            System.out.println("Session: " + entry.getKey());
            System.out.println("Students: " + entry.getValue());
        }
    }
}
