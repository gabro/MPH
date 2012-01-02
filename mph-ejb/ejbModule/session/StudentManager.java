package session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import local.StudentManagerLocal;
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
 * Session Bean implementation class StudentManager
 */
@Stateless
public class StudentManager implements StudentManagerLocal {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Student createStudent(Student student) {
		entityManager.persist(student);
		return student;
	}

	@Override
	public Student findStudent(LoginToken token, String studentId)
			throws InvalidTokenException, StudentNotFoundException {
		return (Student)entityManager.find(Student.class, studentId);
	}

	@Override
	public Student updateStudent(LoginToken token, Student student)
			throws InvalidTokenException, StudentNotFoundException {
		entityManager.merge(student);
		return student;
	}

	@Override
	public void deleteStudent(LoginToken token, Student student)
			throws InvalidTokenException {
		//Pattern seek and destroy: retrieve the entity before you can delete it
		student = entityManager.merge(student);
		entityManager.remove(student);
	}

	@Override
	public List<Group> getGroupsForProject(String projectId)
			throws ProjectNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void addStudentToGroup(Student student, String groupId)
			throws StudentNotFoundException, GroupNotFoundException,
			GroupLimitReachedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudentFromGroup(LoginToken token, Student student,
			String groupId) throws InvalidTokenException,
			StudentNotFoundException, GroupNotFoundException,
			GroupEmptyException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDocumentToGroup(LoginToken token, Document document,
			String groupId) throws InvalidTokenException,
			DocumentNotFoundException, GroupNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeDocumentFromGroup(LoginToken token, Document document,
			String groupId) throws InvalidTokenException,
			DocumentNotFoundException, GroupNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getStudentsForGroup(LoginToken token, String groupId)
			throws InvalidTokenException, GroupNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getAllStudents(LoginToken token)
			throws InvalidTokenException {
		Query q = entityManager.createQuery("SELECT OBJECT(s) FROM Student s");
		List<Student> students = q.getResultList();
		return students;
	}

}
