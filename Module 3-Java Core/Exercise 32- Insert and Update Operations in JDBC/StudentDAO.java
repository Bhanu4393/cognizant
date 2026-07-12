import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:students.db");

            StudentDAO dao = new StudentDAO();

            dao.insertStudent(con, 4, "Vijay", 20);
            dao.updateStudent(con, 4, "Vijay Kumar");

            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void insertStudent(Connection con, int id, String name, int age) {

        try {
            String query = "INSERT INTO students(id, name, age) VALUES(?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);

            ps.executeUpdate();

            System.out.println("Student inserted");

            ps.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void updateStudent(Connection con, int id, String name) {

        try {
            String query = "UPDATE students SET name = ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Student updated");

            ps.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
// Required SQL Table
//CREATE TABLE students (
  //  id INTEGER PRIMARY KEY,
   // name TEXT,
    //age INTEGER
//);