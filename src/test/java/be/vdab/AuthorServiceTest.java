/*
package be.vdab;

import be.vdab.domain.Author;
import be.vdab.repository.AuthorRepository;
import be.vdab.service.AuthorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthorServiceTest {

    EntityManager entityManager;
    AuthorRepository authorRepository;
    AuthorService authorService;
    Author expectedAuthor;

    @BeforeEach
    void setUp() {

        entityManager = mock(EntityManager.class);

        authorRepository = new AuthorRepository();
        authorRepository.setEntityManager(entityManager);

        authorService = new AuthorService();
        authorService.setAuthorRepository(authorRepository);

        expectedAuthor = new Author("Klaas","Belgium",36);

    }

*/
/*    @AfterEach
    void tearDown() {
        entityManager.close();
    }*//*


    @Test
    void testCreate() {
        fail("not yet implemented");
    }

    @Test
    void readOneAuthor() {
        when(entityManager.find(Author.class,1)).thenReturn(expectedAuthor);
        Author actualAuthor = authorService.readOneAuthor(1);
        assertEquals(expectedAuthor,actualAuthor);
    }

    @Test
    void testUpdate() {
        fail("not yet implemented");
    }

    @Test
    void testDelete() {
        fail("not yet implemented");
    }

}

*/
