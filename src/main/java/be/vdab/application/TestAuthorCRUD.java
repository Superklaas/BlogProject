package be.vdab.application;

import be.vdab.domain.Author;
import be.vdab.repository.AuthorRepository;
import be.vdab.service.AuthorService;

import java.util.List;

public class TestAuthorCRUD {
    public static void main(String[] args) {

        AuthorRepository authorRepository = new AuthorRepository();
        AuthorService authorService = new AuthorService();
        authorService.setAuthorRepository(authorRepository);

        // test createAuthor
        Author klaas = new Author("Klaas","Belgium",35);
        //authorService.createAuthor(klaas);

        // test readListAuthor
        List<Author> authorList = authorService.readListAuthors("klaas");
        for (Author author : authorList) {
            System.out.println(author.toString());
        }

        // test updateAuthor
        Author author = authorList.get(0);
        author.setAge(36);
        //authorService.updateAuthor(author);

        // test deleteAuthor
        //authorService.deleteAuthor(author);

    }
}
