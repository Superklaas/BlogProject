package be.vdab.service;

import be.vdab.domain.Author;
import be.vdab.repository.AuthorRepository;

import java.util.List;

public class AuthorService {

    AuthorRepository authorRepository;

    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void createAuthor(Author author) {
        authorRepository.createAuthor(author);
    }

    public Author readOneAuthor(int id) {
        Author author = authorRepository.readOneAuthor(id);
        return author;
    }

    public List<Author> readListAuthors(String name) {
        List<Author> authors = authorRepository.readListAuthors(name);
        return authors;
    }

    public void updateAuthor(Author author) {
        authorRepository.updateAuthor(author);
    }

    public void deleteAuthor(Author author) {
        authorRepository.deleteAuthor(author);
    }

}
