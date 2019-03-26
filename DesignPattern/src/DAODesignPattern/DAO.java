package DAODesignPattern;

import java.util.List;

public interface DAO {
	
	public List<Student_ValueObject> getAllStudent(); 
	public Student_ValueObject getStudent(int id); 
	public boolean updateStuedent(Student_ValueObject stue);
	public boolean deleteStue (Student_ValueObject stue);
	

}
