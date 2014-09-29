package ${package}.demo.crud.dao;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ${package}.demo.crud.entity.User;
import org.powermock.reflect.Whitebox;

/**
 * User DAO Test.
 * @author <Author name>
 */
public class UserDaoTest {
	/**
	 * DAO to be tested.
	 */
	private UserDao userDao;
	
	/**
	 * DAO Setup.
	 * @throws Exception Generic exception.
	 */
	@Before
	public void setUp() throws Exception {
		userDao = new UserDao();
	}

	/**
	 * DAO Tear down.
	 * @throws Exception Generic exception.
	 */
	@After
	public void tearDown() throws Exception {
		userDao = null;
	}

	/**
	 * Find all test.
	 */
	@Test
	public void testFindAll() {
		/*
		 * OBSERVATION:
		 * The DAO pattern is a integration layer pattern, so isn't correct mock the entity manager
		 * associated. This test is a just example, but the real test must be implemented properly.
		 * Arquillian is the framework recommended for integration tests.
		 */
		@SuppressWarnings("unchecked")
		TypedQuery<User> mockQuery = EasyMock.createNiceMock(TypedQuery.class);
		EntityManager mockEntityManager = EasyMock.createNiceMock(EntityManager.class);
		
		EasyMock.expect(mockQuery.getResultList()).
			andReturn(Collections.singletonList(new User())).
			anyTimes();
		EasyMock.expect(mockEntityManager.createNamedQuery(User.QUERY_FIND_ALL, User.class)).
			andReturn(mockQuery).
			anyTimes();
		
		EasyMock.replay(mockQuery, mockEntityManager);
		
		Whitebox.setInternalState(userDao, "entityManager", mockEntityManager);

		List<User> all = userDao.findAll();
		assertEquals(1, all.size());
	}

	/**
	 * Find by login test.
	 */
	@Test
	public void testFindByLogin() {
		/*
		 * OBSERVATION:
		 * The DAO pattern is a integration layer pattern, so isn't correct mock the entity manager
		 * associated. This test is a just example, but the real test must be implemented properly.
		 * Arquillian is the framework recommended for integration tests.
		 */
		User mockUser = new User();
		mockUser.setLogin("logintest");
		
		@SuppressWarnings("unchecked")
		TypedQuery<User> mockQuery = EasyMock.createNiceMock(TypedQuery.class);
		EntityManager mockEntityManager = EasyMock.createNiceMock(EntityManager.class);
		
		EasyMock.expect(mockQuery.getResultList()).
			andReturn(Collections.singletonList(mockUser)).
			anyTimes();
		EasyMock.expect(mockEntityManager.createNamedQuery(User.QUERY_FIND_BY_LOGIN, User.class)).
			andReturn(mockQuery).
			anyTimes();
		
		EasyMock.replay(mockQuery, mockEntityManager);
		
		Whitebox.setInternalState(userDao, "entityManager", mockEntityManager);
		
		List<User> all = userDao.findByLogin("logintest");
		assertEquals(1, all.size());
	}

	/**
	 * Find by ID test.
	 */
	@Test
	public void testFindById() {
		/*
		 * OBSERVATION:
		 * The DAO pattern is a integration layer pattern, so isn't correct mock the entity manager
		 * associated. This test is a just example, but the real test must be implemented properly.
		 * Arquillian is the framework recommended for integration tests.
		 */
		User mockUser = new User();
		Whitebox.setInternalState(mockUser, "id", Long.valueOf(1L));
		
		EntityManager mockEntityManager = EasyMock.createNiceMock(EntityManager.class);

		EasyMock.expect(mockEntityManager.find(User.class, Long.valueOf(1L))).
			andReturn(mockUser).
			anyTimes();
		
		EasyMock.replay(mockEntityManager);
		
		Whitebox.setInternalState(userDao, "entityManager", mockEntityManager);
		
		User user = userDao.findById(Long.valueOf(1L));
		assertEquals(mockUser, user);
	}
}
