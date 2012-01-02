package local;
import java.util.List;

import javax.ejb.Local;

import util.LoginToken;
import entity.Document;
import entity.Group;
import entity.Project;
import entity.Student;
import exceptions.DocumentNotFoundException;
import exceptions.GroupEmptyException;
import exceptions.GroupLimitReachedException;
import exceptions.GroupNotFoundException;
import exceptions.InvalidTokenException;
import exceptions.ProjectNotFoundException;
import exceptions.StudentNotFoundException;

/**
 * @author Gabriele
 *
 */
@Local
public interface StudentManagerLocal {

	/**
	 * @param student
	 * @return
	 */
	Student createStudent(Student student);

	/**
	 * @param token
	 * @param studentId
	 * @return
	 * @throws InvalidTokenException
	 * @throws StudentNotFoundException
	 */
	Student findStudent(LoginToken token, String studentId) throws InvalidTokenException, StudentNotFoundException;

	/**
	 * @param token
	 * @param student
	 * @return
	 * @throws InvalidTokenException
	 * @throws StudentNotFoundException
	 */
	Student updateStudent(LoginToken token, Student student) throws InvalidTokenException, StudentNotFoundException;

	/**
	 * @param token
	 * @param student
	 * @throws InvalidTokenException
	 */
	void deleteStudent(LoginToken token, Student student) throws InvalidTokenException;
	
	/**
	 * @param projectId
	 * @return
	 * @throws ProjectNotFoundException
	 */
	List<Group> getGroupsForProject(String projectId) throws ProjectNotFoundException;
	
	/**
	 * @return
	 */
	List<Project> getAllProjects();
	
	/**
	 * @param studentId
	 * @param groupId
	 * @throws StudentNotFoundException
	 * @throws GroupNotFoundException
	 * @throws GroupLimitReachedException
	 */
	void addStudentToGroup(Student student, String groupId) throws StudentNotFoundException, GroupNotFoundException, GroupLimitReachedException;
	
	/**
	 * @param token
	 * @param studentId
	 * @param groupId
	 * @throws StudentNotFoundException
	 * @throws GroupNotFoundException
	 * @throws GroupEmptyException
	 */
	void removeStudentFromGroup(LoginToken token, Student student, String groupId) throws InvalidTokenException, StudentNotFoundException, GroupNotFoundException, GroupEmptyException;
	
	/**
	 * @param token
	 * @param documentId
	 * @param groupId
	 * @throws InvalidTokenException
	 * @throws DocumentNotFoundException
	 * @throws GroupNotFoundException
	 */
	void addDocumentToGroup(LoginToken token, Document document, String groupId) throws InvalidTokenException, DocumentNotFoundException, GroupNotFoundException;
	
	/**
	 * @param token
	 * @param documentId
	 * @param groupId
	 * @throws InvalidTokenException
	 * @throws DocumentNotFoundException
	 * @throws GroupNotFoundException
	 */
	void removeDocumentFromGroup(LoginToken token, Document document, String groupId) throws InvalidTokenException, DocumentNotFoundException, GroupNotFoundException;
	
	/**
	 * @param token
	 * @param groupId
	 * @return
	 * @throws InvalidTokenException
	 * @throws GroupNotFoundException
	 */
	List<Student> getStudentsForGroup(LoginToken token, String groupId) throws InvalidTokenException, GroupNotFoundException;

	/**
	 * @param token
	 * @return
	 * @throws InvalidTokenException
	 */
	List<Student> getAllStudents(LoginToken token) throws InvalidTokenException;
}
